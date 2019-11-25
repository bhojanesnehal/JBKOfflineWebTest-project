package com.jbksitetest.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.AddNewUsersPage;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.UsersPage;
import com.jbksitetest.qa.util.TestUtil;

public class AddNewUsersPageTest extends TestBase
{
	LoginPage logpg;
	DashboardPage dashPg;
	UsersPage userPg;
	AddNewUsersPage addNewUserPg;

public AddNewUsersPageTest()
{
	super();
}

@BeforeMethod
public void addNewUsersPageTestSetUp()
{
	initialization();
	  logpg=new LoginPage();
	  dashPg=logpg.login(prop.getProperty("username"), prop.getProperty("password"));
	  userPg =dashPg.clickOnUsersLink();
	  addNewUserPg= userPg.addUserbtnclick();
}
	@Test(priority=1,dataProvider="getTestDataFromExcel")
	
	public void addDetailsTest(String Username,String Mobile,String Email,
			String Gender,String stat,String Password)
	{
		addNewUserPg.addDetails(Username, Mobile, Email, Gender, stat, Password);
	/*System.out.println(msg);
		Assert.assertEquals("User Added Successfully. You can not see added user.", msg);*/
	}   
	
	/*@Test(priority=2)
	public void clickOnCancelBtnTest()
	{
		boolean res=addNewUserPg.clickOnCancel();
		Assert.assertTrue(res);
	}*/
		
 @DataProvider  
 
 public Object[][] getTestDataFromExcel()  
 {
	 Object  data[][]=TestUtil.getTestdata("Users");  //data driven approach used
	 return data;
 }

  
  
  @AfterMethod
	 public void AddNewUsrPgCloseBrowser()
	  {
		  driver.quit();
	  }
}
