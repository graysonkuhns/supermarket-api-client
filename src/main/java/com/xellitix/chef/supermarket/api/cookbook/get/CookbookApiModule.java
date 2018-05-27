package com.xellitix.chef.supermarket.api.cookbook.get;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * Cookbooks API Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class CookbookApiModule extends AbstractModule {

  /**
   * Configures the module.
   *
   * @author Grayson Kuhns
   */
  @Override
  protected void configure() {
    // GetCookbookRequest factory
    install(new FactoryModuleBuilder()
        .implement(GetCookbookRequest.class, DefaultGetCookbookRequest.class)
        .build(GetCookbookRequestFactory.class));

    // GetCookbookResponse factory
    install(new FactoryModuleBuilder()
        .implement(GetCookbookResponse.class, DefaultGetCookbookResponse.class)
        .build(GetCookbookResponseFactory.class));
  }
}
