package org.sempra.hr.adp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	public static By AdminLoginLink = By.id("adminLogin");
	public static By UserTxtBox = By.name("USER");
	public static By SubmitBtn = By.xpath("//div[text()='Submit']");
	public static By PasswordTxtBox = By.id("passwordForm:password");
	public static By LoginBtn = By.id("portal.login.logIn");
	
	public static void Login(WebDriver driver, String user, String password) throws Exception{
		
		driver.findElement(AdminLoginLink).click();
		driver.findElement(UserTxtBox).sendKeys(user);
		driver.findElement(SubmitBtn).click();
		Thread.sleep(3000);
		driver.findElement(PasswordTxtBox).sendKeys(password);
		driver.findElement(SubmitBtn).click();
		
		
	}
	
	public static void main() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testadpvantage.adp.com");
		Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
	}
	

}
