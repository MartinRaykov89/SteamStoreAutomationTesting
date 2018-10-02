package SteamStoreAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import SteamStoreAutomation.utilities.Browser;

public class LeftNavigationContainer {
	private static JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	
	private static By browseByGerneOptions = By.xpath("//*[@class=\"home_page_gutter_block\"]/a");
	private static By browseCategories = By.xpath("//*[@class=\"gutter_items\"]/a/span");
	
	public static void choiceByGerne(String option) {
		List<WebElement> gerneOptions = Browser.driver.findElements(browseByGerneOptions);
		for (WebElement opt : gerneOptions) {
			if (opt.getText().trim().equalsIgnoreCase(option)) {
				jse.executeScript("arguments[0].scrollIntoView()", opt);
				opt.click();
			}
		}
	}
	
	public static void choiceCategorie(String option) {
		List<WebElement> categoriesList = Browser.driver.findElements(browseCategories);
		for (WebElement opt : categoriesList) {
			if (opt.getText().trim().equalsIgnoreCase(option)) {
				jse.executeScript("arguments[0].scrollIntoView()", opt);
				opt.click();
			}
		}
	}
	
	
	
}
