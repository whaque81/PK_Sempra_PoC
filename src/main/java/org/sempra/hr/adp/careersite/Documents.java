package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Documents {
	
	public static By SelectResumeBtn = By.id("btnChange_resume_label");
	public static By CopyPasteResumeBtn = By.id("resumeCopyPasteButton");
	public static By ResumeTxtBox = By.id("docUploadLocalTextForm");
	public static By ImportBtn = By.xpath("//span[text()='Import']");
	public static By NextStepBtn = By.xpath("//form/div[2]/div[2]/div/div");
	
	public static void selectResume(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectResumeBtn));
		driver.findElement(SelectResumeBtn).click();
		Thread.sleep(1000);
		driver.findElement(CopyPasteResumeBtn).click();
		Thread.sleep(2000);
		driver.findElement(ResumeTxtBox).sendKeys("My one line resume...says it all");
		driver.findElement(ImportBtn).click();
		Thread.sleep(5000);
		//driver.findElement(SelectResumeBtn).sendKeys(Keys.PAGE_DOWN);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(NextStepBtn));
		Thread.sleep(2000);
		driver.findElement(NextStepBtn).click();
		
	}

}
