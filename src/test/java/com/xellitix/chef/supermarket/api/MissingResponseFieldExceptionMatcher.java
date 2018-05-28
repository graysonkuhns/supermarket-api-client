package com.xellitix.chef.supermarket.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class MissingResponseFieldExceptionMatcher extends TypeSafeMatcher<MissingResponseFieldException> {

  enum Mode {
    FIELD,
    RESPONSE
  }

  // Properties
  private final Mode mode;

  private final String expectedField;
  private String actualField;

  private final JsonNode expectedResponse;
  private JsonNode actualResponse;

  /**
   * Constructor.
   *
   * @param expectedField The expectedField.
   */
  private MissingResponseFieldExceptionMatcher(final String expectedField) {
    this.mode = Mode.FIELD;
    this.expectedField = expectedField;
    this.expectedResponse = null;
  }

  /**
   * Constructor.
   *
   * @param expectedResponse The expectedResponse.
   */
  private MissingResponseFieldExceptionMatcher(final JsonNode expectedResponse) {
    this.mode = Mode.RESPONSE;
    this.expectedField = null;
    this.expectedResponse = expectedResponse;
  }

  @Override
  protected boolean matchesSafely(final MissingResponseFieldException ex) {
    switch (mode) {
      case FIELD:
        return field_matchesSafely(ex);
      case RESPONSE:
        return response_matchesSafely(ex);
      default:
        return false;
    }
  }

  @Override
  public void describeTo(final Description description) {
    switch (mode) {
      case FIELD:
        field_describeTo(description);
      case RESPONSE:
        response_describeTo(description);
    }
  }

  // Field validation
  private boolean field_matchesSafely(final MissingResponseFieldException ex) {
    // Store the actual field to be used in the description
    actualField = ex.getField();

    // Check for a match
    return actualField.equals(expectedField);
  }

  private void field_describeTo(final Description description) {
    description
        .appendValue(expectedField)
        .appendText(" was expected. ")
        .appendValue(actualField)
        .appendText(" was found.");
  }

  // Response validation
  private boolean response_matchesSafely(final MissingResponseFieldException ex) {
    // Store the actual response to be used in the description
    actualResponse = ex.getResponse();

    // Check for a match
    return actualResponse.equals(expectedResponse);
  }

  private void response_describeTo(final Description description) {
    description
        .appendValue(expectedResponse)
        .appendText(" was expected. ")
        .appendValue(actualResponse)
        .appendText(" was found.");
  }

  /**
   * Creates a {@link MissingResponseFieldExceptionMatcher}.
   *
   * @param field The expected expectedField.
   * @return The {@link MissingResponseFieldExceptionMatcher}.
   */
  public static MissingResponseFieldExceptionMatcher hasField(final String field) {
    return new MissingResponseFieldExceptionMatcher(field);
  }

  /**
   * Creates a {@link MissingResponseFieldExceptionMatcher}.
   *
   * @param response The expected expectedResponse.
   * @return The {@link MissingResponseFieldExceptionMatcher}.
   */
  public static MissingResponseFieldExceptionMatcher hasResponse(final JsonNode response) {
    return new MissingResponseFieldExceptionMatcher(response);
  }
}
