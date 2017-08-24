package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrelimQuestionsPage {
	
	public static By AgeYesOption = By.xpath("//form[1]/div[1]/div/div[3]/div/label[2]/div/input");
	public static By CurrentlyEmployedNoOption = By.xpath("//form[1]/div[1]/div/div[4]/div/label[3]/div/input");
	public static By DiplomaGEDYesOption = By.xpath("//form[1]/div[1]/div/div[6]/div/label[2]/div/input");
	public static By LegalWorkAuthYesOption = By.id("dijit_form_RadioButton_0");
	public static By CertifyInfoYesOption = By.id("dijit_form_RadioButton_2");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void answerPrelimsQns(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(AgeYesOption));
		driver.findElement(AgeYesOption).click();
		driver.findElement(CurrentlyEmployedNoOption).click();
		driver.findElement(DiplomaGEDYesOption).click();
		driver.findElement(LegalWorkAuthYesOption).click();
		driver.findElement(CertifyInfoYesOption).click();
		driver.findElement(NextStepBtn).click();
		
	}

	

}