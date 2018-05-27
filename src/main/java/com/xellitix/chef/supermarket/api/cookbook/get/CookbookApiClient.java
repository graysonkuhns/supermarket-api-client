package com.xellitix.chef.supermarket.api.cookbook.get;

import com.xellitix.chef.supermarket.Supermarket;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * {@link Cookbook} API client.
 *
 * @author Grayson Kuhns
 */
public interface CookbookApiClient {

  /**
   * Executes a {@link GetCookbookRequest}.
   *
   * @param request The {@link GetCookbookRequest}.
   * @param supermarket The {@link Supermarket}.
   * @return The {@link GetCookbookResponse}.
   */
  GetCookbookResponse execute(GetCookbookRequest request, Supermarket supermarket);
}
