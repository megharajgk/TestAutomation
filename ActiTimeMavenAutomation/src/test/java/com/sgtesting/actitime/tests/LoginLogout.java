package com.sgtesting.actitime.tests;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.driverscript.DriverScript;
import com.sgtesting.actitime.utility.ApplicationDependent;

public class LoginLogout extends DriverScript{
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	public static String login(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String[] arrOM=null;
		String scriptStatus="Fail";
		String expected=null;
		try
		{
			log.info("The execution of method login started here ...");
			expected=objExpectedResults.getProperty(expectedresultcolumn);
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			arrOM=pattern.split(objectMapColumn);
			
			String user=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0],2);
			String pwd=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[1],2);
			
			oBrowser.findElement(objectmap.getLocator(arrOM[0])).sendKeys(user);
			oBrowser.findElement(objectmap.getLocator(arrOM[1])).sendKeys(pwd);
			oBrowser.findElement(objectmap.getLocator(arrOM[2])).click();
			Thread.sleep(5000);
			By by=By.xpath("//td[text()='"+expected+"']");
			if (ApplicationDependent.isObjectPresent(oBrowser, by)==true)
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method login ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method login,The Exception :"+e);
		}
		return scriptStatus;
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	public static String logout(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String expected,actual;
		String scriptStatus="Fail";
		String[] arrOM=null;
		try
		{
			log.info("The execution of method logout started here ...");
			expected=objExpectedResults.getProperty(expectedresultcolumn);
			pattern=Pattern.compile(",");
			arrOM=pattern.split(objectMapColumn);
			
			oBrowser.findElement(objectmap.getLocator(arrOM[0])).click();
			Thread.sleep(4000);
			actual=oBrowser.getTitle();
			if (actual.equalsIgnoreCase(expected))
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method logout ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method logout,The Exception :"+e);
		}
		return scriptStatus;
	}

}
