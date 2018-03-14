package com.xellitix.chef.cookbook;

import com.xellitix.commons.semver.SemanticVersion;

/**
 * {@link Cookbook} factory.
 *
 * @author Grayson Kuhns
 */
public interface CookbookFactory {

  /**
   * Creates a {@link Cookbook}.
   *
   * @param name The name.
   * @param version The version.
   * @return The {@link Cookbook}.
   */
  Cookbook create(String name, SemanticVersion version);
}
