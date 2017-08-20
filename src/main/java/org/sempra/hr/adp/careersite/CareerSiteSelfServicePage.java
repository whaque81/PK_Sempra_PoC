package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerSiteSelfServicePage {
	
	public static By JobSearchBtn = By.xpath("//button[contains(text(),'Search for Jobs!')]");
	public static By ReqNumLabel = By.xpath("//span[@class='jobnum']");
	
	public static void searchJob(WebDriver driver, String ReqNumber) throws Exception{
		
		while(!driver.findElements(ReqNumLabel).get(0).getText().trim().equals(ReqNumber)) {
		driver.findElement(JobSearchBtn).click();
		Thread.sleep(2000);}
		if(driver.findElements(ReqNumLabel).get(0).getText().trim().equals(ReqNumber)){
			System.out.println("Posted Job Found");
		}
		
		
	}

}
