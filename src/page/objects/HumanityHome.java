package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {


public static final String URL="https://www.humanity.com";
private static final String ABOUTUS="//a[@class='nav-link no-before'][contains(text(),'About us')]";
private static final String NAME= "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
private static final String MAIL ="//div[@class='input-wrapper']//input[@placeholder='Work Email']";
private static final String FREE_TRIAL= "//input[@id='free-trial-link-01']";
//visak sucajno napravljen
//private static final String COMPANY="//div[@class='field-error-border']//img";//Zokica
//private static final String SELECT_INDUSTRY="//input[@placeholder='Company name']";//Finance
//private static final String SELECT_ROLE="//div[3]//div[1]//div[1]//img[1]";//Retail
//private static final String PNUMBER="//input[@placeholder='Phone number']";//123456
//private static final String PASS1="//input[@placeholder='Password']";//broj123
//private static final String REPEATP="//input[@placeholder='Repeat password']";
//private static final String START="//span[@class='buttons']//input";

private static final String LOGINDUGME="//p[contains(text(),'LOGIN')]";
private static final String EMAIL="//input[@id='email']";
private static final String PASSWORD="//input[@id='password']";
private static final String LOGIN="//button[contains(text(),'Log in')]";
//private static final String LOGOUT="//div[@id='userm']";
//private static final String SINGOUT="//a[contains(text(),'Sign Out')]";

//about us
public static WebElement getAboutButton(WebDriver driver) {
return driver.findElement(By.xpath(ABOUTUS));
}
public static void clickAboutButton(WebDriver driver) {
getAboutButton(driver).click();
}

//full name input ime firme
public static WebElement getNameInput(WebDriver driver) {
return driver.findElement(By.xpath(NAME));
}
public static void fillNameInput(WebDriver driver, String data) {
getNameInput(driver).sendKeys(data);
}
//work email firme
public static WebElement getMailInput(WebDriver driver) {
return driver.findElement(By.xpath(MAIL));
}
public static void fillMailInput(WebDriver driver, String data) {
getMailInput(driver).sendKeys(data);
}
// free trainl dugme
public static WebElement getFreeButton(WebDriver driver) {
return driver.findElement(By.xpath(FREE_TRIAL));
}
public static void clickFreeButton(WebDriver driver) {
getFreeButton(driver).click();
}
//Login dugme na home stranici
public static WebElement getLoginButton(WebDriver driver) {
return driver.findElement(By.xpath(LOGINDUGME));
}
public static void clickLoginButton(WebDriver driver) {
getLoginButton(driver).click();
}
//LOGOVANJE NA DRUGOJ STRANICI
public static WebElement getMailLogInput(WebDriver driver) {
return driver.findElement(By.xpath(EMAIL));
}
public static void fillMailLogInput(WebDriver driver, String data) {
getMailLogInput(driver).sendKeys(data);
}
public static WebElement getPasswordInput(WebDriver driver) {
return driver.findElement(By.xpath(PASSWORD));
}
public static void fillPasswordInput(WebDriver driver, String data) {
getPasswordInput(driver).sendKeys(data);
}
public static WebElement getLogButton(WebDriver driver) {
return driver.findElement(By.xpath(LOGIN));
}
public static void clickLogButton(WebDriver driver) {
getLogButton(driver).click();
}
}