package com.jbksitetest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbksitetest.qa.base.TestBase;

public class DashboardPage extends  TestBase
{			 	 	 	 	 	 	 	 	 	 	 	 	 	 	  	 	 	 	 	

	@FindBy(xpath="//p[text()='New Orders']")
  WebElement newOrdersTab;

	@FindBy(xpath="//p[text()='Bounce Rate']")
	 	  WebElement bounceRateTab;
	
	@FindBy(xpath="//p[text()='User Registrations']")
	 	  WebElement userRegTab;
	
	@FindBy(xpath="//p[text()='Unique Visitors']")
	 	  WebElement uniqueVisitorsTab;
	
	@FindBy(linkText="LOGOUT")
	  WebElement LOGOUTTAb;
	
	@FindBy(linkText="Users")
	  WebElement usersLink;
	
	@FindBy(linkText="Operators")
	  WebElement operatorsLink;
	
	@FindBy(linkText="Logout")
	  WebElement logoutLink;
	
	@FindBy(xpath="//p[text()='Kiran']")

	  WebElement userNameOnDashborad;
	
	@FindBy(linkText="Online")
	  WebElement status;

	public DashboardPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public String verifydashboardPageTitle()
	{
		return driver.getTitle();
	}
	public String verifydashboardUserName()
	{
		return userNameOnDashborad.getText();
	}
	
	 public String verifyDashboradUserStatus()
	 {
		return  status.getText();
	 }
	
	
	public UsersPage clickOnUsersLink()
	{
		usersLink.click();
		return new UsersPage();
	}
	
	public OperatorsPage clickOnOperatorsLink()
	{
		operatorsLink.click();
		return new OperatorsPage();
	}
	
	public LoginPage clickOnlogOutLink()
	{
		logoutLink.click();
		return new LoginPage();

	}
	
	public LoginPage clickOnForceLogOut()
	{
		LOGOUTTAb.click();
		return new LoginPage();
	}
	
	

}
