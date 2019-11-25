package com.jbksitetest.qa.pages;
//asfsaas
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbksitetest.qa.base.TestBase;

public class LoginPage extends  TestBase
{

@FindBy(id="email")
WebElement email;

@FindBy(id="password")
WebElement password;


@FindBy(xpath="//button[@type='submit']")
WebElement submitBtn;

@FindBy(linkText="Admin")
WebElement adminLink;

@FindBy(linkText="Register a new membership")
WebElement registraionLink;

//Initializing the object repository
public LoginPage()
{
	PageFactory.initElements(driver,this);
}

public String validateLoginPageTitle()
{
 System.out.println(driver.getTitle()); 
 return driver.getTitle();
}

public RegistrationPage checkRegistrationLink()
{
	registraionLink.click();
	return new RegistrationPage();
 	//return registraionLink.getText();
}

/*public String chcekAdminLink()
{
	return adminLink.getText();
}*/

public DashboardPage login(String un, String pwd)
{
	email.sendKeys(un);
	password.sendKeys(pwd);
	submitBtn.click();
	return new DashboardPage();
	
}


}
  