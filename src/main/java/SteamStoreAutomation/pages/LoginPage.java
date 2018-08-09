package SteamStoreAutomation.pages;

import org.openqa.selenium.By;

import SteamStoreAutomation.utilities.Browser;

public class LoginPage {
	
	public static By name = By.id("input_username");
	public static By password = By.id("input_password");
	public static By singInButton = By.id("login_btn_signin");
	
	public static By joinSteamButton = By.xpath("//*[@class = 'btnv6_blue_hoverfade btn_medium']");
	
	public static void singIn(String userName, String userPassword) {
		Browser.driver.findElement(name).sendKeys(userName);
		Browser.driver.findElement(password).sendKeys(userPassword);
		Browser.driver.findElement(singInButton).click();	
	}
	
	
	

}
