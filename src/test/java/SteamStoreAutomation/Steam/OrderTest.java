package SteamStoreAutomation.Steam;

import org.junit.Before;
import org.junit.Test;

import SteamStoreAutomation.pages.HeaderPage;
import SteamStoreAutomation.utilities.Browser;



public class OrderTest {
	
	@Before
	public void setUp() {
		Browser.openBrowser();
	}
	
	@Test
	public void productOrdering() {
		Browser.openURL();
		HeaderPage.selectfromStoreMenu("Куратори");
		
	}
	/*
	@After
	public void thearDown() {
		Browser.quit();
	}
	*/

}
