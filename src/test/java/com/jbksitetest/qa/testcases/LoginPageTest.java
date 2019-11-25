package com.jbksitetest.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;



import com.jbksitetest.qa.base.TestBase;
import com.jbksitetest.qa.pages.DashboardPage;
import com.jbksitetest.qa.pages.LoginPage;
import com.jbksitetest.qa.pages.RegistrationPage;

public class LoginPageTest extends TestBase
{
	LoginPage logpg;	
	DashboardPage Dash;
	RegistrationPage regPg;
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
  {
	  initialization();
	   logpg=new LoginPage();
	    regPg=new RegistrationPage();
  }
  
  
  /*@Test(priority=1)
  public void loginPageTitleTest() {
	  String tilte=logpg.validateLoginPageTitle();
	  Assert.assertEquals(tilte, "AdminLTE 2 | Log in");
  }
  
  @Test(priority=2)
  public void registrationLinkTest()
  {
	 logpg.checkRegistrationLink();  
  }*/
//with the data provier
/*  @Test(priority=3 , dataProvider="loginData")
  public void loginTest(String u,String ps)
  {
	   //Dash=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 
	   Dash=logpg.login(u, ps ); 

  }*/
  
  @Test(priority=1)
  public void loginTest()
  {
	   Dash=logpg.login(prop.getProperty("username"), prop.getProperty("password")); 

  }
  
 /* @Test
  public void adminLinkTest()
  {
	 String admLink= logpg.chcekAdminLink();  
	  Assert.assertEquals(admLink, "Admin");
  }
*/
  
  @DataProvider(name="loginData")         // DATA PROVIDER
  public Object[][] loginData() {     
    return new Object[][] { new Object[] { "", "" },    new Object[] { "hgnvh", "kjlkdj" },   new Object[] { "kiran@gmail.com", "123456" },
    };
  }

 @AfterMethod
 public void closeBrowser()
  {
	  driver.quit();
  }

}
