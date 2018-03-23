package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * {@link Cookbook} information API Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class CookbookInfoApiModule extends AbstractModule {

  /**
   * Configures the module.
   *
   * @author Grayson Kuhns
   */
  @Override
  protected void configure() {
    // CookbookInfoRequest factory
    install(new FactoryModuleBuilder()
      .implement(CookbookInfoRequest.class, DefaultCookbookInfoRequest.class)
      .build(CookbookInfoRequestFactory.class));

    // CookbookInfoResponse factory
    install(new FactoryModuleBuilder()
      .implement(CookbookInfoResponse.class, DefaultCookbookInfoResponse.class)
      .build(CookbookInfoResponseFactory.class));
  }
}
