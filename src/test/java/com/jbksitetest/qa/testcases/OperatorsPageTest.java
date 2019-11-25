package com.jbksitetest.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.OperatorsPage;

public class OperatorsPageTest extends TestBase{
	
	LoginPage logpg;
	DashboardPage dashPg;
	OperatorsPage opratorPg;
public OperatorsPageTest()
{
	super();
}

@BeforeMethod
public void operatorsPageTestSetUp()
{
	initialization();
	  logpg=new LoginPage();
	  dashPg=logpg.login(prop.getProperty("username"), prop.getProperty("password"));
	   opratorPg =dashPg.clickOnOperatorsLink();
}
	
 @Test(priority=1)
  public void verifyLabelTest() 
 {
	  String oprPglabel=opratorPg.verifyLabel();
	  Assert.assertEquals("Operators",oprPglabel, "label is differrnt ");
  
 }
 
  @Test(priority=2)
  public void verifyPageByUrlTest() 
 {
	  String oprPgUrl=opratorPg.verifyOperatorsPage();
	  String actualUrl="file:///C:/Users/Vayuva/Desktop/oooOffline%20Website%20_%20new/pages/examples/operators.html";
	  Assert.assertEquals(actualUrl,oprPgUrl,"Url is differrnt ");
  }
  
  @Test(priority=3)
  public void showTableData() 
 {
	  String fetchTabledata=opratorPg.retrieveTableData();
	  Assert.assertEquals("iteration Done",fetchTabledata);
  }
  
  @AfterMethod
	 public void AddNewUsrPgCloseBrowser()
	  {
		  driver.quit();
	  }
}
