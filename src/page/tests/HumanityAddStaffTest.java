package page.tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import page.objects.HumanityStaff;

public class HumanityAddStaffTest {
	public static void Metodadruga() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		HumanityStaff.clickStafeButton(driver);
		HumanityStaff.clickAddEButton(driver);
		HumanityStaff.fillNameInput(driver, "Pera");
		HumanityStaff.fillLastNameInput(driver, "Peric");
		HumanityStaff.fillEEMAILInput(driver, "peraperic@gmail.com");
	}

}