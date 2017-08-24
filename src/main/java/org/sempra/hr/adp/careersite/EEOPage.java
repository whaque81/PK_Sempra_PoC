package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EEOPage {
	
	public static By RaceNotLatinoOption = By.id("_latinoNo");
	public static By ApplicantRaceOption = By.id("eeoEthnicity_00003000");
	public static By GenderMaleOption = By.id("eeoGender_00001000");
	public static By NotVeteranOption = By.id("eeoVeteran_12");
	public static By NoDisabilityOption = By.id("eeoDisability_00002000");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void answerEEOQns(WebDriver driver, WebDriverWait wait){
		wait.until(ExpectedConditions.visibilityOfElementLocated(RaceNotLatinoOption));
		driver.findElement(RaceNotLatinoOption).click();
		driver.findElement(ApplicantRaceOption).click();
		driver.findElement(GenderMaleOption).click();
		driver.findElement(NotVeteranOption).click();
		driver.findElement(NoDisabilityOption).click();
		driver.findElement(NextStepBtn).click();
		
	}
	

}
