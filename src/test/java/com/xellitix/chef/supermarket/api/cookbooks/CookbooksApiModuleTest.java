package com.xellitix.chef.supermarket.api.cookbooks;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link CookbooksApiModule} test case.
 *
 * @author Grayson Kuhns
 */
public class CookbooksApiModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new CookbooksApiModule());

  @Test
  public void provision__CookbookInfoRequestFactory__Test() {
    injector.getInstance(GetCookbookRequestFactory.class);
  }

  @Test
  public void provision__CookbookInfoResponseFactory__Test() {
    injector.getInstance(GetCookbookResponseFactory.class);
  }
}
