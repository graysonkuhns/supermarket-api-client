package com.xellitix.chef.supermarket.api;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Optional;

/**
 * Malformed response exception.
 *
 * @author Grayson Kuhns
 */
public class MalformedResponseException extends RuntimeException {

  // Properties
  private final JsonNode response;

  /**
   * Constructor.
   *
   * @param message The message.
   * @param response The response data.
   */
  public MalformedResponseException(final String message, final JsonNode response) {
    super(message);
    this.response = response;
  }

  /**
   * Gets the response.
   *
   * @return The response.
   */
  public JsonNode getResponse() {
    return response;
  }
}
