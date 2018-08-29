package SteamStoreAutomation.Steam;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import SteamStoreAutomation.pages.HeaderPage;
import SteamStoreAutomation.pages.HomePage;
import SteamStoreAutomation.pages.LeftNavigationContainer;
import SteamStoreAutomation.pages.PurchasePage;
import SteamStoreAutomation.pages.SearchPage;
import SteamStoreAutomation.utilities.Browser;



public class OrderTest {
	
	@Before
	public void setUp() {
		Browser.openBrowser();
	}
	/*
	@Test
	public void productOrdering() {
		Browser.openURL();
		HomePage.search("cs");
		SearchPage.sorting("Име");
		SearchPage.filteringNarrowByTag("Екшъни");
		SearchPage.filteringSelectedTypes("Игри");
		SearchPage.filteringByNumberOfPlayers("Кооперативна игра");
		SearchPage.selectFirstResultFromContainerRows();
		PurchasePage.addSimpleItem();
	}
	*/
	@Test
	public void test() {
		Browser.openURL();
		LeftNavigationContainer.choiceByGerne("Екшъни");
	}
	/*
	@After
	public void thearDown() {
		Browser.quit();
	}
	*/

}
