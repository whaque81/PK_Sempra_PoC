package org.sempra.hr.adp.recruitingdesktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitingDesktopPage {
	
	public static By ReqsMenu = By.xpath("//nobr[text()='Reqs']");
	public static By CreateUtilitiesMenuItem = By.linkText("Create:  Utilities");
	
	public static void click_ReqsMenu(WebDriver driver){
		
		driver.findElement(ReqsMenu).click();
		
	}
	
	public static void click_CreateUtilitiesMenuItem(WebDriver driver){
			
			driver.findElement(CreateUtilitiesMenuItem).click();
			
		}
	
	

}
