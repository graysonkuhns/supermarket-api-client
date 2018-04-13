package com.xellitix.chef.supermarket;

import com.google.inject.assistedinject.Assisted;
import java.net.URI;
import javax.inject.Inject;

/**
 * Default {@link Supermarket} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultSupermarket implements Supermarket {

  // Properties
  private final URI apiEndpoint;

  /**
   * Constructor.
   *
   * @param apiEndpoint The API endpoint.
   */
  @Inject
  DefaultSupermarket(@Assisted final URI apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }

  /**
   * Gets the API endpoint.
   *
   * @return The API endpoint.
   */
  @Override
  public URI getApiEndpoint() {
    return apiEndpoint;
  }
}
