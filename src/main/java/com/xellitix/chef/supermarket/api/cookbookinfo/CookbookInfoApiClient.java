package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.xellitix.chef.supermarket.Supermarket;

/**
 * Cookbook information API client.
 *
 * @author Grayson Kuhns
 */
public interface CookbookInfoApiClient {

  /**
   * Gets cookbook information.
   *
   * @param request The {@link CookbookInfoRequest}.
   * @param supermarket The {@link Supermarket}.
   * @return The {@link CookbookInfoResponse}.
   */
  CookbookInfoResponse getCookbookInfo(CookbookInfoRequest request, Supermarket supermarket);
}
