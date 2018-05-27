package com.xellitix.chef.supermarket.api.cookbook.get;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link CookbookApiModule} test case.
 *
 * @author Grayson Kuhns
 */
public class CookbookApiModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new CookbookApiModule());

  @Test
  public void provision__CookbookInfoRequestFactory__Test() {
    injector.getInstance(GetCookbookRequestFactory.class);
  }

  @Test
  public void provision__CookbookInfoResponseFactory__Test() {
    injector.getInstance(GetCookbookResponseFactory.class);
  }
}
