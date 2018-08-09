package SteamStoreAutomation.pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SteamStoreAutomation.utilities.Browser;

public class HeaderPage {
	
	static Actions action = new Actions(Browser.driver);

	private static By storeMenuButton = By.xpath("//*[contains(@class , 'menuitem supernav')][contains(text(),'STORE')]");
	private static By communityMenuButton = By.xpath("//*[contains(@class , 'menuitem supernav')][contains(text(),'COMMUNIT')]");
	private static By aboutButton = By.xpath("//*[contains(text(),'ABOUT')]");
	private static By supportButton = By.xpath("//*[contains(text(),'SUPPORT')]");
	
	private static By loginButton = By.xpath("//*[contains(text(),'login')]");
	private static By languageDropdownMenu = By.id("language_pulldown");
	private static By languages = By.id("language_dropdown");
	
	public static void selectfromStoreMenu() {
		
	}
	
	public static void gotoSupportPage() {
		Browser.driver.findElement(supportButton).click();
	}
	
	public static void gotoAboutPage() { 
		Browser.driver.findElement(aboutButton).click();
	}
	
	public static void gotoLoginPage() {
		Browser.driver.findElement(loginButton).click();
	}
	
	public static void choiceLanguage() {
		Browser.driver.findElement(languageDropdownMenu).click();
		
		for (WebElement language : Browser.driver.findElements(languages)) {
			System.out.println(language.getText() + Browser.driver.findElements(languages).indexOf(language));
		}
	}
	
}
