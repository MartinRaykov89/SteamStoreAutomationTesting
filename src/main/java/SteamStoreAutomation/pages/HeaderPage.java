package SteamStoreAutomation.pages;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import SteamStoreAutomation.utilities.Browser;

public class HeaderPage {
	
	
	static Actions action = new Actions(Browser.driver);

	private static By storeMenu = By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[1]");
	private static By subMenuStore = By.xpath("//div[@class='supernav_content']//div[@class='submenu_store']/a");
	private static By subCommunityMenu = By.xpath("//*[@class=\"supernav_content\"]/div[@class=\"submenu_community\"]/a");
	private static By communityMenu = By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[2]");
	private static By aboutButton = By.xpath("//*[contains(text(),'ABOUT')]");
	private static By supportButton = By.xpath("//*[contains(text(),'SUPPORT')]");
	
	private static By loginButton = By.xpath("//*[contains(text(),'login')]");
	
	private static By languageDropdownMenu = By.xpath("//*[@id='language_dropdown']/div[@class=\"popup_body popup_menu\"]/a");
	private static By languages = By.id("language_dropdown");
	
	
	public static void selectFromStoreMenu(String option) {
		action.moveToElement(Browser.driver.findElement(storeMenu)).perform();
				
		List<WebElement> storeOptions = Browser.driver.findElements(subMenuStore);
		
		for (WebElement opt : storeOptions) {
			if(opt.getText().trim().equalsIgnoreCase(option)) {
				opt.click();				
			}
		}	
	}
	
	public static void selectFromCommunityMeny(String option) {
		action.moveToElement(Browser.driver.findElement(communityMenu)).perform();
		
		List<WebElement> comunityOptions = Browser.driver.findElements(subCommunityMenu);
		
		for (WebElement opt : comunityOptions) {
			if(opt.getTagName().trim().equalsIgnoreCase(option)) {
				opt.click();
			}
		}
	}
	
	public static void goToAbout() {
		action.moveToElement(Browser.driver.findElement(aboutButton)).perform();
		Browser.driver.findElement(aboutButton).click();
	}
	
	public static void goToSupport() {
		action.moveToElement(Browser.driver.findElement(supportButton)).perform();
		Browser.driver.findElement(supportButton).click();
	}
	
	public static void choiceLanguage(String option) {
		Browser.driver.findElement(languages).click();
		
		List<WebElement> languageOptions = Browser.driver.findElements(languageDropdownMenu);
		
		for (WebElement language : languageOptions) {
			if (language.getText().trim().equalsIgnoreCase(option)) {
				language.click();
			}			
		}
	}
	
	public static void goToLogginMenu() {
		action.moveToElement(Browser.driver.findElement(loginButton)).perform();
		Browser.driver.findElement(loginButton).click();
	}
}
