package com.xellitix.chef.supermarket;

import java.io.Serializable;
import java.net.URI;

/**
 * Chef Supermarket model.
 *
 * @author Grayson Kuhns
 */
public interface Supermarket extends Serializable {

  /**
   * Gets the API endpoint.
   *
   * @return The API endpoint.
   */
  URI getApiEndpoint();
}
