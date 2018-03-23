package com.xellitix.chef.supermarket.api.request.cookbookinfo;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link CookbookInfoRequest} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class CookbookInfoRequestModule extends AbstractModule {

  /**
   * Configures the module.
   *
   * @author Grayson Kuhns
   */
  @Override
  protected void configure() {
    install(new FactoryModuleBuilder()
      .implement(CookbookInfoRequest.class, DefaultCookbookInfoRequest.class)
      .build(CookbookInfoRequestFactory.class));
  }
}
