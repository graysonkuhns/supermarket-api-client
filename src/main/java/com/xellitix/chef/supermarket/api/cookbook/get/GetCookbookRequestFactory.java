package com.xellitix.chef.supermarket.api.cookbook.get;

/**
 * {@link GetCookbookRequest} factory.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookRequestFactory {

  /**
   * Creates a {@link GetCookbookRequest}.
   *
   * @param cookbookName The cookbook name.
   * @return The {@link GetCookbookRequest}.
   */
  GetCookbookRequest create(String cookbookName);
}
