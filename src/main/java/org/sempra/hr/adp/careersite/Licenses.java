package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Licenses {
	
	public static By NextStepBtn = By.xpath("//form/div[2]/div/div[3]/div");
	
	public static void click_NextStepBtn(WebDriver driver, WebDriverWait wait) throws Exception{
		
		Thread.sleep(5000);
		driver.findElement(By.name("$$licenseDesc_1_RTiCandidate")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//form/div[1]/div/div[2]/div[5]/div[4]/div[2]/div/div/div/table/tbody/tr/td[1]")));
		Thread.sleep(1000);
		driver.findElement(NextStepBtn).click();
	}
	

}
