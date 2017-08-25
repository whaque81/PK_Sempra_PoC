package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EEOPage {
	
	public static By RaceNotLatinoOption = By.xpath("//div[@widgetid='_latinoNo']");
	public static By ApplicantRaceOption = By.xpath("//div[@widgetid='eeoEthnicity_00003000']");
	public static By GenderMaleOption = By.xpath("//div[@widgetid='eeoGender_00001000']");
	public static By NotVeteranOption = By.xpath("//div[@widgetid='eeoVeteran_12']");
	public static By NoDisabilityOption = By.xpath("//div[@widgetid='eeoDisability_00002000']");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void answerEEOQns(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(RaceNotLatinoOption));
		Thread.sleep(2000);
		driver.findElement(RaceNotLatinoOption).click();
		driver.findElement(ApplicantRaceOption).click();
		driver.findElement(GenderMaleOption).click();
		driver.findElement(NotVeteranOption).click();
		driver.findElement(NoDisabilityOption).click();
		driver.findElement(NextStepBtn).click();
		
	}
	

}
