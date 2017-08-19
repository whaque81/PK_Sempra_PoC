package org.sempra.hr.adp.recruitingdesktop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReqFormPage {
	
	public static By UnionJobDropDown = By.name("gridControl2_RTiReq");
	public static By ECRenewal_QuickHireDropDown = By.name("gridControl_RTiReq");
	public static By CompanyDropDown = By.name("companyCode_RTiReq");
	public static By PayGroupDropDown = By.name("payGroupCode_RTiReq"); 
	public static By DepartmentTxtBox = By.name("departmentCode_RTiReq_ms_ac_sf");
	public static By DivisionDropDown = By.name("zzreqDivisionSempra_RTiCustomReq");
	public static By CostCenterTxtBox = By.name("costNumCode_RTiReq_ms_ac_sf");
	public static By BudgetedPositionDropDown = By.name("zzreqBudgetedPosition_RTiCustomReq");
	public static By SharedServicesTxtBox= By.name("zzreqSharedServices2_RTiCustomReq"); 
	public static By EligibleForRelocationDropDown = By.name("zzreqEligibleForRelocation_RTiCustomReq");
	public static By EligibleForReferralDropDown = By.name("erpBonusType_RTiReq");
	public static By DOTSafetySensitiveDropDown = By.name("gridControl3_RTiReq");
	public static By LocationTxtBox = By.name("locationCode_RTiReq_ms_ac_sf");
	public static By DesiredBuildingTxtBox = By.name("zzreqDesiredBldgSeatLocation_RTiCustomReq"); //index 0
	public static By StandardHoursDropDown = By.name("stdHrsWk_RTiReq");
	public static By JobTitleCodeTxtBox= By.name("positionCode_RTiReq_ms_ac_sf");
	public static By ExternalPublishedJobTitleTxtBox = By.name("ptitle_RTiReq"); 
	public static By BasePayTypeDropDown = By.name("payType_RTiReq");
	public static By PositionTypeDropDown = By.name("typeOfFulltime_RTiReq");
	public static By RegularTempDropDown = By.name("zzregTemp_RTiCustomReq");
	public static By EmployeeClassDropDown = By.name("zzreqEmployeeClass_RTiCustomReq");
	public static By BusinessJustificationTxtBox= By.name("zzreqBizJustificationforPosition2_RTiCustomReq"); //index 1
	public static By ReplacementAdditionDropDown = By.name("typeOfNew_RTiReq");
	public static By HiringManagerTxtBox = By.name("_recruiterID00004010_RTiReq_ms_ac_sf");
	public static By RecruiterDropDown = By.xpath("//td[@name='_recruiterID00004020_RTiReq']/span/select");
	public static By AreaofInterestDropDown = By.name("grp_RTiReq");
	public static By PostingLocationDropDown = By.name("postingLocationCode_RTiReq");
	public static By ExternalDescriptionTxtBox= By.id("description_RTiReq");
	public static By ExternalDescLink = By.xpath("//div[@id='tinymce_rmvlink_description_RTiReq']/a");
	public static By ExternalRequirementsTxtBox= By.id("requirements_RTiReq");
	public static By ExternalReqsLink = By.xpath("//div[@id='tinymce_rmvlink_requirements_RTiReq']/a");
	public static By InternalDescriptionTxtBox= By.id("internalDescription_RTiReq");
	public static By InternalDescLink = By.xpath("//div[@id='tinymce_rmvlink_internalDescription_RTiReq']/a");
	public static By InternalQualificationTxtBox= By.id("zzreqInternalQualifications_RTiCustomReq");
	public static By InternalQualiLink = By.xpath("//div[@id='tinymce_rmvlink_zzreqInternalQualifications_RTiCustomReq']/a");
	public static By ApproverTxtBox= By.name("approver1ID_RTiReq_ms_ac_sf");
	public static By CreateReqBtn = By.id("_reqform_create2_button");
	public static By HomeMenu = By.xpath("//nobr[text()='Home']");
	public static By RecruitingDesktopMenuItem = By.linkText("Recruiting Desktop");
	public static By ReqNumberText = By.xpath("//*[@id='no_header_open'][3]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/span");
	
	
	public static void selectUnionJob(WebDriver driver,String strValue){
		List<WebElement> dropdowns = driver.findElements(UnionJobDropDown);
		WebElement unionDropdown = dropdowns.get(0);
		Select dropdown = new Select(unionDropdown);
		dropdown.selectByVisibleText(strValue);
	}
	
	public static void selectECRenewal_QuickHire(WebDriver driver,String strValue){
		List<WebElement> dropdowns = driver.findElements(ECRenewal_QuickHireDropDown);
		WebElement unionDropdown = dropdowns.get(0);
		Select dropdown = new Select(unionDropdown);
		dropdown.selectByVisibleText(strValue);
	}
	
	public static void selectCompany(WebDriver driver, String strValue){
		WebElement companydropDown = driver.findElement(CompanyDropDown);
		Select dropdown = new Select(companydropDown);
		dropdown.selectByVisibleText(strValue);	
	}
	
	public static void selectDepartment(WebDriver driver, String strValue) throws Exception{
		driver.findElement(DepartmentTxtBox).click();
		driver.findElement(DepartmentTxtBox).sendKeys(strValue);
		driver.findElement(DepartmentTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(DepartmentTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(DepartmentTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void selectDivision(WebDriver driver, String strValue){
		WebElement divisiondropDown = driver.findElement(DivisionDropDown);
		Select dropdown = new Select(divisiondropDown);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectCostCenter(WebDriver driver, String strValue) throws Exception{
		driver.findElement(CostCenterTxtBox).click();
		driver.findElement(CostCenterTxtBox).sendKeys(strValue);
		driver.findElement(CostCenterTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(CostCenterTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(CostCenterTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void selectBudgetedPosition(WebDriver driver, String strValue){
		WebElement budgeteddropDown = driver.findElement(BudgetedPositionDropDown);
		Select dropdown = new Select(budgeteddropDown);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void setSharedServices(WebDriver driver, String strValue){
		driver.findElement(SharedServicesTxtBox).sendKeys(strValue);
		
	}
	
	public static void selectEligibleForRelocation(WebDriver driver, String strValue){
		WebElement relocationdropDown = driver.findElement(EligibleForRelocationDropDown);
		Select dropdown = new Select(relocationdropDown);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectEligibleForReferral(WebDriver driver, String strValue){
		WebElement referraldropDown = driver.findElement(EligibleForReferralDropDown);
		Select dropdown = new Select(referraldropDown);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectDOTSafetySensitive(WebDriver driver, String strValue){
		WebElement DOTSafetydropDown = driver.findElement(DOTSafetySensitiveDropDown);
		Select dropdown = new Select(DOTSafetydropDown);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectLocation(WebDriver driver, String strValue) throws Exception{
		driver.findElement(LocationTxtBox).click();
		driver.findElement(LocationTxtBox).sendKeys(strValue);
		driver.findElement(LocationTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(LocationTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(LocationTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void setBuilding(WebDriver driver, String strValue){
		driver.findElement(DesiredBuildingTxtBox).sendKeys(strValue);
		
	}
	
	public static void selectStandardHrs(WebDriver driver, String strValue){
		WebElement stdHrs = driver.findElement(StandardHoursDropDown);
		Select dropdown = new Select(stdHrs);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectJobTitle(WebDriver driver, String strValue) throws Exception{
		driver.findElement(JobTitleCodeTxtBox).click();
		driver.findElement(JobTitleCodeTxtBox).sendKeys(strValue);
		driver.findElement(JobTitleCodeTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(JobTitleCodeTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(JobTitleCodeTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void setExtrnJobtitle(WebDriver driver, String strValue){
		driver.findElement(ExternalPublishedJobTitleTxtBox).sendKeys(strValue);
		
	}
	
	public static void selectBasePay(WebDriver driver, String strValue){
		WebElement basePay = driver.findElement(BasePayTypeDropDown);
		Select dropdown = new Select(basePay);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectPositionType(WebDriver driver, String strValue){
		WebElement positionType = driver.findElement(PositionTypeDropDown);
		Select dropdown = new Select(positionType);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectRegularTemp(WebDriver driver, String strValue){
		WebElement regularTemp = driver.findElement(RegularTempDropDown);
		Select dropdown = new Select(regularTemp);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectEmployeeClass(WebDriver driver, String strValue){
		WebElement employeeClass = driver.findElement(EmployeeClassDropDown);
		Select dropdown = new Select(employeeClass);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void setBusinessJustification(WebDriver driver, String strValue){
		driver.findElement(BusinessJustificationTxtBox).sendKeys(strValue);
		
	}
	
	public static void selectReplacementAddition(WebDriver driver, String strValue){
		WebElement replacementAddition = driver.findElement(ReplacementAdditionDropDown);
		Select dropdown = new Select(replacementAddition);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectHiringManager(WebDriver driver, String strValue) throws Exception{
		driver.findElement(HiringManagerTxtBox).click();
		driver.findElement(HiringManagerTxtBox).sendKeys(strValue);
		driver.findElement(HiringManagerTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(HiringManagerTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(HiringManagerTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void selectRecruiter(WebDriver driver, String strValue){
		WebElement recruiter = driver.findElement(RecruiterDropDown);
		Select dropdown = new Select(recruiter);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectAreaOfInterest(WebDriver driver, String strValue){
		WebElement interest = driver.findElement(AreaofInterestDropDown);
		Select dropdown = new Select(interest);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void selectPostingLocation(WebDriver driver, String strValue){
		WebElement postinglocaion = driver.findElement(PostingLocationDropDown);
		Select dropdown = new Select(postinglocaion);
		dropdown.selectByVisibleText(strValue);	
		
	}
	
	public static void setExternalDescription(WebDriver driver, String strValue){
		driver.findElement(ExternalDescLink).click();
		driver.findElement(ExternalDescriptionTxtBox).sendKeys(strValue);
		
	}
	
	public static void setExternalRequirements(WebDriver driver, String strValue){
		driver.findElement(ExternalReqsLink).click();
		driver.findElement(ExternalRequirementsTxtBox).sendKeys(strValue);
		
	}
	
	public static void setInternalDescription(WebDriver driver, String strValue){
		driver.findElement(InternalDescLink).click();
		driver.findElement(InternalDescriptionTxtBox).sendKeys(strValue);
		
	}
	
	public static void setInternalQualification(WebDriver driver, String strValue){
		driver.findElement(InternalQualiLink).click();
		driver.findElement(InternalQualificationTxtBox).sendKeys(strValue);
		
	}
	
	public static void setApprover(WebDriver driver, String strValue) throws Exception{
		driver.findElement(ApproverTxtBox).click();
		driver.findElement(ApproverTxtBox).sendKeys(strValue);
		Thread.sleep(1000);
		driver.findElement(ApproverTxtBox).sendKeys(Keys.SPACE );
		Thread.sleep(1000);
		driver.findElement(ApproverTxtBox).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(ApproverTxtBox).sendKeys(Keys.ENTER);
	}
	
	public static void createReqs(WebDriver driver){
		driver.findElement(CreateReqBtn).click();
		
	}
	
	public static String getReqNumber(WebDriver driver){
		String ReqNumber = driver.findElement(ReqNumberText).getText().toString();
		return ReqNumber;
	}
	
	public static void click_HomeMenu(WebDriver driver){
		
		driver.findElement(HomeMenu).click();
		
	}

public static void click_RecruitingDesktopMenuItem(WebDriver driver){
		
		driver.findElement(RecruitingDesktopMenuItem).click();
		
	}
	

}
