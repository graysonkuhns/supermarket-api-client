package com.xellitix.chef.supermarket.api.cookbooks;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultGetCookbookResponse} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultGetCookbookResponseTest {

  // Constants
  private static final String NAME = "name";
  private static final String MAINTAINER = "maintainer";
  private static final String DESCRIPTION = "description";

  // Fixtures
  private DefaultGetCookbookResponse response;

  @Test
  public void getName__Test() {
    assertThat(response
        .getName())
        .isNotNull()
        .isEqualTo(NAME);
  }

  @Test
  public void getMaintainer__Test() {
    assertThat(response
        .getMaintainer())
        .isNotNull()
        .isEqualTo(MAINTAINER);
  }

  @Test
  public void getDescription__Test() {
    assertThat(response
        .getDescription())
        .isNotNull()
        .isEqualTo(DESCRIPTION);
  }

  @Before
  public void setUp() {
    response = new DefaultGetCookbookResponse(
        NAME,
        MAINTAINER,
        DESCRIPTION);
  }
}
