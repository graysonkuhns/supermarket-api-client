package com.xellitix.chef.supermarket;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultSupermarket} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultSupermarketTest {

  // Constants
  private static final String API_ENDPOINT = "https://supermarket.chef.io/api/v1";

  // Fixtures
  private URI apiEndpoint;
  private DefaultSupermarket supermarket;

  @Test
  public void getApiEndpoint__Test() {
    URI apiEndpoint = supermarket.getApiEndpoint();

    assertThat(apiEndpoint)
        .isNotNull();
    assertThat(apiEndpoint
        .toString())
        .isEqualTo(API_ENDPOINT);
  }

  @Before
  public void setUp() throws Exception {
    // Create the apiEndpoint
    apiEndpoint = new URI(API_ENDPOINT);

    // Create the supermarket
    supermarket = new DefaultSupermarket(apiEndpoint);
  }
}
