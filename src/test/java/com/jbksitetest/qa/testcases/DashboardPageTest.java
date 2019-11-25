package com.jbksitetest.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.OperatorsPage;
import com.jbksitetest.qa.pages.UsersPage;

public class DashboardPageTest extends TestBase {
	
	  DashboardPage dashPg;
	  LoginPage logpg;
	  UsersPage userPg;
	  OperatorsPage oprPage;
	public DashboardPageTest()
	{
	super();	
	}
	@BeforeMethod
	public void DashboardSetUp()
  {
	  initialization();
	  logpg=new LoginPage();
	  dashPg=logpg.login(prop.getProperty("username"), prop.getProperty("password"));

  }
	
	@Test(priority=7)
	public void verifyDashboradUserNameTest()
	{
		String dashbrdUserNm=dashPg.verifydashboardUserName();
		Assert.assertEquals(dashbrdUserNm,"Kiran", "Dashboard Name dos not matched.");
	}
  
	@Test(priority=1)
	public void verifyDashboradtitleTest()
	{
		String dashbrdTitle=dashPg.verifydashboardPageTitle();
		Assert.assertEquals("AdminLTE 2 | Dashboard",dashbrdTitle,"Dashboard title dos not matched.");
	}
	
	@Test(priority=2)
	public void verifyDashboradUserStatusTest()
	{
		String stats=dashPg.verifyDashboradUserStatus();
		Assert.assertEquals(stats,"Online", "Dashboard status dos not matched.");
	}
	
@Test(priority=3)
  public void clickOnUsersLinkTest() 
{
    userPg=dashPg.clickOnUsersLink();
}

@Test(priority=4)
public void clickOnOperatorsLinkTest() 
{
	oprPage=dashPg.clickOnOperatorsLink();
}

@Test(priority=5)
public void clickOnlogOutLinkTest() 
{
	logpg=dashPg.clickOnlogOutLink();
}

@Test(priority=6)
public void clickOnForceLogOutTest() 
{
	logpg=dashPg.clickOnForceLogOut();
}
  

  @AfterMethod
  public void  dashboardCloseBrowser()
   {
 	  driver.quit();
   }

}
