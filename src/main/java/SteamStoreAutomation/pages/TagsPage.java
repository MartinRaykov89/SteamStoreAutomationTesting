
package SteamStoreAutomation.pages;

import org.openqa.selenium.By;

import SteamStoreAutomation.utilities.Browser;

public class TagsPage {
	
	private static By newAndTrending = By.id("tab_select_NewReleases");
	private static By topSelling = By.id("tab_select_TopSellers");
	private static By whatsPopular = By.id("tab_select_ConcurrentUsers");
	private static By upcomming = By.id("tab_select_ComingSoon");
	
	public static void clickOnNewAndTrending() {
		Browser.driver.findElement(newAndTrending).click();
	}
	
	public static void clickOnTopSelling() {
		Browser.driver.findElement(topSelling).click();
	}
	
	public static void clickOnWhatsPopular() {
		Browser.driver.findElement(whatsPopular).click();
	}
	
	public static void clickOnUpcomming() {
		Browser.driver.findElement(upcomming).click();
	}

}
