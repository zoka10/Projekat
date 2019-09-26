package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanitySettings;

public class HumanitySettingsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.humanity.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// logovanje
		Thread.sleep(3000);
		
		HumanityHome.clickLoginButton(driver);
		HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
		HumanityHome.fillPasswordInput(driver, "broj123");
		HumanityHome.clickLogButton(driver);
		Thread.sleep(3000);
		
		//Setovanje podataka
		HumanitySettings.clickSettingsButton(driver);
		HumanitySettings.inputCountry(driver, "Qatar");
		HumanitySettings.inputLanguate(driver, "Filipino (machine)");
		HumanitySettings.inputTime(driver, "24 hour");

		Thread.sleep(3000);
		driver.quit();
	}

}
