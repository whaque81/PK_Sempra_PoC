package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectSource {
	
	public static By CandidateSourceListBox = By.xpath("//table[@id='dijit_form_Select_10']/tbody/tr/td[2]");
	public static By CandidateSourceValue = By.xpath("//td[contains(text(),'Our Website')]");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void selectSource(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(CandidateSourceListBox));
		Thread.sleep(1000);
		//driver.findElement(CandidateSourceListBox).click();
		driver.findElement(By.xpath("//table[@id='dijit_form_Select_10']/tbody/tr/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(CandidateSourceValue).click();
		Thread.sleep(1000);
		driver.findElement(NextStepBtn).click();
		
	}

}
