package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReHireCheckPage {
	
	public static By Last4SSNTxtBox = By.name("SSNLast4Digits");
	public static By BirthDayDropDown = By.id("_dd");
	public static By BithDayValueLabel = By.xpath("//*[@id='dijit_MenuItem_15_text']/span");
	public static By BirthDayMonthDropDown = By.id("_mm");
	public static By BithdayMonthValueLabel = By.xpath("//span[contains(text(),'November')]");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void rehireCheck(WebDriver driver, WebDriverWait wait) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Last4SSNTxtBox));
		driver.findElement(Last4SSNTxtBox).sendKeys("7911");
		driver.findElement(BirthDayDropDown).click();
		Thread.sleep(1000);
		driver.findElement(BithDayValueLabel).click();
		driver.findElement(BirthDayMonthDropDown).click();
		Thread.sleep(1000);
		driver.findElement(BithdayMonthValueLabel).click();
		driver.findElement(NextStepBtn).click();
		
		
	}

}
