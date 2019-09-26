package page.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import rs.itbootcamp.ExcelUtils;

public class HumanityHomeTestNG {

	 @Test
	public static void loggingTest() {
					
					System.setProperty("webdriver.chrome.driver","chromedriver.exe");  
					WebDriver driver = new ChromeDriver();
					String url = "https://www.humanity.com/";
					driver.get(url);
					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					driver.manage().window().maximize();

					HumanityHome.clickLoginButton(driver);

					String src ="Data.xls";
					ExcelUtils.setExcell(src);
					ExcelUtils.setWorkSheet(0);

					String loginEmail = ExcelUtils.getDataAt(1, 0);
					String password = ExcelUtils.getDataAt(1, 1);
					
					try {			
						HumanityHome.fillMailLogInput(driver, loginEmail);
						HumanityHome.fillPasswordInput(driver, password);
						HumanityHome.clickLogButton(driver);
						
						Thread.sleep(3000);
						System.out.println(driver.getCurrentUrl());
						
						Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
					}catch(Exception e) {
						System.out.println(e.toString());
					}		
				driver.quit();			
				}

	}