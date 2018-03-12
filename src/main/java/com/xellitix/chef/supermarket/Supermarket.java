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
   * Gets the endpoint.
   *
   * @return The endpoint.
   */
  URI getEndpoint();

  /**
   * Gets the API endpoint.
   *
   * @param apiVersion The {@link ApiVersion}.
   * @return The API endpoint.
   */
  URI getApiEndpoint(ApiVersion apiVersion);
}
