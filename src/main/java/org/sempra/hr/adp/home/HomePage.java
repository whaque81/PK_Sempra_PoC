package org.sempra.hr.adp.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public static By ProcessMenu = By.id("Process_navItem_label");
	public static By AdditionalServicesSubMenu = By.xpath("//span[text()='Additional Services']");
	public static By RecruitingMenuItem = By.xpath("//span[text()='Recruiting']");
	
	public static void click_ProcessMenu(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProcessMenu));
		Thread.sleep(3000);
		driver.findElement(ProcessMenu).click();
		
	}
	
public static void click_AdditionalServicesSubMenu(WebDriver driver) throws Exception{
		Thread.sleep(1000);
		driver.findElement(AdditionalServicesSubMenu).click();
		
	}

public static void click_RecruitingMenuItem(WebDriver driver) throws Exception{
	Thread.sleep(1000);
	driver.findElement(RecruitingMenuItem).click();
	
}
	
	

}
