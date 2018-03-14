package com.xellitix.chef.cookbook;

import com.xellitix.commons.semver.SemanticVersion;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * {@link DefaultCookbook} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultCookbookTest {

  // Constants
  private static final String NAME = "cookbook";

  // Fixtures
  private SemanticVersion version;
  private DefaultCookbook cookbook;

  @Test
  public void getNameTest() {
    assertThat(cookbook
        .getName())
        .isNotNull()
        .isEqualTo(NAME);
  }

  @Test
  public void getVersionTest() {
    assertThat(cookbook
        .getVersion())
        .isNotNull()
        .isEqualTo(version);
  }

  @Before
  public void setUp() {
    // Version mocking
    version = mock(SemanticVersion.class);

    // Create the cookbook
    cookbook = new DefaultCookbook(NAME, version);
  }
}
