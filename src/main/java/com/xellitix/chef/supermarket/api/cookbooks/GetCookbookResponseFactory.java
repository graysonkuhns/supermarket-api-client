package com.xellitix.chef.supermarket.api.cookbooks;

import com.google.inject.assistedinject.Assisted;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * {@link GetCookbookResponse} factory.
 *
 * @author Grayson Kuhns
 */
public interface GetCookbookResponseFactory {

  /**
   * Creates a {@link GetCookbookResponse}.
   *
   * @param name The {@link Cookbook} name.
   * @param maintainer The {@link Cookbook} maintainer.
   * @param description The {@link Cookbook} description.
   * @return The {@link GetCookbookResponse}.
   */
  GetCookbookResponse create(
      @Assisted("name") final String name,
      @Assisted("maintainer") final String maintainer,
      @Assisted("description") final String description);
}
