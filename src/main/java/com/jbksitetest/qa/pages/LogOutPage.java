package com.jbksitetest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbksitetest.qa.base.TestBase;

public class LogOutPage extends TestBase
{
	
	
	@FindBy(linkText="Logout")
	  WebElement logoutLink;
	
	@FindBy(xpath="//p[text()='Logout successfully']")
	  WebElement logoutMsg;
	
	public LogOutPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public String SuccessfulLogout()
	{
		System.out.println(logoutMsg.getText());
		return logoutMsg.getText();
	}

}
