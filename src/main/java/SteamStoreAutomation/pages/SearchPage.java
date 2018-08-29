package SteamStoreAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SteamStoreAutomation.utilities.Browser;

public class SearchPage {
	
	private static JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
	
	static Actions action = new Actions(Browser.driver);
	
	private static By searchField = By.xpath("//*[@id= 'term']");
	private static By searchButton = By.xpath("//*[@type= 'submit']");
	private static By sortByMenu = By.id("sort_by_dselect_container");
	private static By sortByDropdawnMenu = By.xpath("//*[@id= 'sort_by_droplist']/li/a");
	private static By resultContainerRows = By.xpath("//*[@id= 'search_result_container']/div/a");
	private static By firstResultfromContainerRows = By.xpath("//*[@id= 'search_result_container']/div/a[1]");
	
	private static By narrowByTagMenu = By.xpath("//*[@id= 'TagFilter_Container']/div/span");
	private static By searchByMoreTags = By.id("TagSuggest");
	
	private static By showSelectedTypesMenu = By.xpath("//*[@id= 'narrow_category1']/div");
	private static By seeAllFromSelectedTypesButton = By.xpath("//*[@id=\"additional_search_options\"]/div[2]/a");
	
	private static By numberOfPlayers = By.xpath("//*[@class=\"block_content block_content_inner\"]/div[@data-param=\"category3\"]");
	private static By byFeature = By.xpath("//*[@id=\"additional_search_options\"]/div[4]/div[1]/div");
	
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
	
	public static void filteringNarrowByTag (String option) {
		Browser.driver.findElement(searchByMoreTags).sendKeys(option);
		
		List<WebElement> narrowByTagList = Browser.driver.findElements(narrowByTagMenu);
		for (WebElement opt : narrowByTagList) {
			if (opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();
			}
		}
	}
	
	public static void filteringSelectedTypes (String option) {
		Browser.driver.findElement(seeAllFromSelectedTypesButton).click();
		
		List<WebElement> selectedTypesList = Browser.driver.findElements(showSelectedTypesMenu);		
		for (WebElement opt : selectedTypesList) {
			if (opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();
			}
		}
	}

	public static void filteringByNumberOfPlayers (String option) {
		
		jse.executeScript("arguments[0].scrollIntoView()", Browser.driver.findElement(byFeature));
		
		List<WebElement> numberOfPlayersList = Browser.driver.findElements(numberOfPlayers);
		for (WebElement opt : numberOfPlayersList) {
			if (opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();
			}
		}
	}
	
	public static void selectFirstResultFromContainerRows () {
		Browser.driver.findElement(firstResultfromContainerRows).click();
	}
}
