package SteamStoreAutomation.pages;

import java.awt.List;
import java.util.ArrayList;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SteamStoreAutomation.utilities.Browser;

public class HeaderPage {
	

	static Actions action = new Actions(Browser.driver);

	private static By storeMenuButton = By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[1]");
	private static By subMenuStore = By.xpath("//*[@id=\"global_header\"]//*[2]/div[2]/div");
	private static By communityMenuButton = By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[2]");
	private static By aboutButton = By.xpath("//*[contains(text(),'ABOUT')]");
	private static By supportButton = By.xpath("//*[contains(text(),'SUPPORT')]");
	
	private static By loginButton = By.xpath("//*[contains(text(),'login')]");
	private static By languageDropdownMenu = By.id("language_pulldown");
	private static By languages = By.id("language_dropdown");
	
	
	public static void selectfromStoreMenu(String storeOption) {
		action.moveToElement(Browser.driver.findElement(storeMenuButton)).perform();
	
		ArrayList<WebElement> items = new ArrayList<>();
		
		for (WebElement resultItem : Browser.driver.findElements(subMenuStore)) {
			action.moveToElement(Browser.driver.findElement(storeMenuButton)).perform();
			items.add(resultItem);
			String itemName = resultItem.getText();
			if(itemName.equalsIgnoreCase(storeOption)){
		           Browser.driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/div[1]/div/a[contains(text(),'"+storeOption+"')]")).click();
		            }
		}
		
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
