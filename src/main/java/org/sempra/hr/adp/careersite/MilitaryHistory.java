package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MilitaryHistory {
	
	public static By NextStepBtn = By.xpath("//form/div[2]/div/div[3]/div");
	
	public static void click_NextBtn(WebDriver driver, WebDriverWait wait) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextStepBtn));
		Thread.sleep(1000);
		driver.findElement(By.name("zzabMilitaryBranch$1_RTiCustomCandidate")).click();
		Thread.sleep(500);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(NextStepBtn));
		driver.findElement(NextStepBtn).click();
	}

}
