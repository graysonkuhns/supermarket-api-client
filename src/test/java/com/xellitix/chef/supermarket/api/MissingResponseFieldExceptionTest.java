package com.xellitix.chef.supermarket.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link MissingResponseFieldException} test case.
 *
 * @author Grayson Kuhns
 */
public class MissingResponseFieldExceptionTest {

  // Constants
  private static final String FIELD = "name";
  private static final String MESSAGE = "Expected response field \"name\" to exist";

  // Fixtures
  private JsonNode response;
  private MissingResponseFieldException exception;

  @Test
  public void getMessageTest() {
    assertThat(exception
        .getMessage())
        .isNotNull()
        .isEqualTo(MESSAGE);
  }

  @Test
  public void getFieldTest() {
    assertThat(exception
        .getField())
        .isNotNull()
        .isEqualTo(FIELD);
  }

  @Test
  public void getResponseTest() {
    assertThat(exception
        .getResponse())
        .isNotNull()
        .isEqualTo(response);
  }

  @Before
  public void setUp() {
    // Response mocking
    response = mock(JsonNode.class);

    // Create the exception
    exception = new MissingResponseFieldException(FIELD, response);
  }
}
