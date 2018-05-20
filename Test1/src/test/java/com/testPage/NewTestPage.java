package com.testPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.Register;
import com.page.WelcomePage;
import com.utility.DriverUtility;

public class NewTestPage 
{
	WebDriver driver;
	
	WelcomePage WP;
	Register RP;
	
	@Test(priority=1)
	  public void testMercuryToursWelcome()
	  {
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  }
		
	  @Test(priority=3)
	  public void testMercuryToursLogin() {
		  
		String title=  WP.clickLogin();
		Assert.assertTrue(title.contains("Find a Flight"));
		  
	  }
	  @Test(priority=2)
	  public void testMercuryToursRegister() {
		  
		  String url=WP.register();
		  Assert.assertTrue(url.contains("register"));
		  RP.clickUserInfo();
		  RP.SignOff();
		  
	  }
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser)
  {
	  driver=DriverUtility.getDriver(browser);
	  WP=PageFactory.initElements(driver, WelcomePage.class);
	  RP=PageFactory.initElements(driver, Register.class);
  }
  @AfterTest
  public void afterTest()
  {
	  driver.close();
	  WP=null;
	  RP=null;
  }
  
  
}
