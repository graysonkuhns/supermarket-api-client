package com.xellitix.chef.supermarket.api.cookbookinfo;

/**
 * {@link CookbookInfoRequest} factory.
 *
 * @author Grayson Kuhns
 */
public interface CookbookInfoRequestFactory {

  /**
   * Creates a {@link CookbookInfoRequest}.
   *
   * @param cookbookName The cookbook name.
   * @return The {@link CookbookInfoRequest}.
   */
  CookbookInfoRequest create(String cookbookName);
}
