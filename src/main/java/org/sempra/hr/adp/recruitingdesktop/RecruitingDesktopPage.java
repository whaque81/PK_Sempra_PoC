package org.sempra.hr.adp.recruitingdesktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RecruitingDesktopPage {
	
	public static By ReqsMenu = By.xpath("//nobr[text()='Reqs']");
	public static By CreateUtilitiesMenuItem = By.linkText("Create:  Utilities");
	public static By HomeMenu = By.xpath("//nobr[text()='Home']");
	public static By RecruitingDesktopMenuItem = By.linkText("Recruiting Desktop");
	public static By DispositionDropDown = By.xpath("//td[contains(@id,'widget_hmportal_candidate_disposition__reqapprovalstatus')]/span/select");
	public static By SubmitBtn = By.id("null_button");
	public static By SempraEnergyCSMenuItem = By.xpath("//*[@id='navigatorMenuItem100643693']/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span/span/a");
	
	public static void click_ReqsMenu(WebDriver driver){
		
		driver.findElement(ReqsMenu).click();
		
	}
	
	public static void click_CreateUtilitiesMenuItem(WebDriver driver){
			
			driver.findElement(CreateUtilitiesMenuItem).click();
			
		}
	
	public static void click_HomeMenu(WebDriver driver){
			
			driver.findElement(HomeMenu).click();
			
		}
	
	public static void click_RecruitingDesktopMenuItem(WebDriver driver){
			
			driver.findElement(RecruitingDesktopMenuItem).click();
			
		}
	
	public static void selectDisposition(WebDriver driver, String strValue){
		WebElement disposition = driver.findElement(DispositionDropDown);
		Select dropdown = new Select(disposition);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void click_SubmitBtn(WebDriver driver){
		
		driver.findElement(SubmitBtn).click();
		
	}
	
	public static void click_Req(WebDriver driver,String ReqNumber) throws Exception{
		RecruitingDesktopPage.click_ReqsMenu(driver);
		Thread.sleep(1000);
		String link = "//nobr[text()='"+ReqNumber+"']";
		By ReqLink = By.xpath(link);
		driver.findElement(ReqLink).click();
		
	}
	
	public static void click_SempraEnergyCSMenuItem(WebDriver driver){
		
		driver.findElement(SempraEnergyCSMenuItem).click();
		
	}
	
	

}
