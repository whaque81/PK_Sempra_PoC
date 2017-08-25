package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ESign {
	
	public static By ESignTxtBox = By.name("esigABSignature_RTiAssignment");
	public static By AcceptOption = By.xpath("//form/div[1]/div/div[2]/div[3]/div/div[2]/div/div/nobr/label[1]/div");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	public static void eSignAndAccept(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ESignTxtBox));
		Thread.sleep(1000);
		driver.findElement(ESignTxtBox).click();
		driver.findElement(ESignTxtBox).sendKeys("Bingo Duck");
		driver.findElement(AcceptOption).click();
		driver.findElement(NextStepBtn).click();
		
	}

}
