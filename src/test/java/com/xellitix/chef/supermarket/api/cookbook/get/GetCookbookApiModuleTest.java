package com.xellitix.chef.supermarket.api.cookbook.get;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link GetCookbookApiModule} test case.
 *
 * @author Grayson Kuhns
 */
public class GetCookbookApiModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new GetCookbookApiModule());

  @Test
  public void provision__GetCookbookRequestFactory__Test() {
    injector.getInstance(GetCookbookRequestFactory.class);
  }

  @Test
  public void provision__GetCookbookResponseFactory__Test() {
    injector.getInstance(GetCookbookResponseFactory.class);
  }

  @Test
  public void provision__GetCookbookResponseParser__Test() {
    injector.getInstance(GetCookbookResponseParser.class);
  }
}
