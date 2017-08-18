package org.sempra.hr.adp.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public static By ProcessMenu = By.id("Process_navItem_label");
	public static By AdditionalServicesSubMenu = By.xpath("//span[text()='Additional Services']");
	public static By RecruitingMenuItem = By.xpath("//span[text()='Recruiting']");
	
	public static void click_ProcessMenu(WebDriver driver){
		
		driver.findElement(ProcessMenu).click();
		
	}
	
public static void click_AdditionalServicesSubMenu(WebDriver driver){
		
		driver.findElement(AdditionalServicesSubMenu).click();
		
	}

public static void click_RecruitingMenuItem(WebDriver driver){
	
	driver.findElement(RecruitingMenuItem).click();
	
}
	
	

}
