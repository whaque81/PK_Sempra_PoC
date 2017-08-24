package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Licenses {
	
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	public static void click_NextStepBtn(WebDriver driver, WebDriverWait wait){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextStepBtn));
		driver.findElement(NextStepBtn).click();
	}
	

}
