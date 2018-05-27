package com.xellitix.chef.supermarket.api.cookbooks;

import com.xellitix.chef.supermarket.Supermarket;

/**
 * Cookbooks API client.
 *
 * @author Grayson Kuhns
 */
public interface CookbooksApiClient {

  /**
   * Executes a {@link GetCookbookRequest}.
   *
   * @param request The {@link GetCookbookRequest}.
   * @param supermarket The {@link Supermarket}.
   * @return The {@link GetCookbookResponse}.
   */
  GetCookbookResponse execute(GetCookbookRequest request, Supermarket supermarket);
}
