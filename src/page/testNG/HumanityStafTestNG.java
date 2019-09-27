package page.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityStaff;
import rs.itbootcamp.ExcelUtils;

public class HumanityStafTestNG {
	@Test
	public static void AddStaff() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.humanity.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		boolean test = true;
		try {
			HumanityHome.clickLoginButton(driver);
			String ime, prezime, email;
			String src = "Data.xls";
			ExcelUtils.setExcell(src);
			ExcelUtils.setWorkSheet(0);

			String loginEmail = ExcelUtils.getDataAt(1, 0);
			String password = ExcelUtils.getDataAt(1, 1);
			HumanityHome.fillMailLogInput(driver, loginEmail);
			HumanityHome.fillPasswordInput(driver, password);
			HumanityHome.clickLogButton(driver);

			HumanityStaff.clickStafeButton(driver);
			Thread.sleep(3000);
			HumanityStaff.clickAddEButton(driver);
			Thread.sleep(3000);
			ExcelUtils.setWorkSheet(1);

			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				email = ExcelUtils.getDataAt(i, 2);
				HumanityStaff.fillNameInput(driver, i, ime);
				HumanityStaff.fillLastNameInput(driver, i, prezime);
				HumanityStaff.fillEEMAILInput(driver, i, email);
			}
			HumanityStaff.clickSaveButton(driver);
			Thread.sleep(3000);

			HumanityStaff.clickStafeButton(driver);

			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				email= ExcelUtils.getDataAt(i, 2);
				Assert.assertTrue(test);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			ExcelUtils.closeExcell();
			driver.quit();
		}
	}
}