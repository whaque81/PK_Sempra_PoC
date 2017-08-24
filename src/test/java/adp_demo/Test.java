package adp_demo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sempra.hr.adp.careersite.CareerSiteSelfServicePage;
import org.sempra.hr.adp.careersite.ContactInformation;
import org.sempra.hr.adp.careersite.Documents;
import org.sempra.hr.adp.careersite.EEOPage;
import org.sempra.hr.adp.careersite.EducationHistory;
import org.sempra.hr.adp.careersite.ElectronicSignPage;
import org.sempra.hr.adp.careersite.EmploymentHistory;
import org.sempra.hr.adp.careersite.Licenses;
import org.sempra.hr.adp.careersite.MilitaryHistory;
import org.sempra.hr.adp.careersite.PersonalAffiliation;
import org.sempra.hr.adp.careersite.PersonalInformation;
import org.sempra.hr.adp.careersite.PrelimQuestionsPage;
import org.sempra.hr.adp.careersite.ProfessionalReferences;
import org.sempra.hr.adp.careersite.ReHireCheckPage;
import org.sempra.hr.adp.careersite.SelectSource;

public class Test {
	
	public static String NewWindow = "";
	public static String NewWindow_1 = "";

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		WebDriverWait wait = new WebDriverWait(driver,60);
		driver.manage().window().maximize();
		driver.get("https://recruiting-nuat.adp.com/srccar/public/RTI.home?d=SempraEnergy&_icx=v02n4qqAxGBU4EoUR8iPV%2FSGH1Mf5LZP1d0un7reeZM2BIpBY0UB%2Ftpbq8bf5bRLnDy&c=49493&_dissimuloSSO=7aRGj8pwfUg:w_4PO3n8JuD2J-eGNgh-UHMve4s");
		CareerSiteSelfServicePage.startApplying(driver, wait);
		ContactInformation.enterContactInformation(driver, wait);
		SelectSource.selectSource(driver, wait);
		Documents.selectResume(driver, wait);
		EEOPage.answerEEOQns(driver, wait);
		ElectronicSignPage.acceptAgreement(driver, wait);
		PrelimQuestionsPage.answerPrelimsQns(driver, wait);
		ReHireCheckPage.rehireCheck(driver, wait);
		PersonalInformation.enterPersonalInfo(driver, wait);
		EmploymentHistory.enterEmploymentHistory(driver, wait);
		EducationHistory.enterEducationHistory(driver, wait);
		Licenses.click_NextStepBtn(driver, wait);
		PersonalAffiliation.click_NextStepBtn(driver, wait);
		MilitaryHistory.click_NextBtn(driver, wait);
		ProfessionalReferences.provideReferences(driver, wait);
		
		
		

	}

}
