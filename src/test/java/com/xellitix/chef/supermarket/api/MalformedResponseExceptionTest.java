package com.xellitix.chef.supermarket.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link MalformedResponseException} test case.
 *
 * @author Grayson Kuhns
 */
public class MalformedResponseExceptionTest {

  // Constants
  private static final String MESSAGE = "Expected field to exist";

  // Fixtures
  private JsonNode response;
  private MalformedResponseException exception;

  @Test
  public void roundTrip__Test() {
    MalformedResponseException exception = new MalformedResponseException(MESSAGE, response);

    assertThat(exception
        .getMessage())
        .isNotNull()
        .isEqualTo(MESSAGE);

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
    exception = new MalformedResponseException(MESSAGE, response);
  }
}
