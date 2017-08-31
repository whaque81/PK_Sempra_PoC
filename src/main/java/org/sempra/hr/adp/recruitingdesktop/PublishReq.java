package org.sempra.hr.adp.recruitingdesktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublishReq {
	
	public static By PostLink = By.xpath("//a[text()='click here']");
	public static By SiteSelector = By.xpath("//input[@value='CS']");
	public static By CareerSiteList = By.xpath("//select[@name='careerSiteID']");
	public static By SaveBtn = By.id("__save_button");
	
	public static void click_PostLink(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PostLink));
		Thread.sleep(1000);
		driver.findElement(PostLink).click();		
		//Thread.sleep(2000);
	}
	
	public static void PostJobToCareerSite(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SiteSelector));
		Thread.sleep(1000);
		driver.findElement(SiteSelector).click();
		WebElement site = driver.findElement(CareerSiteList);
		Select dropdown = new Select(site);
		dropdown.selectByVisibleText("Sempra Energy");
		driver.findElement(SaveBtn).click();
		
	}

}
