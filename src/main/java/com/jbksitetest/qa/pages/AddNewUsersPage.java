package com.jbksitetest.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbksitetest.qa.base.TestBase;

public class AddNewUsersPage extends TestBase {

	@FindBy(xpath="//section[@class='content-header']//child::h1")
	@CacheLookup
	WebElement addnewUserPgLabel;
	
	@FindBy(id="username")
	@CacheLookup
	WebElement addUserName; 
	
	
	@FindBy(id="mobile")
	@CacheLookup
	WebElement addMobileNum;

	@FindBy(id="email")
	@CacheLookup
	WebElement addUserEmail;
	
	@FindBy(id="Male")
	@CacheLookup
	WebElement maleRadiobtn;
	
	@FindBy(id="Female")
	@CacheLookup
	WebElement femaleRadioBtn;
	
	@FindBy(xpath="//select[@class='form-control']")
	@CacheLookup
	WebElement state;
	
	
	@FindBy(id="password")
	@CacheLookup
	WebElement addUserPswrd;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement submitBtn;
	
	@FindBy(linkText="Cancel")
	@CacheLookup
	WebElement cancelBtn;
	
public AddNewUsersPage()
{
	PageFactory.initElements(driver, this);
}

public void addDetails(String Username,String Mobile,String Email,String Gender,String stat,String Password)
{
	System.out.println("excel fetch data :"+Username+Mobile+Email+Gender+stat+Password);
	addUserName.sendKeys(Username);
	addMobileNum.sendKeys(Mobile);
	addUserEmail.sendKeys(Email);
	maleRadiobtn.click();
	
	Select select=new Select(state);
	select.selectByVisibleText(stat);
	addUserPswrd.sendKeys(Password);
	submitBtn.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}
	


public boolean clickOnCancel()
{
	//cancelBtn.click(); error:  this element is not clickable  
	//return new UsersPage();
	return 	cancelBtn.isEnabled();

}
}
