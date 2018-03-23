package com.xellitix.chef.cookbook;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link Cookbook} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class CookbookModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    // Cookbook factory
    install(new FactoryModuleBuilder()
        .implement(Cookbook.class, DefaultCookbook.class)
        .build(CookbookFactory.class));
  }
}
