package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static String URL = "https://juju5.humanity.com/app/dashboard/";
	public static final String DASHBOARD = "//i[@class='primNavQtip__icon icon-dashboard']";
	private static final String SHIFT = "//div[@id='_notifycount']";
	private static final String TIME = "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String LEAVE = "//i[@class='primNavQtip__icon icon-leave2']";
	private static final String TREINING = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SETINGS = "//i[@class='primNavQtip__icon icon-gear']";


	//svi da se kliknu
	public static WebElement getdDasButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD));
	}

	public static void clickDasButton(WebDriver driver) {
		getdDasButton(driver).click();
	}

	public static WebElement getShiftButton(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT));
	}

	public static void clickShiftButton(WebDriver driver) {
		getShiftButton(driver).click();
	}

	public static WebElement getTimeButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIME));
	}

	public static void clickTimeButton(WebDriver driver) {
		getTimeButton(driver).click();
	}

	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE));
	}

	public static void clickLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	public static WebElement getTrenButton(WebDriver driver) {
		return driver.findElement(By.xpath(TREINING));
	}

	public static void clickTrenButton(WebDriver driver) {
		getTrenButton(driver).click();
	}

	public static WebElement getStafeButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStafeButton(WebDriver driver) {
		getStafeButton(driver).click();
	}

	public static WebElement getPayButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickPayButton(WebDriver driver) {
		getPayButton(driver).click();
	}

	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS));
	}

	public static void clickReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}
	public static WebElement getSetingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETINGS));
	}

	public static void clickSetingsButton(WebDriver driver) {
		getSetingsButton(driver).click();
	}
}
