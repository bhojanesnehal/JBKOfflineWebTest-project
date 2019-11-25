package com.jbksitetest.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.AddNewUsersPage;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.UsersPage;

public class UsersPageTest extends TestBase {
 
	UsersPage userPg;
	AddNewUsersPage addnewuser;
		 DashboardPage dashPg;
	  LoginPage logpg;
	  
	public UsersPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void UsersPageTestSetUp()
  {
		initialization();
		  logpg=new LoginPage();
		  dashPg=logpg.login(prop.getProperty("username"), prop.getProperty("password"));
		  userPg =dashPg.clickOnUsersLink();
  }

	@Test
  public void verifyUsersPageBylabelTest() {
		String userPgLabel=userPg.verifyUsersPageBylabel();
		Assert.assertEquals(userPgLabel,"Users");
		
  }
	
	@Test
	public void addUserTest()
	{
		addnewuser=userPg.addUserbtnclick();
	}
	
	@AfterMethod
	 public void closeBrowser()
	  {
		  driver.quit();
	  }
}
