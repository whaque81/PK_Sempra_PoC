package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmploymentHistory {
	
	public static By EmploymentType = By.xpath("//form/div[1]/div/div[2]/div[5]/div[1]/div[1]/div/div/div/table/tbody/tr/td[1]");
	public static By EmploymentTypeNAValue = By.id("dijit_MenuItem_335_text");
	public static By NextStepsBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	
	public static void enterEmploymentHistory(WebDriver driver, WebDriverWait wait) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmploymentType));
		Thread.sleep(2000);
		driver.findElement(EmploymentType).click();
		Thread.sleep(1000);
		driver.findElement(EmploymentType).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(EmploymentType).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(EmploymentType).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(EmploymentType).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(NextStepsBtn).click();
	}
	

}
