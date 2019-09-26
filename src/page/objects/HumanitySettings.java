package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	private static final String SETTINGS = "//i[@class='primNavQtip__icon icon-gear']";
	private static final String COUNTRY = "//select[@id='country']";
	private static final String LANGUATE = "//select[@name='language']";
	private static final String TIME = "//select[@name='pref_24hr']";
	
//	public static Select getCountry(WebDriver driver) {
//	getCountry(driver).selectByVisibleText(COUNTRY);
//	}
//	public static Select clickCountry(WebDriver driver) {
//		getCountry(driver).selectByVisibleText("Qatar");
//	}
	
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY)));
	}

	public static void inputCountry(WebDriver driver,String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	public static Select getLanguate(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUATE)));
	}

	public static void inputLanguate(WebDriver driver,String data) {
		getLanguate(driver).selectByVisibleText(data);
	}
	public static Select getTime(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIME)));
	}

	public static void inputTime(WebDriver driver,String data) {
		getTime(driver).selectByVisibleText(data);
	}		
	
}
