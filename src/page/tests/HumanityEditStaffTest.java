package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityEditStaff;
import page.objects.HumanityHome;

public class HumanityEditStaffTest {

	public static void Profil(WebDriver driver) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		String url = "https://www.humanity.com/";
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		try {
//			// logovanje
//			Thread.sleep(3000);
//
//			HumanityHome.clickLoginButton(driver);
//			HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
//			HumanityHome.fillPasswordInput(driver, "broj123");
//			HumanityHome.clickLogButton(driver);
//			Thread.sleep(3000);
//
//			// uredjivanje profila zaposlenog
			HumanityEditStaff.clickMenuButton(driver);

			Thread.sleep(3000);

			HumanityEditStaff.clickProfileButton(driver);

			Thread.sleep(3000);

			HumanityEditStaff.clickEditButoon(driver);

			Thread.sleep(3000);
			HumanityEditStaff.fillNickInput(driver, "Niki");
			HumanityEditStaff.fillUploadInput(driver, "C:\\Dodatni (D)\\GOT.jpg");
			Thread.sleep(3000);

			System.out.println("Slika se dodala!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Slika nije dodata.");
		} finally {
			Thread.sleep(3000);
//			driver.quit();
		}
	}
}
