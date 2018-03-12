package com.xellitix.chef.supermarket;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link SupermarketModule} test case.
 *
 * @author Grayson Kuhns
 */
public class SupermarketModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new SupermarketModule());

  @Test
  public void provision__SupermarketFactory__Test() {
    injector.getInstance(SupermarketFactory.class);
  }
}
