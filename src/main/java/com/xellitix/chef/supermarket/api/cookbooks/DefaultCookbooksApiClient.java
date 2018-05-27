package com.xellitix.chef.supermarket.api.cookbooks;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.xellitix.chef.supermarket.Supermarket;
import java.io.IOException;
import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Default {@link CookbooksApiClient}.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbooksApiClient implements CookbooksApiClient {

  // JSON Keys
  private static final String KEY_NAME = "name";
  private static final String KEY_MAINTAINER = "maintainer";
  private static final String KEY_DESCRIPTION = "description";

  // Dependencies
  private final GetCookbookResponseFactory responseFactory;

  /**
   * Constructor.
   *
   * @param responseFactory The {@link GetCookbookResponseFactory}.
   */
  @Inject
  DefaultCookbooksApiClient(final GetCookbookResponseFactory responseFactory) {
    this.responseFactory = responseFactory;
  }

  /**
   * Executes a {@link GetCookbookRequest}.
   *
   * @param request The {@link GetCookbookRequest}.
   * @param supermarket The {@link Supermarket}.
   * @return The {@link GetCookbookResponse}.
   */
  @Override
  public GetCookbookResponse execute(final GetCookbookRequest request, final Supermarket supermarket) {
    JsonNode cookbookInfo = requestCookbookInfo(request.getCookbookName(), supermarket);
    return parseCookbookInfoResponse(cookbookInfo);
  }

  private JsonNode requestCookbookInfo(final String cookbookName, final Supermarket supermarket) {
    // Create the HTTP client
    CloseableHttpClient client = HttpClients.createDefault();

    // Construct the request URL
    URI requestUri = supermarket
        .getApiEndpoint()
        .resolve(String.format("cookbooks/%s", cookbookName));

    // Create the request model
    HttpGet request = new HttpGet(requestUri);

    // Request the cookbooks information
    CloseableHttpResponse response;
    try {
      response = client.execute(request);
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }

    // Create JsonNode from response
    ObjectMapper mapper = new ObjectMapper();

    try {
      return mapper.readTree(response.toString());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

  private GetCookbookResponse parseCookbookInfoResponse(JsonNode response) {
    String name = response.asText(KEY_NAME);
    String maintainer = response.asText(KEY_MAINTAINER);
    String description = response.asText(KEY_DESCRIPTION);

    return responseFactory.create(name, maintainer, description);
  }
}
