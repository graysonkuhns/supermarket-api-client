package com.xellitix.chef.supermarket.api.request.cookbookinfo;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * Default {@link CookbookInfoRequest} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbookInfoRequest implements CookbookInfoRequest {

  // Properties
  private final String cookbookName;

  /**
   * Constructor.
   *
   * @param cookbookName The cookbook name.
   */
  @Inject
  DefaultCookbookInfoRequest(@Assisted final String cookbookName) {
    this.cookbookName = cookbookName;
  }

  /**
   * Gets the cookbook name.
   *
   * @return The cookbook name.
   */
  @Override
  public String getCookbookName() {
    return cookbookName;
  }
}
