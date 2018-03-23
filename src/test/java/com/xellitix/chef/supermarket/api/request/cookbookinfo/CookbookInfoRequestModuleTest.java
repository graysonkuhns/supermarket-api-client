package com.xellitix.chef.supermarket.api.request.cookbookinfo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link CookbookInfoRequestModule} test case.
 *
 * @author Grayson Kuhns
 */
public class CookbookInfoRequestModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new CookbookInfoRequestModule());

  @Test
  public void provision__CookbookInfoRequestFactory__Test() {
    injector.getInstance(CookbookInfoRequestFactory.class);
  }
}
