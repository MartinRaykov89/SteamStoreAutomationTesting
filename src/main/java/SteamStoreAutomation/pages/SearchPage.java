package SteamStoreAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SteamStoreAutomation.utilities.Browser;

public class SearchPage {
	
	
	private static By searchField = By.xpath("//*[@id= 'term']");
	private static By searchButton = By.xpath("//*[@type= 'submit']");
	private static By sortByMenu = By.id("sort_by_dselect_container");
	private static By sortByDropdawnMenu = By.xpath("//*[@id= 'sort_by_droplist']/li/a");
	private static By resultContainerRows = By.xpath("//*[@id= 'search_result_container']/div/a");
	
	public static void search(String searchItem) {
		Browser.driver.findElement(searchField).sendKeys(searchItem);
		Browser.driver.findElement(searchButton).click();
	}
	
	public static void sorting (String sortOption) {
		Browser.driver.findElement(sortByMenu).click();
		
		List<WebElement> sortOpt = Browser.driver.findElements(sortByDropdawnMenu);
		for (WebElement opt : sortOpt) {
			if(opt.getText().trim().equalsIgnoreCase(sortOption)) {
				opt.click();
			}
		}
	}
	
	

}
