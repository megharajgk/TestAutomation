package com.sgtesting.actitime.driverscript;

import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sgtesting.actitime.datatable.Datatable;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.utility.ApplicationIndependent;
import com.sgtesting.actitime.utility.ObjectMap;
import com.sgtesting.actitime.utility.ReportUtil;

public class DriverScript {
	public static WebDriver oBrowser=null; 
	public static String testdatacolumn=null;
	public static String objectMapColumn=null;
	public static String expectedresultcolumn=null;
	public static String excelTestScriptFile=null;
	public static String expectedResultFileName=null;
	public static String configFileName=null;  
	public static String objectMapFileName=null;
	public static Datatable datatable=null;
	public static Properties objConfig=null;
	public static Properties objExpectedResults=null;
	public static ObjectMap objectmap=null;
	public static String strTestScriptStatus=null;
	public static String FolderPath=null; //explained
	public static Logger log=Logger.getLogger("ActiTime Automation ...");
	
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
	@BeforeSuite
	public void startAutomationSuite()
	{
		FolderPath=System.getProperty("user.dir");
		String FileName=FolderPath+"\\Results\\ResultReports\\AutomationTestSummaryReport.html";
		String starttime=ApplicationIndependent.getDateTime("dd-MMM-yyyy hh:mm:ss z");
		ReportUtil.createReport(FileName, starttime, "QA Testing");
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
	@BeforeClass
	public void loadFiles()
	{
		try
		{
			log.info("The execution of method loadFiles started here ...");
			// Create Object for the Datatable class
			datatable=new Datatable();
			//Get Relative path for the complete current java project
			FolderPath=System.getProperty("user.dir");
			//Create an object for Configuration details
			configFileName=FolderPath+"\\Configuration\\configuration.properties";
			objConfig=ApplicationIndependent.property(configFileName);
			//Create an Object for Expected Results .properties details
			expectedResultFileName=FolderPath+"\\TestScriptDataFiles\\ExpectedResults.properties";
			objExpectedResults=ApplicationIndependent.property(expectedResultFileName);
			
			// Create an Object for ObjectMap class to load locator name and values
			objectMapFileName=FolderPath+"\\ObjectMap\\objectmap.properties";
			objectmap=new ObjectMap(objectMapFileName);
			log.info("The execution of method loadFiles ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method loadFiles,The Exception :"+e);
		}
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
	@Test
	public void executeTestScenarios()
	{
		String startTime=null;
		try
		{	
			startTime=ApplicationIndependent.getDateTime("dd-MMM-yyyy hh:mm:ss z");
			ReportUtil.startSuite("Scenario");
			String excelControllerFile=FolderPath+"\\Controller\\data_Controller.xlsx";
			int iControllerRowCount=datatable.rowCount(excelControllerFile, "Scenarios");
			for (int tcid=0;tcid<iControllerRowCount;tcid++)
			{
				String testcaseid=datatable.getCellData(excelControllerFile, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=datatable.getCellData(excelControllerFile, "Scenarios", "TestcaseName", tcid+2);
				String testdescription=datatable.getCellData(excelControllerFile, "Scenarios", "Description", tcid+2);
				String testStatus=datatable.getCellData(excelControllerFile, "Scenarios", "RunStatus", tcid+2);
				
				System.out.println("testcaseid  :"+testcaseid);
				System.out.println("testcasename  :"+testcasename);
				System.out.println("testdescription  :"+testdescription);
				System.out.println("testStatus  :"+testStatus);
				
				
				if (testStatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialize.launchBrowser();
					
					//Create Parameter for WebDriver
					Class driverparam[]=new Class[1];
					driverparam[0]=WebDriver.class;
					
					excelTestScriptFile=FolderPath+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int iTestScriptRowCount=datatable.rowCount(excelTestScriptFile, testcaseid);
					for (int tsid=0;tsid<iTestScriptRowCount;tsid++)
					{	
						String testscriptid=datatable.getCellData(excelTestScriptFile, testcaseid, "TestScriptID", tsid+2);
						String description=datatable.getCellData(excelTestScriptFile, testcaseid, "Description", tsid+2);
						String methodname=datatable.getCellData(excelTestScriptFile, testcaseid, "MethodName", tsid+2);
						String pkgclassname=datatable.getCellData(excelTestScriptFile, testcaseid, "PackageClassName", tsid+2);
						testdatacolumn=datatable.getCellData(excelTestScriptFile, testcaseid, "TestDataColumn", tsid+2);
						expectedresultcolumn=datatable.getCellData(excelTestScriptFile, testcaseid, "ExpectedResultColumn",tsid+2);
						objectMapColumn=datatable.getCellData(excelTestScriptFile, testcaseid,"ObjectMapColumn", tsid+2);
						
						System.out.println("testscriptid :"+testscriptid);
						System.out.println("description :"+description);
						System.out.println("methodname :"+methodname);
						System.out.println("pkgclassname :"+pkgclassname);
						System.out.println("testdatacolumn :"+testdatacolumn);
						System.out.println("expectedresultcolumn  :"+expectedresultcolumn);
						System.out.println("objectMapColumn  :"+objectMapColumn);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.newInstance();
						
						Method method=obj.getClass().getMethod(methodname, driverparam);
						String testresult=(String) method.invoke(obj, oBrowser);
						String ScreenShotFileName=null;
						if (testresult.equalsIgnoreCase("fail"))
						{
							String screenshotPath=System.getProperty("user.dir")+"\\Results\\ScreenShots\\";
							ScreenShotFileName=screenshotPath+"ScreenShot_"+testcasename+"_"+testscriptid+"_"+methodname+".jpg";
							ApplicationIndependent.captureScreenShot(ScreenShotFileName);		
						}
						ReportUtil.addArrayList(testscriptid, description, methodname, pkgclassname, testresult, ScreenShotFileName);
						strTestScriptStatus+=testresult;
						log.info("In Test Scenario "+testcasename+" the method "+methodname+" execution status is :"+testresult);
					}
					String EndTime=ApplicationIndependent.getDateTime("dd-MMM-yyyy hh:mm:ss z");
					
					if (strTestScriptStatus.toLowerCase().contains("fail"))
					{
						ReportUtil.writeTestResults(testcaseid, testcasename, "Failed", startTime, EndTime);
					}
					else
					{
						ReportUtil.writeTestResults(testcaseid, testcasename, "Passed", startTime, EndTime);
					}
							
					}
				log.info("+++++++++++++++++++++++++++++++");
				}
			ReportUtil.endSuite();
			log.info("The execution of method executeTestScenarios ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method executeTestScenarios,The Exception :"+e);
		}
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
	@AfterSuite
	public void endAutomationSuite()
	{
		try
		{
			log.info("The execution of method endAutomationSuite ended here ...");
			String EndTime=ApplicationIndependent.getDateTime("dd-MMM-yyyy hh:mm:ss z");
			ReportUtil.updateEndTime(EndTime);
			log.info("The execution of method endAutomationSuite ended here ...");
			
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method endAutomationSuite,The Exception :"+e);
		}
	}
	

}
