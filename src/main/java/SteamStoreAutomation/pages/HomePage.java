package SteamStoreAutomation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SteamStoreAutomation.utilities.Browser;;

public class HomePage {
	
	static Actions action = new Actions(Browser.driver);
	
	private static By yourStoreMenu = By.id("foryou_tab");
	private static By yourStoreSubMenu = By.xpath("//*[@id='foryou_flyout']/div[@class=\"popup_body popup_menu\"]/a");
	private static By gamesMenu = By.id("genre_tab");
	private static By gamesSubMenu = By.xpath("//*[@id='genre_flyout']/div[@class=\"popup_body popup_menu\"]/a");
	private static By softwareMenu = By.id("software_tab");
	private static By softwareSubMenu = By.id("//*[@id='software_flyout']/div[@class=\"popup_body popup_menu\"]/a");
	private static By videosMenu = By.id("videos_tab");
	private static By videosSubMenu = By.xpath("//*[@id='videos_flyout']/div[@class=\"popup_body popup_menu\"]/a");
	private static By news = By.xpath("//*[@href=\"https://store.steampowered.com/news/?snr=1_4_4__12\"]");
	private static By searchField = By.id("store_nav_search_term");
	private static By searchButton = By.xpath("//*[@src = 'https://steamstore-a.akamaihd.net/public/images/blank.gif']");
	
	private static String homePageTitle = "Steam";
	
	public static void verifyHomePagetitle() {
		String title = Browser.driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(homePageTitle));
	}
	
	public static void search (String searchItem) {
		Browser.driver.findElement(searchField).sendKeys(searchItem);
		Browser.driver.findElement(searchButton).click();
	}
	
	public static void goToVideos() {
		action.moveToElement(Browser.driver.findElement(videosMenu)).perform();
		Browser.driver.findElement(videosMenu).click();
	}
	
	public static void selectFromVideosMenu (String option) {
		action.moveToElement(Browser.driver.findElement(videosMenu)).perform();
		
		List<WebElement> videosOptions = Browser.driver.findElements(videosSubMenu);
		
		for (WebElement opt : videosOptions) {
			if(opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();				
			}
		}	
	}
	
	public static void goToSoftware() {
		action.moveToElement(Browser.driver.findElement(softwareMenu)).perform();
		Browser.driver.findElement(softwareMenu).click();
	}
	
	public static void selectFromSoftwareMenu(String option) {
		action.moveToElement(Browser.driver.findElement(softwareMenu)).perform();
		
		List<WebElement> softwareOptions = Browser.driver.findElements(softwareSubMenu);
		
		for (WebElement opt : softwareOptions) {
			if(opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();				
			}
		}	
	}

	public static void goToNews() {
		Browser.driver.findElement(news).click();
	}
	
	public static void goToGames() {
		action.moveToElement(Browser.driver.findElement(gamesMenu)).perform();
		Browser.driver.findElement(gamesMenu).click();
	}
	
	public static void selectFromGamesMenu(String option) {
		action.moveToElement(Browser.driver.findElement(gamesMenu)).perform();
		
		List<WebElement> games = Browser.driver.findElements(gamesSubMenu);
		
		for (WebElement game : games) {
			if(game.getText().trim().equalsIgnoreCase(option)) {
				game.click();				
			}
		}
	}
	
	public static void goToYourStore() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
		Browser.driver.findElement(yourStoreMenu).click();
	}
	
	public static void selectFromYourStore(String option) {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
		
		List<WebElement> yourStoreOptions = Browser.driver.findElements(yourStoreSubMenu);
		
		for (WebElement opt : yourStoreOptions) {
			if(opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();
				
			}
		}	
	}
	
	
}
