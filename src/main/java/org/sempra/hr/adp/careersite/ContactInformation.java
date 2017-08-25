package org.sempra.hr.adp.careersite;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactInformation {
	
	public static By ApplicantFirstName = By.name("firstName");
	public static By ApplicantLastName = By.name("lastName");
	public static By ApplicantPhone = By.name("phone");
	public static By ApplicantZipCode = By.name("zip");
	public static By NextStepBtn = By.xpath("//form[1]/div[2]/div[2]/div/div");
	
	public static void enterContactInformation(WebDriver driver, WebDriverWait wait) throws Exception {//, Map<String, String> ContactInfoData){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(ApplicantFirstName));
		Thread.sleep(3000);
		/*driver.findElement(ApplicantFirstName).sendKeys(ContactInfoData.get("FirstName").toString());
		driver.findElement(ApplicantLastName).sendKeys(ContactInfoData.get("LastName").toString());
		driver.findElement(ApplicantPhone).sendKeys(ContactInfoData.get("Phone").toString());
		driver.findElement(ApplicantZipCode).sendKeys(ContactInfoData.get("ZipCode").toString());*/
		driver.findElement(ApplicantFirstName).click();
		driver.findElement(ApplicantFirstName).sendKeys("Bingo");
		driver.findElement(ApplicantLastName).click();
		driver.findElement(ApplicantLastName).sendKeys("Duck");
		driver.findElement(ApplicantPhone).click();
		driver.findElement(ApplicantPhone).sendKeys("2222222222");
		driver.findElement(ApplicantZipCode).click();
		driver.findElement(ApplicantZipCode).sendKeys("80237");
		driver.findElement(NextStepBtn).click();
		
	}

}
