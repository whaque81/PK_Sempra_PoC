package org.sempra.hr.adp.careersite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ESign {
	
	public static By ESignTxtBox = By.name("esigABSignature_RTiAssignment");
	public static By AcceptOption = By.id("dijit_form_RadioButton_0");
	public static By NextStepBtn = By.id("dijit__WidgetBase_56");
	
	public static void eSignAndAccept(WebDriver driver, WebDriverWait wait){
		wait.until(ExpectedConditions.visibilityOfElementLocated(ESignTxtBox));
		driver.findElement(ESignTxtBox).sendKeys("Wasim Haque");
		driver.findElement(AcceptOption).click();
		driver.findElement(NextStepBtn).click();
		
	}

}
