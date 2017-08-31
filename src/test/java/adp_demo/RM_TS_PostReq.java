package adp_demo;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sempra.hr.adp.careersite.CareerSiteSelfServicePage;
import org.sempra.hr.adp.home.HomePage;
import org.sempra.hr.adp.login.LoginPage;
import org.sempra.hr.adp.recruitingdesktop.ModifyReqPage;
import org.sempra.hr.adp.recruitingdesktop.PublishReq;
import org.sempra.hr.adp.recruitingdesktop.RecruitingDesktopPage;
import org.sempra.hr.adp.recruitingdesktop.ReqFormPage;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_TS_PostReq {
	
	public static WebDriver driver;
	public static String RecruitingDesktopWindowHandle = "";
	public static String NewWindow_1 = "";
	public static String ReqNumber="";
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static Map<String, String> Data;
	

   @Given("^I am logged on to the administration side of MyInfo as an HR or Recruitment Manager$")
   public  void i_am_logged_on_to_the_administration_side_of_MyInfo_as_an_HR_or_Recruitment_Manager() throws Exception {
	   setup();
	   LoginPage.Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
	  // Thread.sleep(11000);
	   String homepage = logger.addScreenCapture(getscreenshot());
	   logger.log(LogStatus.PASS, "Logining into MyInfo as an HR or Recruitment Manager", "Expected: User should be able to login into MyInfo | Actual: User <whaque@prokarma.com> logged in successfully"+homepage);
  }
   
   @When("^I open create new utilities req form$")
   public void i_open_create_new_utilities_req_form() throws Exception {
       HomePage.click_ProcessMenu(driver);
	   HomePage.click_AdditionalServicesSubMenu(driver);
	   HomePage.click_RecruitingMenuItem(driver);
	   //Thread.sleep(8000);
	   Set <String> Handles = driver.getWindowHandles();
	   Iterator <String> it = Handles.iterator();
	   while(it.hasNext()){
		   RecruitingDesktopWindowHandle = it.next();	
		}
		driver.switchTo().window(RecruitingDesktopWindowHandle);
		String RDpage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Launch Recruiting Desktop", "Expected: User should be able to launch Recruiting Desktop app | Actual: Recruiting Desktop website opened successfully"+RDpage);
		RecruitingDesktopPage.click_ReqsMenu(driver);
		RecruitingDesktopPage.click_CreateUtilitiesMenuItem(driver);
		//Thread.sleep(8000);
		String createReqPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Navigate to Create Utils Req form", "Expected: User should be able to navigate to Create new Req form | Actual: Create Req form opened successfully"+createReqPage);
		
   }
   
   @When("^I fill in the required info and then click Create button$")
   public void i_fill_in_the_required_info(DataTable reqData)  throws Exception {
	    Map<String, String> ReqData = reqData.asMap(String.class, String.class);
		ReqFormPage.selectUnionJob(driver, ReqData.get("UnionJob").toString());
		ReqFormPage.selectECRenewal_QuickHire(driver, ReqData.get("ECRenewal_Quick_Hire").toString());
		ReqFormPage.selectCompany(driver, ReqData.get("Company").toString());
		ReqFormPage.selectDepartment(driver, ReqData.get("Department").toString());
		ReqFormPage.selectDivision(driver, ReqData.get("Division").toString());
		ReqFormPage.selectCostCenter(driver, ReqData.get("CostCenter").toString());
		ReqFormPage.selectBudgetedPosition(driver, ReqData.get("BudgetedPosition").toString());
		ReqFormPage.setSharedServices(driver, ReqData.get("SharedServices").toString());
		ReqFormPage.selectEligibleForRelocation(driver, ReqData.get("Eligible_for_Relocation").toString());
		ReqFormPage.selectEligibleForReferral(driver, ReqData.get("Eligible_for_Referral_Program").toString());
		ReqFormPage.selectDOTSafetySensitive(driver, ReqData.get("DOT_safety_Sensitive").toString());
		ReqFormPage.selectLocation(driver, ReqData.get("Location").toString());
		ReqFormPage.setBuilding(driver, ReqData.get("DesiredBuilding_SeatLocation").toString());
		ReqFormPage.selectStandardHrs(driver, ReqData.get("StandardHours").toString());
		ReqFormPage.selectJobTitle(driver, ReqData.get("InternalJobTitle_JobCode").toString());
		ReqFormPage.setExtrnJobtitle(driver, ReqData.get("External_PublishedJobTitle").toString());
		ReqFormPage.selectBasePay(driver, ReqData.get("BasePayType").toString());
		ReqFormPage.selectPositionType(driver, ReqData.get("PositionType").toString());
		ReqFormPage.selectRegularTemp(driver, ReqData.get("Regular_Temp").toString());
		ReqFormPage.selectEmployeeClass(driver, ReqData.get("EmployeeClass").toString());
		ReqFormPage.setBusinessJustification(driver, ReqData.get("BusinessJustification_for_Position").toString());
		ReqFormPage.selectReplacementAddition(driver, ReqData.get("Replacement_Addition").toString());
		ReqFormPage.selectHiringManager(driver, ReqData.get("HiringMgr").toString());
		ReqFormPage.selectRecruiter(driver, ReqData.get("Recruiter").toString());
		ReqFormPage.selectAreaOfInterest(driver, ReqData.get("AreaofInterest").toString());
		ReqFormPage.selectPostingLocation(driver, ReqData.get("PostingLocation").toString());
		ReqFormPage.setExternalDescription(driver, ReqData.get("ExternalDescription").toString());
		ReqFormPage.setExternalRequirements(driver, ReqData.get("ExternalRequirements").toString());
		ReqFormPage.setInternalDescription(driver, ReqData.get("InternalDescription").toString());
		ReqFormPage.setInternalQualification(driver, ReqData.get("InternalQualification").toString());
		ReqFormPage.setApprover(driver, ReqData.get("Approver_1").toString());
		click_Create_button();
		}

   
   public void click_Create_button() throws Exception {
	    ReqFormPage.createReqs(driver);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().window(RecruitingDesktopWindowHandle);
		ReqNumber = ReqFormPage.getReqNumber(driver);
		PropertiesConfiguration pc = new PropertiesConfiguration("ADP.properties");
        pc.setProperty("ReqID", ReqNumber);
        pc.save();
		Thread.sleep(1000);
		String newReqPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Create a new Req by filling the form appropriately", "Expected: User should be able to  Create a new Req | Actual: New Utils Req "+ReqNumber+" created successfully"+newReqPage);
	}
   
   @When("^when the Req is Approved$")
   public void the_Req_is_Approved() throws Exception {
	   ReqFormPage.click_HomeMenu(driver);
	   ReqFormPage.click_RecruitingDesktopMenuItem(driver);
	   //Thread.sleep(4000);
	   RecruitingDesktopPage.selectDisposition(driver, "Granted");
	   String approveReqPage = logger.addScreenCapture(getscreenshot());
	   logger.log(LogStatus.PASS, "Approve newly created Req", "Expected: Designated Approver should be able to Aprrove the new Req | Actual: New Utils Req "+ReqNumber+" Approved successfully"+approveReqPage);
	   RecruitingDesktopPage.click_SubmitBtn(driver); //Granted
	   Thread.sleep(2000);
   }
   
   @When("^Activated$")
   public void activated() throws Exception {
	   RecruitingDesktopPage.click_Req(driver, ReqNumber);
	   //Thread.sleep(4000);
	   ModifyReqPage.selectReqStatus(driver, "Active");
	   ModifyReqPage.saveModifiedReq(driver,RecruitingDesktopWindowHandle);
	   String modifyReqPage = logger.addScreenCapture(getscreenshot());
	   logger.log(LogStatus.PASS, "Activate newly created Req", "Expected: Recruiter should be able to Activate the new Req | Actual: New Utils Req "+ReqNumber+" Activated successfully"+modifyReqPage);
   }
   
   @When("^Published$")
   public void published() throws Exception {
	   ModifyReqPage.selectPublishTab(driver);
	   PublishReq.click_PostLink(driver);
	   PublishReq.PostJobToCareerSite(driver);
	   Thread.sleep(6000);   
	   String publishReqPage = logger.addScreenCapture(getscreenshot());
	   logger.log(LogStatus.PASS, "Publish newly created Req", "Expected: Recruiter should be able to Publish the new Req | Actual: New Utils Req "+ReqNumber+" Published successfully"+publishReqPage);
	   
   }
   
   @Then("^the job posting should Show on the company career website$")
   public void the_job_posting_should_Show_on_the_company_career_website() throws Exception {
	   RecruitingDesktopPage.click_HomeMenu(driver);
	   RecruitingDesktopPage.click_SempraEnergyCSMenuItem(driver);
	   Thread.sleep(5000);
	   Set <String> NewHandles = driver.getWindowHandles();
	   Iterator <String> it1 = NewHandles.iterator();
	   while(it1.hasNext()){
			NewWindow_1 = it1.next();
		}
		driver.switchTo().window(NewWindow_1);
		CareerSiteSelfServicePage.searchJob(driver, ReqNumber);
		String jobSearchPage = logger.addScreenCapture(getscreenshot());
		logger.log(LogStatus.PASS, "Search newly created Req on the Career Site", "Expected: Job seekers should be able to search the newly created Req on the career site portal | Actual: Job with Req "+ReqNumber+" found successfully"+jobSearchPage);
		teardown();
   }
  
	  public void setup() throws Exception{
		  reports = new ExtentReports("RM_TS_PostReq.html",false,DisplayOrder.NEWEST_FIRST);
		  logger = reports.startTest("RM_TS_PostReq");
		  DesiredCapabilities dc = new DesiredCapabilities();
		  dc.setBrowserName("firefox");
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		  driver.manage().window().maximize();
		  driver.get("https://testadpvantage.adp.com");
		  
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
