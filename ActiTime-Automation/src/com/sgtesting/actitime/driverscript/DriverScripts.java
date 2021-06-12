package com.sgtesting.actitime.driverscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.datatable.Datatable;
import com.sgtesting.actitime.tests.Initialize;

public class DriverScripts {
	public static String strControllerFile=null;
	public static String strPath=null;
	public static Datatable datatable=null;
	public static String strTestScriptExcelFile=null;
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		try
		{
			
			strPath=System.getProperty("user.dir");
			strControllerFile=strPath+"\\Controller\\data_Controller.xlsx";
			datatable=new Datatable();
			
			//Get the Row Count from data_Controller.xlsx File
			int iControllerRC=datatable.rowCount(strControllerFile, "Scenarios");
			for(int tcid=0;tcid<iControllerRC;tcid++)
			{
				String testcaseid=datatable.getCellData(strControllerFile, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=datatable.getCellData(strControllerFile, "Scenarios", "TestcaseName", tcid+2);
				String testcasedescription=datatable.getCellData(strControllerFile, "Scenarios", "Description", tcid+2);
				String testrunstatus=datatable.getCellData(strControllerFile, "Scenarios", "RunStatus", tcid+2);
				
				System.out.println("testcaseid :"+testcaseid);
				System.out.println("testcasename :"+testcasename);
				System.out.println("testcasedescription :"+testcasedescription);
				System.out.println("testrunstatus :"+testrunstatus);
				
				if(testrunstatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialize.launchBrowser();
					
					Class driverparam[]=new Class[1];
					driverparam[0]=WebDriver.class;
					
					strTestScriptExcelFile=strPath+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int iTestScriptCount=datatable.rowCount(strTestScriptExcelFile, testcaseid);
					for(int tsid=0;tsid<iTestScriptCount;tsid++)
					{
						String testscriptid=datatable.getCellData(strTestScriptExcelFile, testcaseid, "TestScriptID", tsid+2);
						String testscriptdesc=datatable.getCellData(strTestScriptExcelFile, testcaseid, "Description", tsid+2);
						String methodname=datatable.getCellData(strTestScriptExcelFile, testcaseid, "MethodName", tsid+2);
						String pkgclassname=datatable.getCellData(strTestScriptExcelFile, testcaseid, "PackageClassName", tsid+2);
						
						System.out.println("testscriptid :"+testscriptid);
						System.out.println("testscriptdesc :"+testscriptdesc);
						System.out.println("methodname :"+methodname);
						System.out.println("pkgclassname :"+pkgclassname);
						
						Class objClass=Class.forName(pkgclassname);
						Object obj=objClass.newInstance();
						
						Method method=obj.getClass().getMethod(methodname, driverparam);
						method.invoke(obj, oBrowser);
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
