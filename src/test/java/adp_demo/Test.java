package adp_demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sempra.hr.adp.home.HomePage;
import org.sempra.hr.adp.login.LoginPage;
import org.sempra.hr.adp.recruitingdesktop.RecruitingDesktopPage;
import org.sempra.hr.adp.recruitingdesktop.ReqFormPage;

public class Test {
	
	public static String NewWindow = "";

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		driver.manage().window().maximize();
		driver.get("https://testadpvantage.adp.com");
		LoginPage.Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
		Thread.sleep(15000);
		//String ParentWindow = driver.getWindowHandle();
		//System.out.println("Parent"+ParentWindow);
		HomePage.click_ProcessMenu(driver);
		HomePage.click_AdditionalServicesSubMenu(driver);
		HomePage.click_RecruitingMenuItem(driver);
		Thread.sleep(10000);
		
		Set <String> Handles = driver.getWindowHandles();
		Iterator <String> it = Handles.iterator();
		while(it.hasNext()){
			NewWindow = it.next();
			//System.out.println(NewWindow);
			
		}
		driver.switchTo().window(NewWindow);
		
		
		/*String newWindowHandle = Handles.iterator().next();		
		driver.switchTo().window(newWindowHandle);
		Thread.sleep(2000);
	    newWindowHandle = Handles.iterator()args.;	
	    driver.switchTo().window(newWindowHandle);*/
		RecruitingDesktopPage.click_ReqsMenu(driver);
		RecruitingDesktopPage.click_CreateUtilitiesMenuItem(driver);
		Thread.sleep(10000);
		
		ReqFormPage.selectUnionJob(driver, "No");
		ReqFormPage.selectECRenewal_QuickHire(driver, "Yes");
		ReqFormPage.selectCompany(driver, "Sempra Energy-10");
		ReqFormPage.selectDepartment(driver, "Enterprise Archi");
		ReqFormPage.selectDivision(driver, "Accounting & Finance - 50020");
		ReqFormPage.selectCostCenter(driver, "ACCTG & FINAN CONFER-SAM1100");
		ReqFormPage.selectBudgetedPosition(driver, "Yes");
		ReqFormPage.setSharedServices(driver, "blah");
		ReqFormPage.selectEligibleForRelocation(driver, "Yes");
		ReqFormPage.selectEligibleForReferral(driver, "Eligible");
		ReqFormPage.selectDOTSafetySensitive(driver, "No");
		ReqFormPage.selectLocation(driver, "Sempra Energy Headquarters-9304");
		ReqFormPage.setBuilding(driver, "HQ 04-558");
		ReqFormPage.selectStandardHrs(driver, "40");
		ReqFormPage.selectJobTitle(driver, "Assoc Busn Analyst-C10829");
		ReqFormPage.setExtrnJobtitle(driver, "Busn Analyst");
		ReqFormPage.selectBasePay(driver, "Salary");
		ReqFormPage.selectPositionType(driver, "Full-time");
		ReqFormPage.selectRegularTemp(driver, "Regular");
		ReqFormPage.selectEmployeeClass(driver, "Regular");
		ReqFormPage.setBusinessJustification(driver, "This is a Test Justification");
		ReqFormPage.selectReplacementAddition(driver, "New");
		ReqFormPage.selectHiringManager(driver, "Wasim");
		ReqFormPage.selectRecruiter(driver, "Wasim Haque");
		ReqFormPage.selectAreaOfInterest(driver, "Plant Operations");
		ReqFormPage.selectPostingLocation(driver, "San Diego Downtown");
		ReqFormPage.setExternalDescription(driver, "This is a Test Description");
		ReqFormPage.setExternalRequirements(driver, "This is a Test Requirement");
		ReqFormPage.setInternalDescription(driver, "This is a Test Description");
		ReqFormPage.setInternalQualification(driver, "This is a Test Qualification");
		ReqFormPage.setApprover(driver, "Wasim");
		ReqFormPage.createReqs(driver);
		Thread.sleep(6000);
		Robot rb =new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		//driver.findElement(By.xpath("//*[contains(text(), 'OK')]")).click();
		
		//driver.quit();

	}

}
