package com.xellitix.chef.cookbook;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link CookbookModule} test case.
 *
 * @author Grayson Kuhns
 */
public class CookbookModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new CookbookModule());

  @Test
  public void provision__CookbookFactory__Test() {
    injector.getInstance(CookbookFactory.class);
  }
}
