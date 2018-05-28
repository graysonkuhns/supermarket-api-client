package com.xellitix.chef.supermarket.api.cookbook.get;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.xellitix.chef.supermarket.api.MissingResponseFieldException;
import com.xellitix.chef.supermarket.api.MissingResponseFieldExceptionMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * {@link DefaultGetCookbookResponseParser} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultGetCookbookResponseParserTest {

  // Response keys
  private static final String KEY_NAME = "name";
  private static final String NAME = "awesome_cookbook";

  private static final String KEY_MAINTAINER = "maintainer";
  private static final String MAINTAINER = "xellitix";

  private static final String KEY_DESCRIPTION = "description";
  private static final String DESCRIPTION = "Configures awesome things";

  // Rules
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // Fixtures
  private ObjectNode responseData;

  private GetCookbookResponse response;
  private GetCookbookResponseFactory responseFactory;

  private DefaultGetCookbookResponseParser responseParser;

  @Test
  public void responseIsParsedCorrectly__WhenAllFieldsArePresent__Test() {
    assertThat(responseParser
        .parse(responseData))
        .isNotNull()
        .isEqualTo(response);

    verify(responseFactory).create(
        eq(NAME),
        eq(MAINTAINER),
        eq(DESCRIPTION));
  }

  @Test
  public void exceptionIsThrown__WhenFieldIsMissing__Test() {
    // Describe the exception to expect
    thrown.expect(MissingResponseFieldException.class);
    thrown.expect(MissingResponseFieldExceptionMatcher.hasField(KEY_MAINTAINER));
    thrown.expect(MissingResponseFieldExceptionMatcher.hasResponse(responseData));

    // Prepare the response data
    responseData.remove(KEY_MAINTAINER);

    // Attempt to parse the response
    responseParser.parse(responseData);
  }

  @Before
  public void setUp() {
    // Create response data
    responseData = new ObjectMapper().createObjectNode();
    responseData.put(KEY_NAME, NAME);
    responseData.put(KEY_MAINTAINER, MAINTAINER);
    responseData.put(KEY_DESCRIPTION, DESCRIPTION);

    // Response factory mocking
    response = mock(GetCookbookResponse.class);
    responseFactory = mock(GetCookbookResponseFactory.class);
    doReturn(response)
        .when(responseFactory)
        .create(anyString(), anyString(), anyString());

    // Create the response parser
    responseParser = new DefaultGetCookbookResponseParser(responseFactory);
  }
}
