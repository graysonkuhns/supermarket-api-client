package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.google.inject.assistedinject.Assisted;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * {@link CookbookInfoResponse} factory.
 *
 * @author Grayson Kuhns
 */
public interface CookbookInfoResponseFactory {

  /**
   * Creates a {@link CookbookInfoResponse}.
   *
   * @param name The {@link Cookbook} name.
   * @param maintainer The {@link Cookbook} maintainer.
   * @param description The {@link Cookbook} description.
   * @return The {@link CookbookInfoResponse}.
   */
  CookbookInfoResponse create(
      @Assisted("name") final String name,
      @Assisted("maintainer") final String maintainer,
      @Assisted("description") final String description);
}
