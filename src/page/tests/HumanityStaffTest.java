package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityStaff;
import rs.itbootcamp.ExcelUtils;

public class HumanityStaffTest {

	public static void AddStaff (WebDriver driver) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		String url = "https://www.humanity.com/";
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		try {
//		HumanityHome.clickLoginButton(driver);

		String src ="Data.xls";
		ExcelUtils.setExcell(src);
		ExcelUtils.setWorkSheet(0);

//		String loginEmail = ExcelUtils.getDataAt(1, 0);
//		String password = ExcelUtils.getDataAt(1, 1);
//		HumanityHome.fillMailLogInput(driver, loginEmail);
//		HumanityHome.fillPasswordInput(driver, password);
//		HumanityHome.clickLogButton(driver);
		
		HumanityStaff.clickStafeButton(driver);	
		Thread.sleep(3000);
		HumanityStaff.clickAddEButton(driver);
		Thread.sleep(3000);
		ExcelUtils.setWorkSheet(1);
		
		for(int i=1; i < ExcelUtils.getRowNumber(); i++) {
			String ime = ExcelUtils.getDataAt(i, 0);
			String prezime = ExcelUtils.getDataAt(i, 1);
			String email = ExcelUtils.getDataAt(i, 2);
			HumanityStaff.fillNameInput(driver, i, ime);
			HumanityStaff.fillLastNameInput(driver, i, prezime);
			HumanityStaff.fillEEMAILInput(driver, i, email);
		}
		HumanityStaff.clickSaveButton(driver);
		ExcelUtils.closeExcell();
		Thread.sleep(3000);
	
//		driver.quit();
		}catch (Exception e) {
				System.out.println(e.toString());
			}
	
	}
}