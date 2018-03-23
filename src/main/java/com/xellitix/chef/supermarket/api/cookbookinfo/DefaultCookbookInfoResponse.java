package com.xellitix.chef.supermarket.api.cookbookinfo;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.chef.cookbook.Cookbook;

/**
 * Default {@link CookbookInfoResponse} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbookInfoResponse implements CookbookInfoResponse {

  // Properties
  private final String name;
  private final String maintainer;
  private final String description;

  /**
   * Constructor.
   *
   * @param name The {@link Cookbook} name.
   * @param maintainer The {@link Cookbook} maintainer.
   * @param description The {@link Cookbook} description.
   */
  @Inject
  DefaultCookbookInfoResponse(
      @Assisted("name") final String name,
      @Assisted("maintainer") final String maintainer,
      @Assisted("description") final String description) {

    this.name = name;
    this.maintainer = maintainer;
    this.description = description;
  }

  /**
   * Gets the {@link Cookbook} name.
   *
   * @return The {@link Cookbook} name.
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Gets the {@link Cookbook} maintainer.
   *
   * @return The {@link Cookbook} maintainer.
   */
  @Override
  public String getMaintainer() {
    return maintainer;
  }

  /**
   * Gets the {@link Cookbook} description.
   *
   * @return The {@link Cookbook} description.
   */
  @Override
  public String getDescription() {
    return description;
  }
}
