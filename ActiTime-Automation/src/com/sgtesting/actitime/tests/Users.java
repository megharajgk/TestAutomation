package com.sgtesting.actitime.tests;

import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.driverscript.DriverScript;
import com.sgtesting.actitime.utility.ApplicationDependent;

public class Users extends DriverScript{
	
	
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
	public static String createUser(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String scriptStatus="Fail";
		try
		{
			log.info("The execution of method createUser started here ...");
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String firstname=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0],2);
			String lastname=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[1],2);
			String email=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[2],2);
			String username=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[3],2);
			String password=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[4],2);
			String retypepassword=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[5],2);
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("buttonText")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(firstname);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastname);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(username);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(password);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(retypepassword);
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(5000);
			String user=lastname+", "+firstname;
			By by=By.xpath("//span[text()='"+user+"']");
			if (ApplicationDependent.isObjectPresent(oBrowser, by)==true)
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method createUser ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method createUser,The Exception :"+e);
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
	public static String modifyUser(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String expected,actual;
		String scriptStatus="Fail";
		try
		{
			log.info("The execution of method modifyUser started here ...");
			expected=objExpectedResults.getProperty(expectedresultcolumn);
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String user=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[0],2);
			String NewPassword=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[0],2);
			String RetypeNewPassword=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[0],2);
			
			oBrowser.findElement(By.xpath("//span[text()='"+user+"']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(NewPassword);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(RetypeNewPassword);
			Thread.sleep(2000);
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			if (actual.equalsIgnoreCase(expected))
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method modifyUser ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method modifyUser,The Exception :"+e);
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
	public static String deleteUser(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String scriptStatus="Fail";
		try
		{
			log.info("The execution of method deleteUser started here ...");
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String user=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0],2);
			
			oBrowser.findElement(By.xpath("//span[text()='"+user+"']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			if (ApplicationDependent.isAlertPresent(oBrowser)==true)
			{
				scriptStatus="Pass";
			}
			oAlert.accept();
			Thread.sleep(5000);
			log.info("The execution of method deleteUser ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method deleteUser,The Exception :"+e);
		}
		return scriptStatus;
	}
}
