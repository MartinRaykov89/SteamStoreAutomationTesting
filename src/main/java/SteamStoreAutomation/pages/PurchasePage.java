package SteamStoreAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import SteamStoreAutomation.utilities.Browser;

public class PurchasePage {
	
	private static JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	
	private static By addToCartSimpleItemButton = By.xpath("//*[@class=\"btnv6_green_white_innerfade btn_medium\"][contains(@href,\"javascript:addToCart\")]");
	private static By addToCartCompleteBundleButton = By.xpath("//*[@id=\"game_area_purchase\"]/div[2]/div/div[2]/div[2]/div[2]/a");
	private static By addToCartCompletePackBundleButton = By.xpath("//*[@id=\"game_area_purchase\"]/div[3]/div/div[2]/div[2]/div[2]/a");
	private static By completeBundleInfoButton = By.xpath("/html/body/div[1]/div[7]/div[3]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/a");
	private static By completePackInfoButton = By.xpath("/html/body/div[1]/div[7]/div[3]/div[1]/div[2]/div[5]/div[2]/div[1]/div[3]/div/div[2]/div[1]/div/a");
	
	public static void addSimpleItem() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(addToCartSimpleItemButton));
		Browser.driver.findElement(addToCartSimpleItemButton).click();
	}
	
	public static void addCompleteBundle() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(addToCartCompleteBundleButton));
		Browser.driver.findElement(addToCartCompleteBundleButton).click();
	}
	
	public static void addPackBundle() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(addToCartCompletePackBundleButton));
		Browser.driver.findElement(addToCartCompletePackBundleButton).click();
	}
	
	public static void cklickOnBundleInfo() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(completeBundleInfoButton));
		Browser.driver.findElement(completeBundleInfoButton).click();
	}
	
	public static void cklickOnPackInfo() {
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(completePackInfoButton));
		Browser.driver.findElement(completePackInfoButton).click();
	}
}
