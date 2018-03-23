package com.xellitix.chef.supermarket.api.cookbookinfo;

import java.io.Serializable;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * {@link Cookbook} information request.
 *
 * @author Grayson Kuhns
 */
public interface CookbookInfoRequest extends Serializable {

  /**
   * Gets the cookbook name.
   *
   * @return The cookbook name.
   */
  String getCookbookName();
}
