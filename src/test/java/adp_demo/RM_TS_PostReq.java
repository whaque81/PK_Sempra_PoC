package adp_demo;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RM_TS_PostReq {
	
	private WebDriver driver;
	public static String RecruitingDesktopWindowHandle = "";
	public static String NewWindow_1 = "";
	public static String ReqNumber="";
	public static Map<String, String> ReqData;
	
   @Test
   @Given("^I am logged on to the administration side of MyInfo as an HR or Recruitment Manager$")
   public void Login() throws Exception {
	   LoginPage.Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
	   Thread.sleep(15000);
  }
   
   @Test
   @When("^I open create new utilities req form and fill in the required info and click \"([^\"]*)\" button$")
   public void CreateReq(Map<String, String> ReqData) throws Exception {
	   HomePage.click_ProcessMenu(driver);
	   HomePage.click_AdditionalServicesSubMenu(driver);
	   HomePage.click_RecruitingMenuItem(driver);
	   Thread.sleep(10000);
	   Set <String> Handles = driver.getWindowHandles();
	   Iterator <String> it = Handles.iterator();
	   while(it.hasNext()){
		   RecruitingDesktopWindowHandle = it.next();	
		}
		driver.switchTo().window(RecruitingDesktopWindowHandle);
		RecruitingDesktopPage.click_ReqsMenu(driver);
		RecruitingDesktopPage.click_CreateUtilitiesMenuItem(driver);
		Thread.sleep(10000);
		ReqFormPage.selectUnionJob(driver, ReqData.get("UnionJob").trim());
		ReqFormPage.selectECRenewal_QuickHire(driver, ReqData.get("ECRenewal_Quick Hire").trim());
		ReqFormPage.selectCompany(driver, ReqData.get("Company").trim());
		ReqFormPage.selectDepartment(driver, ReqData.get("Department").trim());
		ReqFormPage.selectDivision(driver, ReqData.get("Division").trim());
		ReqFormPage.selectCostCenter(driver, ReqData.get("CostCenter").trim());
		ReqFormPage.selectBudgetedPosition(driver, ReqData.get("BudgetedPosition").trim());
		ReqFormPage.setSharedServices(driver, ReqData.get("SharedServices").trim());
		ReqFormPage.selectEligibleForRelocation(driver, ReqData.get("Eligible_for_Relocation").trim());
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
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().window(RecruitingDesktopWindowHandle);
		ReqNumber = ReqFormPage.getReqNumber(driver);
   }
   
   @Test
   @When("^the Req is \"([^\"]*)\"$")
   public void ApproveReq(String arg1) throws Exception {
	   ReqFormPage.click_HomeMenu(driver);
	   ReqFormPage.click_RecruitingDesktopMenuItem(driver);
	   Thread.sleep(4000);
	   RecruitingDesktopPage.selectDisposition(driver, "Granted");
	   RecruitingDesktopPage.click_SubmitBtn(driver); //Granted
	   Thread.sleep(2000);
   }
   
   @Test
   @When("^\"([^\"]*)\"$")
   public void ActivateReq(String arg1) throws Exception {
	   RecruitingDesktopPage.click_Req(driver, ReqNumber);
	   Thread.sleep(4000);
	   ModifyReqPage.selectReqStatus(driver, "Active");
	   ModifyReqPage.saveModifiedReq(driver,RecruitingDesktopWindowHandle); //Active
	   ModifyReqPage.selectPublishTab(driver);
	   PublishReq.click_PostLink(driver);
	   PublishReq.PostJobToCareerSite(driver); //Posted
	   Thread.sleep(4000);
   }
   
   @Test
   @Then("^the job posting should \"([^\"]*)\" on the company career website$")
   public void JobSearch(String arg1) throws Exception {
	   RecruitingDesktopPage.click_HomeMenu(driver);
	   RecruitingDesktopPage.click_SempraEnergyCSMenuItem(driver); //on CS
	   Thread.sleep(5000);
	   Set <String> NewHandles = driver.getWindowHandles();
	   Iterator <String> it1 = NewHandles.iterator();
	   while(it1.hasNext()){
			NewWindow_1 = it1.next();
			//System.out.println(NewWindow);
			
		}
		driver.switchTo().window(NewWindow_1);
		CareerSiteSelfServicePage.searchJob(driver, ReqNumber);
   }
   
  
  @BeforeClass
  public void beforeClass() throws Exception{
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("firefox");
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
	  driver.manage().window().maximize();
	  driver.get("https://testadpvantage.adp.com");
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
