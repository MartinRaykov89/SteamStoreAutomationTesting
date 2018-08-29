package SteamStoreAutomation.pages;

import org.openqa.selenium.By;

import SteamStoreAutomation.utilities.Browser;

public class BundlePage {
	
	private static By inCartButton = By.xpath("//*[@href=\"https://store.steampowered.com/cart/\"]");
	
	public static void addInCart () {
		Browser.driver.findElement(inCartButton).click();
	}

}
