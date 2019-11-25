package com.jbksitetest.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.OperatorsPage;
import com.jbksitetest.qa.pages.RegistrationPage;
import com.jbksitetest.qa.pages.UsersPage;

public class RegistrationPageTest extends TestBase {
	

	  DashboardPage dashPg;
	  LoginPage logpg;
	  UsersPage userPg;
	  OperatorsPage oprPage;
	  RegistrationPage regPg;
	public RegistrationPageTest()
	{
	super();	
	}
	@BeforeMethod
	public void RegPageSetUp()
{
	  initialization();
	  logpg=new LoginPage();
regPg=logpg.checkRegistrationLink();
}
	
	
  @Test
  public void registerMembrshipTest() 
  {
	String membrshipMsg=  regPg.registerMembrship();
	  Assert.assertEquals(membrshipMsg, "User registered successfully.");

  }
  
  @AfterMethod
  public void closeBrowser()
   {
 	  driver.quit();
   }
}
