package com.xellitix.chef.cookbook;

import com.xellitix.commons.semver.SemanticVersion;

import java.io.Serializable;

/**
 * Chef Cookbook model.
 *
 * @author Grayson Kuhns
 */
public interface Cookbook extends Serializable {

  /**
   * Gets the name.
   *
   * @return The name.
   */
  String getName();

  /**
   *  Gets the version.
   *
   * @return The version.
   */
  SemanticVersion getVersion();
}
