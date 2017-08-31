package org.sempra.hr.adp.recruitingdesktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifyReqPage {
	
	public static By ReqModifyTab = By.xpath("//*[@id='_req_tab_req_modify']/nobr");
	public static By ReqStatusDropDown = By.name("status_RTiReq");
	public static By SaveReqBtn = By.id("_reqform_save_button");
	public static By PublishReqTab = By.xpath("//*[@id='_req_tab_req_csite']/nobr");
	
	public static void selectReqStatus(WebDriver driver, String strStatus) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ReqModifyTab));
		Thread.sleep(2000);
		driver.findElement(ReqModifyTab).click();
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ReqStatusDropDown));
		Thread.sleep(1000);
		WebElement status = driver.findElement(ReqStatusDropDown);
		Select dropdown = new Select(status);
		dropdown.selectByVisibleText(strStatus);	
			
		}
	
	public static void saveModifiedReq(WebDriver driver, String windowHandle) throws Exception{
		driver.findElement(SaveReqBtn).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().window(windowHandle);
		
	}
	
	public static void selectPublishTab(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PublishReqTab));
		driver.findElement(PublishReqTab).click();
		Thread.sleep(2000);
	}
		

}
