package com.jbksitetest.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.jbksitetest.qa.base.TestBase;


public class TestUtil extends TestBase
{     
	
private static final String TakesScreenShot = null;
public static long PAGE_LOAD_TIMEOUT=20;
public static long IMPLICIT_TIMEOUT=20;

public static String TEST_DATA_SHEET_PATH="E:\\JBKWEBSiteTesting\\JBKWebsiteAutoTesting\\src\\main\\java\\com\\"
 		+ "jbksitetest\\qa\\testdata\\JbkExcel.xlsx";

public static FileInputStream file;

public static Workbook wbook;
public static Sheet sheet;
public static Object obj[][];


//method for data driven approach 
public static Object[][] getTestdata(String sheetname)
{  
	
	try {
		
		file=new FileInputStream(TEST_DATA_SHEET_PATH);
		
		wbook=WorkbookFactory.create(file);
		sheet=wbook.getSheet(sheetname);	
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		obj=new Object[rows-1][cols];

	
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
				{
					 obj[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
				System.out.println(" ");
		}
	}
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return obj;
	}

public static void screenShot() throws IOException
{
	 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String currentDir=System.getProperty("user.dir");
  
	FileUtils.copyFile(srcFile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));

}}

 