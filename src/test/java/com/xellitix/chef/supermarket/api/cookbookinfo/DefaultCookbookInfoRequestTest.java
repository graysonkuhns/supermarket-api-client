package com.xellitix.chef.supermarket.api.cookbookinfo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultCookbookInfoRequest} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbookInfoRequestTest {

  // Constants
  private static final String COOKBOOK_NAME = "awesome_cookbook";

  // Fixtures
  private DefaultCookbookInfoRequest request;

  @Test
  public void getCookbookName__Test() {
    assertThat(request
        .getCookbookName())
        .isNotNull()
        .isEqualTo(COOKBOOK_NAME);
  }

  @Before
  public void setUp() {
    request = new DefaultCookbookInfoRequest(COOKBOOK_NAME);
  }
}
