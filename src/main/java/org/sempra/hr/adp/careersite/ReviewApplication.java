package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewApplication {
	
	public static By NextStepBtn = By.xpath("//form/div[2]/div/div[3]/div");
	public static By SubmitBtn = By.xpath("//form/div[2]/div[2]/div/div");
	public static By ApplicationCompleteLabel = By.xpath("//div[contains(text(),'Application Complete')]");
	
	public static void submitAppForm(WebDriver driver, WebDriverWait wait) throws Exception{
		Thread.sleep(6000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(NextStepBtn));
		driver.findElement(NextStepBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn));
		Thread.sleep(1000);
		driver.findElement(SubmitBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ApplicationCompleteLabel));
	}
	

}
