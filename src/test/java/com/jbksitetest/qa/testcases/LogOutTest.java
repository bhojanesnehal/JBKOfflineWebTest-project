package com.jbksitetest.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LogOutPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.OperatorsPage;

public class LogOutTest extends TestBase {
	
	LoginPage logpg;
	DashboardPage dashPg;
	OperatorsPage opratorPg;
	LogOutPage logoutPg;
	
public LogOutTest()
{
	super();
}

@BeforeMethod
public void LogOutTestSetUp()
{
	initialization();
	  logpg=new LoginPage();
	  dashPg=logpg.login(prop.getProperty("username"), prop.getProperty("password"));
	  //logpg =dashPg.clickOnlogOutLink();
	  logoutPg=new LogOutPage();
}
	
  @Test
  public void successfulLogOutTest () {
	  logpg =dashPg.clickOnlogOutLink();

	  /*String logoutMsg=logoutPg.SuccessfulLogout();
Assert.assertEquals("Logout successfully", logoutMsg);*/
  }
  

  @AfterMethod
  public void  dashboardCloseBrowser()
   {
 	  driver.quit();
   }
}
