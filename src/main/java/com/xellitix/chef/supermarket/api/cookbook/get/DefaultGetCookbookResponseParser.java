package com.xellitix.chef.supermarket.api.cookbook.get;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.xellitix.chef.supermarket.api.MalformedResponseException;
import com.xellitix.chef.supermarket.api.MissingResponseFieldException;

/**
 * Default {@link GetCookbookResponseParser} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultGetCookbookResponseParser implements GetCookbookResponseParser {

  // Message templates

  // Response keys
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
  DefaultGetCookbookResponseParser(final GetCookbookResponseFactory responseFactory) {
    this.responseFactory = responseFactory;
  }

  /**
   * Parses the {@link GetCookbookResponse}.
   *
   * @param response The response data.
   * @return The {@link GetCookbookResponse}.
   */
  @Override
  public GetCookbookResponse parse(final JsonNode response) {
    return responseFactory.create(
        getValue(KEY_NAME, response),
        getValue(KEY_MAINTAINER, response),
        getValue(KEY_DESCRIPTION, response)
    );
  }

  private String getValue(final String key, final JsonNode response) {
    JsonNode containerNode = response.get(key);

    if (containerNode == null) {
      throw new MissingResponseFieldException(key, response);
    }

    return containerNode.asText();
  }
}
