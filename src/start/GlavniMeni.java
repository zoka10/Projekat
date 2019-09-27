package start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.tests.HumanityEditStaffTest;
import page.tests.HumanityHomeTest;
import page.tests.HumanityProfileTest;
import page.tests.HumanitySettingsTest;
import page.tests.HumanityStaffTest;

public class GlavniMeni {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.humanity.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLoginButton(driver);
		HumanityHomeTest.Login(driver);
		HumanitySettingsTest.Settings(driver);
		HumanityEditStaffTest.Profil(driver);
		HumanityStaffTest.AddStaff(driver);
		HumanityProfileTest.ProfileSingOut(driver);
	}

}
