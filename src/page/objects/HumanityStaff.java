package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	private static final String STAFF = "//p[contains(text(),'Staff')]";
	private static final String ADDE = "//button[@id='act_primary']";
	private static String EMPLOYEE = "//a[contains(text(),'";
	private static String EMPLOYEEENDING = "')]";
	private static final String NAME = "//input[@id='_asf1']";
	private static final String LASTNAME = "//input[@id='_asl1']";
	private static final String EMAIL = "//input[@id='_ase1']";
	private static String ENDING= "']";
	private static final String SAVE = "//button[@id='_as_save_multiple']";
	
	// da ode na stranicu
	public static WebElement getStafeButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStafeButton(WebDriver driver) {
		getStafeButton(driver).click();
	}

//da doda zaposlenog
	public static WebElement getAddEButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDE));
	}

	public static void clickAddEButton(WebDriver driver) {
		getAddEButton(driver).click();
	}

//da ubaci ime
	public static WebElement getNameInput(WebDriver driver, int num) {
		return driver.findElement(By.xpath(NAME+num+ENDING));
	}

	public static void fillNameInput(WebDriver driver, int num, String data) {
		getNameInput(driver, num).sendKeys(data);
	}

//da ubaci prezime
	public static WebElement getLastNameInput(WebDriver driver, int num) {
		return driver.findElement(By.xpath(LASTNAME+num+ENDING));
	}

	public static void fillLastNameInput(WebDriver driver, int num, String data) {
		getLastNameInput(driver, num).sendKeys(data);
	}

//da ubaci mail
	public static WebElement getEEMAILInput(WebDriver driver, int num) {
		return driver.findElement(By.xpath(EMAIL+num+ENDING));
	}

	public static void fillEEMAILInput(WebDriver driver, int num, String data) {
		getEEMAILInput(driver, num).sendKeys(EMAIL);
	}

	// da sacuva
	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE));
	}

	public static void clickSaveButton(WebDriver driver) {
		getSaveButton(driver).click();
	}

//	Odredjeni zaposleni iz zadatka *napomena
	public static WebElement getEmployeeByName(WebDriver driver, String name) {
		return driver.findElement(By.xpath(EMPLOYEE+name+EMPLOYEEENDING));
	}
	public static boolean clickEmployeeByName(WebDriver driver, String name) {
		getEmployeeByName(driver, name).click();
		return true;
	}
}