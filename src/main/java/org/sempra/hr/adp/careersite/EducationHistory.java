package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EducationHistory {
	
	public static By DegreeLevelDD  = By.xpath("//form/div[1]/div/div[2]/div[5]/div[1]/div[1]/div/div/div/table");
	public static By DegreeLevelBachelorsValue = By.xpath("//span[contains(text(),'Bachelor')]");
	public static By UniversityTxtBox = By.name("$$educationSchoolName_1_RTiCandidate");
	public static By CityTxtBox = By.name("$$educationCity_1_RTiCandidate");
	public static By CountryDD = By.xpath("//form/div[1]/div/div[2]/div[5]/div[4]/div[1]/div/div/div/table");
	public static By CountryValue = By.xpath("//*[@id='dijit_MenuItem_591_text']/span");
	public static By StateDD = By.xpath("//form/div[1]/div/div[2]/div[5]/div[4]/div[2]/div/div/div/table");
	public static By StateValue = By.xpath("//span[contains(text(),'Colorado')]");
	public static By GraduatedDD = By.xpath("//form/div[1]/div/div[2]/div[5]/div[5]/div[2]/div/div/div/table");
	public static By GraduatedYesValue = By.xpath("//span[contains(text(),'Yes')]");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	public static void enterEducationHistory(WebDriver driver, WebDriverWait wait) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(DegreeLevelDD));
		driver.findElement(DegreeLevelDD).click();
		Thread.sleep(1000);
		driver.findElement(DegreeLevelBachelorsValue).click();
		driver.findElement(UniversityTxtBox).sendKeys("University of Denver CO");
		driver.findElement(CityTxtBox).sendKeys("Denver");
		driver.findElement(CountryDD).clear();
		Thread.sleep(1000);
		driver.findElement(CountryDD).sendKeys(Keys.DOWN);
		driver.findElement(CountryDD).sendKeys(Keys.ENTER);
		driver.findElement(StateDD).click();
		Thread.sleep(1000);
		driver.findElement(StateValue).click();
		driver.findElement(GraduatedDD).clear();
		Thread.sleep(1000);
		driver.findElement(GraduatedYesValue).click();
		driver.findElement(NextStepBtn);
		
		
	}
	
	

}
