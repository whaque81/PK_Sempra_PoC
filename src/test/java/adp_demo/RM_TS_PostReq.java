package adp_demo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sempra.hr.adp.login.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;

public class RM_TS_PostReq {
	
	private WebDriver driver;
	
   @Test
   @Given("^I am logged on to the administration side of MyInfo as an HR or Recruitment Manager$")
   public void Login() throws Exception {
	   LoginPage.Login(driver,"WHaque@SEMPRANRGU","!!Mar1983");
	   Thread.sleep(15000);
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
