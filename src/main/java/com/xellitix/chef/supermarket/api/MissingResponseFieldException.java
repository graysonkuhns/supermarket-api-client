package com.xellitix.chef.supermarket.api;

import com.fasterxml.jackson.databind.JsonNode;

public class MissingResponseFieldException extends MalformedResponseException {

  // Message templates
  private static final String MSG_TEMPLATE = "Expected response field \"%s\" to exist";

  // Properties
  private final String field;

  /**
   * Constructor.
   *
   * @param field The missing field.
   * @param response The response data.
   */
  public MissingResponseFieldException(final String field, final JsonNode response) {
    super(String.format(MSG_TEMPLATE, field), response);
    this.field = field;
  }

  /**
   * Gets the missing field.
   *
   * @return The missing field.
   */
  public String getField() {
    return field;
  }
}
