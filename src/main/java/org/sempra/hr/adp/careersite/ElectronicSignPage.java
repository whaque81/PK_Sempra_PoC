package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicSignPage {
	
	public static By ESChkBox = By.xpath("//form/div[1]/div/div[3]/div/label/div[1]/input");
	public static By NextStepBtn = By.xpath("//form/div[2]/div[2]/div/div");
	
	public static void acceptAgreement(WebDriver driver, WebDriverWait wait) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Updating contact information']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[1]/div/div[3]/div/label/div[1]")).click();
		//driver.findElement(ESChkBox).click();
		/*Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Updating contact information']")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Updating contact information']")).sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		driver.findElement(ESChkBox).click();
		driver.findElement(ESChkBox).sendKeys(Keys.DOWN);*/
		driver.findElement(NextStepBtn).click();
		
	}
	

}
