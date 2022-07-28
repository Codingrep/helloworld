package ca.sunlife.web.apps.web_apps_helloworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for BuildVersion
 *
 */
public class BuildVersionTest {

	/**
	 * Verifies BuildVersion is set
	 */
	@Test
	public void testBuildVersion() {
		Assert.assertNotNull(BuildVersion.VERSION);
	}
}
