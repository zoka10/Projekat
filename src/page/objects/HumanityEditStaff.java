package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
//	public static final String URL = "https://juju5.humanity.com/app/dashboard/";
	private static final String MENU = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE = "//a[contains(text(),'Profile')]";
	private static final String EDIT = "//a[contains(text(),'Edit Details')]";;
	private static final String UPLOAD = "//input[@id='fileupload']";
	private static final String NICK = "//input[@id='nick_name']";
	private static final String SAVE = "//button[@id='act_primary']";

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

	public static WebElement getEditButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT));
	}

	public static void clickEditButoon(WebDriver driver) {
		getEditButton(driver).click();
	}

	public static WebElement getUploadInput(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD));
	}

	public static void fillUploadInput(WebDriver driver, String data) {
		getUploadInput(driver).sendKeys(data);
	}

	public static WebElement getNickInput(WebDriver driver) {
		return driver.findElement(By.xpath(NICK));
	}

	public static void fillNickInput(WebDriver driver, String data) {
		getNickInput(driver).sendKeys(data);
	}

	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE));
	}

	public static void clickSaveButoon(WebDriver driver) {
		getSaveButton(driver).sendKeys();
	}
}