package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import com.xellitix.chef.supermarket.Supermarket;
import java.io.IOException;
import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Default {@link CookbookInfoApiClient}.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbookInfoApiClient implements CookbookInfoApiClient {

  // JSON Keys
  private static final String KEY_NAME = "name";
  private static final String KEY_MAINTAINER = "maintainer";
  private static final String KEY_DESCRIPTION = "description";

  // Dependencies
  private final CookbookInfoResponseFactory responseFactory;

  /**
   * Constructor.
   *
   * @param responseFactory The {@link CookbookInfoResponseFactory}.
   */
  @Inject
  DefaultCookbookInfoApiClient(final CookbookInfoResponseFactory responseFactory) {
    this.responseFactory = responseFactory;
  }

  /**
   * Gets cookbook information.
   *
   * @param request The {@link CookbookInfoRequest}.
   * @return The {@link CookbookInfoResponse}.
   */
  @Override
  public CookbookInfoResponse getCookbookInfo(final CookbookInfoRequest request, final Supermarket supermarket) {
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

    // Request the cookbook information
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

  private CookbookInfoResponse parseCookbookInfoResponse(JsonNode response) {
    String name = response.asText(KEY_NAME);
    String maintainer = response.asText(KEY_MAINTAINER);
    String description = response.asText(KEY_DESCRIPTION);

    return responseFactory.create(name, maintainer, description);
  }
}
