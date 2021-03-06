package com.xellitix.chef.supermarket.api.cookbook.get;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultGetCookbookRequest} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultGetCookbookRequestTest {

  // Constants
  private static final String COOKBOOK_NAME = "awesome_cookbook";

  // Fixtures
  private DefaultGetCookbookRequest request;

  @Test
  public void getCookbookName__Test() {
    assertThat(request
        .getCookbookName())
        .isNotNull()
        .isEqualTo(COOKBOOK_NAME);
  }

  @Before
  public void setUp() {
    request = new DefaultGetCookbookRequest(COOKBOOK_NAME);
  }
}
