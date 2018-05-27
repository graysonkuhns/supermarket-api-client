package com.xellitix.chef.supermarket.api.cookbook.get;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * Default {@link GetCookbookRequest} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultGetCookbookRequest implements GetCookbookRequest {

  // Properties
  private final String cookbookName;

  /**
   * Constructor.
   *
   * @param cookbookName The cookbook name.
   */
  @Inject
  DefaultGetCookbookRequest(@Assisted final String cookbookName) {
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
