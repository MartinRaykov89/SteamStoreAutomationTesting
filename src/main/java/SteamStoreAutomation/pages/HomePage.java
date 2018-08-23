package SteamStoreAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import SteamStoreAutomation.utilities.Browser;

public class HomePage {
	
	static Actions action = new Actions(Browser.driver);
	
	private static By yourStoreMenu = By.id("foryou_tab");
	private static By gamesMenu = By.id("genre_tab");
	private static By softwareMenu = By.id("software_tab");
	private static By videsMenu = By.id("videos_tab");
	private static By news = By.xpath("//*[@href=\"https://store.steampowered.com/news/?snr=1_4_4__12\"]");
	
	private static By storeHome = By.xpath("//*[@href=\"https://store.steampowered.com/?snr=1_4_4__12\"\"]");
	private static By recentlyViewed = By.xpath("//*[@href=\"https://store.steampowered.com/recommended/?snr=1_4_4__12\"]");
	private static By steamCurators = By.xpath("//*[@href=\"https://store.steampowered.com/curators/?snr=1_news_news__12\"]");
	private static By recentlyUploaded = By.xpath("//*[@href=\"https://store.steampowered.com/recommended/?snr=1_4_4__12\"]");
	
	private static By steamControler = By.xpath("//*[@class='pulldown_desktop'][@href=\"https://store.steampowered.com/controller/?snr=1_4_4__12\"]");
	private static By steamLink = By.xpath("//*[@class='popup_menu_item'][@href=\"https://store.steampowered.com/app/353380/?snr=1_4_4__12\"]");
	private static By htcVive = By.xpath("//*[@class='popup_menu_item'][@href=\"https://store.steampowered.com/app/358040/?snr=1_4_4__12\"]");
	
	public static void goToNews() {
		Browser.driver.findElement(news).click();
	}
	
	public static void selectFromYourStore() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
	}
	
	public static void selectStoreHomeFromYourStoreMenu() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();		
		Browser.driver.findElement(storeHome).click();
	}
	
	public static void selectRecentlyViewedFromYourStoreMenu() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
		Browser.driver.findElement(recentlyViewed).click();
	}
	
	public static void selectStreamCuratorsFromYourStoreMenu() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
		Browser.driver.findElement(steamCurators).click();
	}
	
	public static void selectRecentlyUploadedFromYourStroeMenu() {
		action.moveToElement(Browser.driver.findElement(yourStoreMenu)).perform();
		Browser.driver.findElement(recentlyUploaded).click();
	}
	
	public static void selectSteamControlerFromSoftwaremenu() {
		action.moveToElement(Browser.driver.findElement(softwareMenu)).perform();
		Browser.driver.findElement(steamControler).click();
	}
	
	public static void selectSteamLinkFromSoftwareMenu() {
		action.moveToElement(Browser.driver.findElement(softwareMenu)).perform();
		Browser.driver.findElement(steamLink).click();	
	}
	
	public static void selectHTCViveFromSoftwareMenu() {
		action.moveToElement(Browser.driver.findElement(softwareMenu)).perform();
		Browser.driver.findElement(htcVive).click();
	}

}
