package SteamStoreAutomation.Steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import SteamStoreAutomation.pages.HeaderPage;
import SteamStoreAutomation.pages.HomePage;
import SteamStoreAutomation.pages.SearchPage;
import SteamStoreAutomation.utilities.Browser;



public class OrderTest {
	
	@Before
	public void setUp() {
		Browser.openBrowser();
	}
	
	@Test
	public void productOrdering() {
		Browser.openURL();
		//HeaderPage.selectFromStoreMenu("НОВИНИ");
		HomePage.search("cs");
		SearchPage.sorting("Име");
	}
	/*
	@After
	public void thearDown() {
		Browser.quit();
	}
	*/

}
