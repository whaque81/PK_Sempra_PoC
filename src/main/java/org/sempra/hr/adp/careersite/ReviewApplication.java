package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewApplication {
	
	public static By NextStepBtn = By.id("dijit__WidgetBase_64");
	public static By SubmitBtn = By.id("dijit__WidgetBase_69");
	public static By ApplicationCompleteLabel = By.xpath("//div[contains(text(),'Application Complete')]");
	
	public static void submitAppForm(WebDriver driver, WebDriverWait wait){
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextStepBtn));
		driver.findElement(NextStepBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn));
		driver.findElement(SubmitBtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ApplicationCompleteLabel));
	}
	

}
