package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
//	public static final String URL = "https://juju5.humanity.com/app/dashboard/";
	private static final String MENU = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SINGOUT = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION = "//div[@id='humanityAppVersion']";

	public static WebElement getMenuButton(WebDriver driver) {
		return driver.findElement(By.xpath(MENU));
	}

	public static void clickMenuButton(WebDriver driver) {
		getMenuButton(driver).click();
	}

	public static WebElement getProfileButton(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE));
	}

	public static void clickProfileButton(WebDriver driver) {
		getProfileButton(driver).click();
	}

	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}

	public static WebElement getAvailabiilityButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY));
	}

	public static void clickAvailabiilityButton(WebDriver driver) {
		getAvailabiilityButton(driver).click();
	}

	public static WebElement getSingButton(WebDriver driver) {
		return driver.findElement(By.xpath(SINGOUT));
	}

	public static void clickSingButton(WebDriver driver) {
		getSingButton(driver).click();
	}

	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION));
	}

	public static String versionNumber(WebDriver driver) {
		return getVersion(driver).findElement(By.tagName("b")).getText();
	}
}