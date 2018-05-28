package com.xellitix.chef.supermarket.api.cookbook.get;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * {@link GetCookbookResponse} parser.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookResponseParser {

  /**
   * Parses the {@link GetCookbookResponse}.
   *
   * @param response The response data.
   * @return The {@link GetCookbookResponse}.
   */
  GetCookbookResponse parse(JsonNode response);
}
