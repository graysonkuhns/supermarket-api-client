package com.xellitix.chef.supermarket.api.cookbook.get;

import com.xellitix.chef.cookbook.Cookbook;
import java.io.Serializable;

/**
 * Get {@link Cookbook} request.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookRequest extends Serializable {

  /**
   * Gets the cookbook name.
   *
   * @return The cookbook name.
   */
  String getCookbookName();
}
