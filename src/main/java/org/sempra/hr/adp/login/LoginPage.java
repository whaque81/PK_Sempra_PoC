package org.sempra.hr.adp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public static By AdminLoginLink = By.id("adminLogin");
	public static By UserTxtBox = By.name("USER");
	public static By SubmitBtn = By.xpath("//div[text()='Submit']");
	public static By PasswordTxtBox = By.id("passwordForm:password");
	public static By LoginBtn = By.id("portal.login.logIn");
	
	public static void Login(WebDriver driver, String user, String password) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AdminLoginLink));
		driver.findElement(AdminLoginLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserTxtBox));
		Thread.sleep(1000);
		driver.findElement(UserTxtBox).sendKeys(user);
		driver.findElement(SubmitBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordTxtBox));
		Thread.sleep(1000);
		driver.findElement(PasswordTxtBox).sendKeys(password);
		driver.findElement(SubmitBtn).click();
		
		
	}
	

}
