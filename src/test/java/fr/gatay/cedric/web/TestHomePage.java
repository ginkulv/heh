package fr.gatay.cedric.web;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
    @Ignore("Don't work for now, CDI does not work yet in tests (needs to be bootstraped)")
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(NewsPage.class);

		//assert rendered page class
		tester.assertRenderedPage(NewsPage.class);
	}
}
