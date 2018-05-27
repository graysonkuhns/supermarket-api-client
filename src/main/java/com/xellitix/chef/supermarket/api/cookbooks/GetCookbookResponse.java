package com.xellitix.chef.supermarket.api.cookbooks;

import com.xellitix.chef.cookbook.Cookbook;
import java.io.Serializable;

/**
 * {@link Cookbook} information response.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookResponse extends Serializable {

  /**
   * Gets the {@link Cookbook} name.
   *
   * @return The {@link Cookbook} name.
   */
  String getName();

  /**
   * Gets the {@link Cookbook} maintainer.
   *
   * @return The {@link Cookbook} maintainer.
   */
  String getMaintainer();

  /**
   * Gets the {@link Cookbook} description.
   *
   * @return The {@link Cookbook} description.
   */
  String getDescription();
}
