package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link CookbookInfoApiModule} test case.
 *
 * @author Grayson Kuhns
 */
public class CookbookInfoApiModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new CookbookInfoApiModule());

  @Test
  public void provision__CookbookInfoRequestFactory__Test() {
    injector.getInstance(CookbookInfoRequestFactory.class);
  }

  @Test
  public void provision__CookbookInfoResponseFactory__Test() {
    injector.getInstance(CookbookInfoResponseFactory.class);
  }
}
