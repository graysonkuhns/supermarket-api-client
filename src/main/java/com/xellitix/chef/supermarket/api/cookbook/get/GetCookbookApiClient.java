package com.xellitix.chef.supermarket.api.cookbook.get;

import com.xellitix.chef.supermarket.Supermarket;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * Get {@link Cookbook} API client.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookApiClient {

  /**
   * Executes a {@link GetCookbookRequest}.
   *
   * @param request The {@link GetCookbookRequest}.
   * @param supermarket The {@link Supermarket}.
   * @return The {@link GetCookbookResponse}.
   */
  GetCookbookResponse execute(GetCookbookRequest request, Supermarket supermarket);
}
