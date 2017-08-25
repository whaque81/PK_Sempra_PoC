package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalAffiliation {
	
	public static By NextStepBtn = By.xpath("//form/div[2]/div/div[3]/div");
	
	public static void click_NextStepBtn(WebDriver driver, WebDriverWait wait) throws Exception{
	//wait.until(ExpectedConditions.visibilityOfElementLocated(NextStepBtn));
	Thread.sleep(6000);	
	driver.findElement(By.name("zzcanAchieve_RTiCustomCandidate")).click();
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(NextStepBtn));
	driver.findElement(NextStepBtn).click();
	}

}
