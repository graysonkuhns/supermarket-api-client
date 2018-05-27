package com.xellitix.chef.supermarket.api.cookbooks;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * Cookbooks API Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class CookbooksApiModule extends AbstractModule {

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
