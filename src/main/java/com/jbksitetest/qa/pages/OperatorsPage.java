package com.jbksitetest.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.jbksitetest.qa.base.TestBase;

public class OperatorsPage extends  TestBase 
{
	
	@FindBy(xpath="//h1[contains(text(),'Operators')]")
	WebElement operatorLabel;

	@FindBy(xpath="//table[@class='table table-hover']")
	WebElement table;
	
	public OperatorsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLabel()
	{
	
		return operatorLabel.getText();
	}
	
	public String verifyOperatorsPage()
	{
		return driver.getCurrentUrl();
	}

	
	public String retrieveTableData()
	{
		List <WebElement> tr=table.findElements(By.tagName("tr"));
		//int rowSize=tr.size();
		
		//iterating rows
		System.out.println("*******Table data :******");
		for(WebElement row : tr)
		{
			List <WebElement> td=row.findElements(By.tagName("td"));
		
			for(WebElement col :td)
			{
				System.out.print(col.getText()+" ");
				
			}
			System.out.println(" ");
			
		}
		return "iteration Done";
				
	}
	
}
