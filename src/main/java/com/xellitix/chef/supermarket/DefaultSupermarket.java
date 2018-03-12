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
  private final URI endpoint;

  /**
   * Constructor.
   *
   * @param endpoint The endpoint.
   */
  @Inject
  DefaultSupermarket(@Assisted final URI endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * Gets the endpoint.
   *
   * @return The endpoint.
   */
  @Override
  public URI getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the API endpoint.
   *
   * @param apiVersion The {@link ApiVersion}.
   * @return The API endpoint.
   */
  @Override
  public URI getApiEndpoint(final ApiVersion apiVersion) {
    final String apiPath = String.format("/api/%s", apiVersion.toString());
    return endpoint.resolve(apiPath);
  }
}
