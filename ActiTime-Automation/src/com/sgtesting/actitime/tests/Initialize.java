package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sgtesting.actitime.driverscript.DriverScript;

public class Initialize extends DriverScript{
	public static WebDriver oBrowser=null;
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
	public static WebDriver launchBrowser()
	{
		String path=null;
		String browserType=null;
		try
		{	
			path=System.getProperty("user.dir");
			browserType=objConfig.getProperty("browserType");
			switch(browserType.toLowerCase())
			{
			case "ch":
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				break;
			case "ff":
				System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", path+"\\Library\\drivers\\IEDriverServer.exe");
				oBrowser=new InternetExplorerDriver();
				break;
			default:
				System.out.println("Invalid Browser Type !!!!!!!!!!!!!!");
			
			}
			
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return oBrowser;
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
	public static String navigate(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String expected,actual;
		String scriptStatus="Fail";
		
		try
		{
			log.info("The execution of method navigate started here ...");
			expected=objExpectedResults.getProperty(expectedresultcolumn);
			pattern=pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String url=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0], 2);
			oBrowser.get(url);
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			if (actual.equalsIgnoreCase(expected))
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method navigate ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method navigate,The Exception :"+e);
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
	public static String closeApplication(WebDriver oBrowser)
	{
		String scriptStatus="Fail";
		try
		{
			log.info("The execution of method closeApplication started here ...");
			oBrowser.close();
			scriptStatus="Pass";
			log.info("The execution of method closeApplication ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method closeApplication,The Exception :"+e);
		}
		return scriptStatus;
	}
}
