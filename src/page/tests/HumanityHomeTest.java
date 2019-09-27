package page.tests;


import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import rs.itbootcamp.ExcelUtils;

public class HumanityHomeTest {
	public static void Login(WebDriver driver) {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		String url = "https://www.humanity.com/";
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//		HumanityHome.clickLoginButton(driver);

		String src ="Data.xls";
		ExcelUtils.setExcell(src);
		ExcelUtils.setWorkSheet(0);

		String loginEmail = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);

		try {
			HumanityHome.fillMailLogInput(driver, loginEmail);
			HumanityHome.fillPasswordInput(driver, password);
			ExcelUtils.closeExcell();
			HumanityHome.clickLogButton(driver);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());

			if (Objects.equals(driver.getCurrentUrl(), HumanityMenu.URL)) {

				System.out.println("Uspesno logovanje!");
			} else {

				System.out.println("Greška!");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
//		driver.quit();

	}
	//go to website 
//	String url = "https://www.humanity.com/";
//	driver.get(url);
//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	driver.manage().window().maximize();

//	HumanityHome.getLoginButton(driver);
//	HumanityHome.clickLoginButton(driver);
//
//	HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
//	HumanityHome.fillPasswordInput(driver, "broj123");
//	HumanityHome.clickLogButton(driver);

//	Thread.sleep(3000);

}
