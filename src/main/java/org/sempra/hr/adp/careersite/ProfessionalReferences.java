package org.sempra.hr.adp.careersite;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfessionalReferences {
	
	public static By FirstNameTxtBox = By.name("$$referenceFName_1_RTiCandidate");
	public static By LastNameTxtBox = By.name("$$referenceLName_1_RTiCandidate");
	public static By RelationshipTxtBox = By.name("$$referenceRelationship_1_RTiCandidate");
	public static By CityTxtBox = By.name("$$referenceCity_1_RTiCandidate");
	public static By CountryDD = By.xpath("//form/div[1]/div/div[2]/div[5]/div[4]/div[2]/div/div/div/table/tbody/tr/td[1]");
	public static By CountryValue = By.xpath("//*[@id='dijit_MenuItem_665_text']/span");
	public static By StateDD = By.xpath("//form/div[1]/div/div[2]/div[5]/div[5]/div[1]/div/div/div/table/tbody/tr/td[1]");
	public static By StateValue = By.xpath("//span[contains(text(),'California')]");
	public static By RefPhoneNumber = By.name("$$referenceHomePhone_1_RTiCandidate");
	public static By NextBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	public static void provideReferences(WebDriver driver, WebDriverWait wait) throws Exception {//, Map<String, String> ReferencesData) throws Exception{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameTxtBox));
		/*driver.findElement(FirstNameTxtBox).sendKeys(ReferencesData.get("FName").toString());
		driver.findElement(LastNameTxtBox).sendKeys(ReferencesData.get("LName").toString());
		driver.findElement(RelationshipTxtBox).sendKeys(ReferencesData.get("Relationship").toString());
		driver.findElement(RefPhoneNumber).sendKeys(ReferencesData.get("PhoneNumber").toString());
		driver.findElement(CityTxtBox).sendKeys(ReferencesData.get("City").toString());*/
		driver.findElement(FirstNameTxtBox).click();
		driver.findElement(FirstNameTxtBox).sendKeys("Paul");
		driver.findElement(LastNameTxtBox).click();
		driver.findElement(LastNameTxtBox).sendKeys("Ballard");
		driver.findElement(RelationshipTxtBox).click();
		driver.findElement(RelationshipTxtBox).sendKeys("Ex-Boss");
		driver.findElement(RefPhoneNumber).click();
		driver.findElement(RefPhoneNumber).sendKeys("7777777777");
		driver.findElement(CityTxtBox).click();
		driver.findElement(CityTxtBox).sendKeys("Las Vegas");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(CountryDD));
		driver.findElement(CountryDD).click();
		Thread.sleep(1000);
		driver.findElement(CountryDD).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(CountryDD).sendKeys(Keys.ENTER);
		//driver.findElement(CountryValue).click();
		driver.findElement(StateDD).click();
		Thread.sleep(1000);
		driver.findElement(StateValue).click();
		Thread.sleep(1000);
		driver.findElement(NextBtn).click();
		
		
		
		
		
	}
	
	

}
