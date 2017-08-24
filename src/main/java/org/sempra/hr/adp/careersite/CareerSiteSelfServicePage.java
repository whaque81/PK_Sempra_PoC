package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerSiteSelfServicePage {
	
	public static By JobSearchBtn = By.xpath("//button[contains(text(),'Search for Jobs!')]");
	public static By ReqNumLabel = By.xpath("//span[@class='jobnum']");
	public static By JobTitle = By.xpath("//*[@id='searchForm']/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/span[1]/a");
	public static By ApplyBtn = By.xpath("//*[@id='srccar']/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/button");
	public static By SignInExistingUserLink = By.xpath("//a[text()='Sign in with existing account']");
	public static By UserTxtbox = By.name("email");
	public static By PasswordTxtbox = By.name("password");
	public static By ConfirmPasswordTxtbox = By.name("passwordConfirm");
	public static By CreateAccountBtn = By.xpath("//form[@name='accountCreateForm']/ul/li[3]/button");
	
	public static void searchJob(WebDriver driver, String ReqNumber) throws Exception{
		
		while(!driver.findElements(ReqNumLabel).get(0).getText().trim().equals(ReqNumber)) {
		driver.findElement(JobSearchBtn).click();
		Thread.sleep(2000);}
		if(driver.findElements(ReqNumLabel).get(0).getText().trim().equals(ReqNumber)){
			System.out.println("Posted Job Found");
		}
	}
		
	public static void startApplying(WebDriver driver, WebDriverWait wait) throws Exception{
		
		driver.findElement(JobTitle).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ApplyBtn));
		driver.findElement(ApplyBtn);
		driver.findElement(UserTxtbox).sendKeys("whaque123@prokarma.com");
		driver.findElement(PasswordTxtbox).sendKeys("!!Nov1981");
		driver.findElement(ConfirmPasswordTxtbox).sendKeys("!!Nov1981");
		driver.findElement(CreateAccountBtn);
		
		
	}
		

}
