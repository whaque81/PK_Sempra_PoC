package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicSignPage {
	
	public static By ESChkBox = By.name("accept");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void acceptAgreement(WebDriver driver, WebDriverWait wait){
		wait.until(ExpectedConditions.visibilityOfElementLocated(ESChkBox));
		driver.findElement(ESChkBox).click();
		driver.findElement(NextStepBtn).click();
		
	}
	

}
