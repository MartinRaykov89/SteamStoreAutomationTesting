package SteamStoreAutomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;

	/**
	 * This method set up FireFox driver and set browser properties.
	 **/
	public static void openBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\adx_mraykov.MOBILTEL.000\\Desktop\\gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * TThis method navigate to the loading of url.
	 */
	public static void openURL() {
		Browser.driver.get("https://store.steampowered.com/us-us");
	}

	/**
	 * This method stops the browser
	 */
	public static void quit() {
		driver.quit();
	}

}
