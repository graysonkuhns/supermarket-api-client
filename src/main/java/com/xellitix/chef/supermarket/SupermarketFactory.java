package com.xellitix.chef.supermarket;

import java.net.URI;

/**
 * {@link Supermarket} factory.
 *
 * @author Grayson Kuhns
 */
public interface SupermarketFactory {

  /**
   * Creates a {@link Supermarket}.
   *
   * @param apiEndpoint The API endpoint.
   * @return The {@link Supermarket}.
   */
  Supermarket create(URI apiEndpoint);
}
