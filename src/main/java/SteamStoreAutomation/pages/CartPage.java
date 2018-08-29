package SteamStoreAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import SteamStoreAutomation.utilities.Browser;

public class CartPage {
	
	private static JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	
	private static By purchaseForMySelfButton = By.id("btn_purchase_self");
	private static By purchaseAsAGifButton = By.xpath("//*[@class=\"cart_checkout_buttons\"]/a[1]/span");
	private static By continueShoppingButton = By.xpath("//*[@class=\"btn_medium btnv6_blue_hoverfade\"]");
	
	public static void purchaseForMySelf() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(purchaseForMySelfButton));
		Browser.driver.findElement(purchaseForMySelfButton).click();
	}
	
	public static void purchaseAsAGift() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(purchaseAsAGifButton));
		Browser.driver.findElement(purchaseAsAGifButton).click();
	}
	
	public static void continueShopping() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(continueShoppingButton));
		Browser.driver.findElement(continueShoppingButton).click();
	}
}
