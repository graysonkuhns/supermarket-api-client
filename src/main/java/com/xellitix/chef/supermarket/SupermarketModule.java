package com.xellitix.chef.supermarket;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link Supermarket} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class SupermarketModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    // Supermarket factory
    install(new FactoryModuleBuilder()
      .implement(Supermarket.class, DefaultSupermarket.class)
      .build(SupermarketFactory.class));
  }
}
