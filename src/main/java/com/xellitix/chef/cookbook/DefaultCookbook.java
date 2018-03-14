package com.xellitix.chef.cookbook;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.semver.SemanticVersion;

/**
 * Default {@link Cookbook} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbook implements Cookbook {

  // Properties
  private final String name;
  private final SemanticVersion version;

  /**
   * Constructor.
   *
   * @param name The name.
   * @param version The version.
   */
  @Inject
  DefaultCookbook(
      @Assisted final String name,
      @Assisted final SemanticVersion version) {

    this.name = name;
    this.version = version;
  }

  /**
   * Gets the name.
   *
   * @return The name.
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Gets the version.
   *
   * @return The version.
   */
  @Override
  public SemanticVersion getVersion() {
    return version;
  }
}
