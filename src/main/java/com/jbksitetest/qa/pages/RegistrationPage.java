package com.jbksitetest.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbksitetest.qa.base.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(linkText="Register a new membership")
	WebElement registraionLink;

	@FindBy(xpath="//input[@id='name']")
	WebElement regName;

	@FindBy(xpath="//input[@id='email']")
	WebElement regEmail;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement regMob;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement regPass;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signInBtn;
	
	@FindBy(linkText="I already have a membership")
	WebElement alreadyMemberLink;
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String registerMembrship()
	{
		regName.sendKeys("abc");
		regEmail.sendKeys("snehal@gmail.com");
		regMob.sendKeys("12345");
		regPass.sendKeys("1234");
		signInBtn.click();
		
		Alert alert=driver.switchTo().alert();
		return alert.getText();
		
		
		
		
	}
	

	
	
}
