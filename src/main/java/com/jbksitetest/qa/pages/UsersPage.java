package com.jbksitetest.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbksitetest.qa.base.TestBase;

public class UsersPage extends  TestBase
{
	
	@FindBy(xpath="//section[@class='content-header']//child::h1")
			WebElement userLabel;
	
	@FindBy(xpath="//button[text()='Add User']")
	public  WebElement AddUsersBtn;
	
	public UsersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUsersPageBylabel()
	{
	return userLabel.getText();	
	}
	
	public AddNewUsersPage addUserbtnclick()
	{
		AddUsersBtn.click();
		return new AddNewUsersPage();
	}

}
