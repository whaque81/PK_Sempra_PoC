package adp_demo;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sempra.hr.adp.careersite.CareerSiteSelfServicePage;
import org.sempra.hr.adp.careersite.ContactInformation;
import org.sempra.hr.adp.careersite.Documents;
import org.sempra.hr.adp.careersite.EEOPage;
import org.sempra.hr.adp.careersite.ESign;
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
import org.sempra.hr.adp.careersite.ReviewApplication;
import org.sempra.hr.adp.careersite.SelectSource;
import org.sempra.hr.adp.home.HomePage;
import org.sempra.hr.adp.login.LoginPage;
import org.sempra.hr.adp.recruitingdesktop.RecruitingDesktopPage;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_TS_ApplyToJob {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static Map<String, String> Data;
	public static String RecruitingDesktopWindowHandle = "";
	String ReqNumber;
	
    
    @Given("^a job req has been posted to an external career site$")
    public void a_job_req_has_been_posted_to_an_external_career_site() throws Throwable {
    	PropertiesConfiguration pc = new PropertiesConfiguration("ADP.properties");
        ReqNumber = pc.getProperty("ReqID").toString();
    }
	
	@Given("^I'm on a career site$")
	public void i_m_on_a_career_site() throws Throwable {
		setup();
		String CSpage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Launch Sempra career site", "Expected: User should be able to launch Sempra Career site | Actual: Sempra Career site opened successfully"+CSpage);
	}

	@When("^I select a job and I click on the Apply button to create an Account$")
	public void i_select_a_job_and_I_click_on_the_Apply_button_to_create_an_Account(DataTable arg1) throws Throwable {
		Map<String, String> AccountData = arg1.asMap(String.class, String.class);
		CareerSiteSelfServicePage.startApplying(driver, wait, AccountData);
		String crateAccountPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Create new account", "Expected: User should be able to create a new account | Actual: Account created successfully"+crateAccountPage);
	}

	@When("^fill in the required fields$")
	public void fill_in_the_required_fields(DataTable arg1) throws Throwable {
		Map<String, String> ContactInfoData = arg1.asMap(String.class, String.class);
		ContactInformation.enterContactInformation(driver, wait, ContactInfoData);
		String contactInfoPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Enter Contact Information", "Expected: User should be able to enter his/her contact information | Actual: Contact information entered successfully"+contactInfoPage);
		SelectSource.selectSource(driver, wait);
		
	}

	@When("^upload a Resume$")
	public void upload_a_Resume() throws Throwable {
		Documents.selectResume(driver, wait);
		String ResumePage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Resume upload", "Expected: User should be able to upload resume | Actual: Resume uploaded successfully"+ResumePage);
	}

	@When("^answer the EEO questions$")
	public void answer_the_EEO_questions() throws Throwable {
		EEOPage.answerEEOQns(driver, wait);
	}

	@When("^electronically Sign$")
	public void electronically_Sign() throws Throwable {
		ElectronicSignPage.acceptAgreement(driver, wait);
	}

	@When("^answer Preliminary Questions$")
	public void answer_Preliminary_Questions() throws Throwable {
	    PrelimQuestionsPage.answerPrelimsQns(driver, wait);
	}

	@When("^pass the Rehire Check$")
	public void pass_the_Rehire_Check() throws Throwable {
	    ReHireCheckPage.rehireCheck(driver, wait);
	}

	@When("^finalize the Application Form$")
	public void finalize_the_Application_Form() throws Throwable {
		PersonalInformation.enterPersonalInfo(driver, wait);
		EmploymentHistory.enterEmploymentHistory(driver, wait);
		EducationHistory.enterEducationHistory(driver, wait);
		Licenses.click_NextStepBtn(driver, wait);
		PersonalAffiliation.click_NextStepBtn(driver, wait);
		MilitaryHistory.click_NextBtn(driver, wait);
		ProfessionalReferences.provideReferences(driver, wait);
		ESign.eSignAndAccept(driver, wait);
		ReviewApplication.submitAppForm(driver, wait);
		String ApplicationSubmittedPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Submit job application", "Expected: User should be able to submit job application | Actual: Job application submitted successfully"+ApplicationSubmittedPage);
	}

	@Then("^I should be visible to the HR or Recruiting manager in their system as an applicant for the position$")
	public void i_should_be_visible_to_the_HR_or_Recruiting_manager_in_their_system_as_an_applicant_for_the_position() throws Throwable {
	    //driver.close();
	    driver.get("https://testadpvantage.adp.com");
	    LoginPage.Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
		Thread.sleep(11000);
	   HomePage.click_ProcessMenu(driver);
	   HomePage.click_AdditionalServicesSubMenu(driver);
	   HomePage.click_RecruitingMenuItem(driver);
	   Thread.sleep(8000);
	   Set <String> Handles = driver.getWindowHandles();
	   Iterator <String> it = Handles.iterator();
	   while(it.hasNext()){
		   RecruitingDesktopWindowHandle = it.next();	
		}
		driver.switchTo().window(RecruitingDesktopWindowHandle);
		PropertiesConfiguration pc = new PropertiesConfiguration("ADP.properties");
	    String ReqNumber = pc.getProperty("ReqID").toString();
		RecruitingDesktopPage.click_Req(driver, ReqNumber);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='_req_tab_req_candidates']/nobr")).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='outer_main_table']/tbody/tr[1]")));
		String CandiateTab = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Application received", "Expected: Hiring manager or the recruiter should be able to view all the candiates who applied for the job | Actual: Application seen"+CandiateTab);
		teardown();
		
	}
	
	public void setup() throws Exception{
		  reports = new ExtentReports("RM_TS_ApplyToJob.html",false,DisplayOrder.NEWEST_FIRST);
		  logger = reports.startTest("RM_TS_ApplyToJob");
		  DesiredCapabilities dc = new DesiredCapabilities();
		  dc.setBrowserName("firefox");
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		  wait = new WebDriverWait(driver,90);
		  driver.manage().window().maximize();
		  driver.get("https://recruiting-nuat.adp.com/srccar/public/RTI.home?d=SempraEnergy&_icx=v02n4qqAxGBU4EoUR8iPV%2FSGH1Mf5LZP1d0un7reeZM2BIpBY0UB%2Ftpbq8bf5bRLnDy&c=49493&_dissimuloSSO=7aRGj8pwfUg:w_4PO3n8JuD2J-eGNgh-UHMve4s");
		  
	  }
    
	  public void teardown() throws Exception{
		  Thread.sleep(2000);
		  driver.quit();
		  reports.endTest(logger);
		  reports.flush();	  
		  reports.close();
		  
	  }

	public String getscreenshot() throws Exception 
	{
	    UUID uuid = UUID.randomUUID();
		  String strFile = "src/test/results/screenshot-"+uuid+".png";
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File(strFile));
	    return strFile;
	}	


}
