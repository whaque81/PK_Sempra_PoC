package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalInformation {
	
	public static By Address_1_Txtbox = By.name("address1_RTiCandidate");
	public static By AddressCityTxtbox = By.name("city_RTiCandidate");
	public static By StateDD = By.xpath("//form/div[1]/div/div[2]/div[7]/div[1]/div/div/div/table");
	public static By StateValue = By.xpath("//span[contains(text(),'Colorado')]");
	public static By WillingnessToTravelDD = By.xpath("//form/div[1]/div/div[2]/div[10]/div[1]/div/div/div/table/tbody/tr/td[1]");
	public static By TravelValueLabel = By.xpath("//span[contains(text(),'None')]");
	public static By AnyRelativesDD = By.xpath("//*[@id='uniqName_2_3']/tbody/tr/td[1]");
	public static By AnyRelativesNoOption = By.xpath("//span[contains(text(),'No')]");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div/div[3]/div");
	
	public static void enterPersonalInfo(WebDriver driver, WebDriverWait wait) throws Exception{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Address_1_Txtbox));
		Thread.sleep(1000);
		driver.findElement(Address_1_Txtbox).click();
		driver.findElement(Address_1_Txtbox).sendKeys("Union Ave");
		//driver.findElement(AddressCityTxtbox).click();
		//driver.findElement(AddressCityTxtbox).sendKeys("Denver");
		
		/*driver.findElement(StateDD).click();
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(StateDD).sendKeys(Keys.ENTER);*/
		
		//driver.findElement(StateValue).click();
		driver.findElement(WillingnessToTravelDD).click();
		Thread.sleep(500);
		driver.findElement(TravelValueLabel).click();
		Thread.sleep(500);
		driver.findElement(AnyRelativesDD).click();
		Thread.sleep(500);
		//driver.findElement(AnyRelativesNoOption).click();
		driver.findElement(AnyRelativesDD).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(AnyRelativesDD).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(AnyRelativesDD).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(NextStepBtn).click();
		
		
		
	}

}
