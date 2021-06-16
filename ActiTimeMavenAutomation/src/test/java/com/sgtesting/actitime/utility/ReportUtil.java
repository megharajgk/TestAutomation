package com.sgtesting.actitime.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class ReportUtil {
	
	public static void main(String a[])
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("F:/CITY/Test.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Test Web Heading</h1>");
			bw.write("<h2 align=center>Test Web Heading</h2>");
			bw.write("<h3 align=center>Test Web Heading</h3>");
			bw.write("</body>");
			bw.write("</html>");
			bw.flush();
			bw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String ReportFolderPath=null;
	public static String ReportResultFile=null;
	public static String strScenarioName=null;
	
	public static ArrayList<String> testscriptid=new ArrayList<String>();
	public static ArrayList<String> description=new ArrayList<String>();
	public static ArrayList<String> methodname=new ArrayList<String>();
	public static ArrayList<String> pkgclassname=new ArrayList<String>();
	public static ArrayList<String> teststatus=new ArrayList<String>();
	public static ArrayList<String> screenshotName=new ArrayList<String>();
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void createReport(String FileName,String starttime,String environment)
	{
		BufferedWriter bw=null;
		String configFileName=null;
		try
		{
			ReportFolderPath=FileName.substring(0, FileName.lastIndexOf("\\"));
			ReportResultFile=FileName;
			String FilePath=System.getProperty("user.dir");
			configFileName=FilePath+"\\Configuration\\configuration.properties";
			Properties objConfig=ApplicationIndependent.property(configFileName);
			
			bw=new BufferedWriter(new FileWriter(ReportResultFile));
			bw.write("<html>");
			bw.write("<head><title>ActiTime Automation Results</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>ActiTime Automation Results</h1>");
			bw.write("<table border=2>");
			bw.write("<h3>Automation Summary</h3>");
			bw.write("<tr>");
			bw.write("<th align=center>Item Name</th>");
			bw.write("<th align=center>Item Value</th>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Application Name</td>");
			bw.write("<td>"+objConfig.getProperty("applicationname")+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Application Version</td>");
			bw.write("<td>"+objConfig.getProperty("applicationversion")+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Browser Name</td>");
			bw.write("<td>"+objConfig.getProperty("browserName")+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Application URL</td>");
			bw.write("<td>"+objConfig.getProperty("url")+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Environment</td>");
			bw.write("<td>"+environment+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Automation Start Time</td>");
			bw.write("<td>"+starttime+"</td>");
			bw.write("</tr>");
			bw.newLine();
			bw.write("<tr>");
			bw.write("<td>Automation Start Time</td>");
			bw.write("<td>END_TIME</td>");
			bw.write("</tr>");
			bw.write("</table>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void startSuite(String ScenarioName)
	{
		BufferedWriter bw=null;
		try
		{
			strScenarioName=ScenarioName.replaceAll(" ", "_");
			bw=new BufferedWriter(new FileWriter(ReportResultFile,true));
			bw.write("<html>");
			bw.write("<body>");
			bw.write("<table width=100% border=2>");
			bw.write("<h2>Automation Execution Details</h2>");
			bw.write("<tr>");
			bw.write("<th align=center width=15%>Testcase ID</th>");
			bw.write("<th align=center width=20%>Testcase Name</th>");
			bw.write("<th align=center width=15%>Status</th>");
			bw.write("<th align=center width=25%>Test Start Time</th>");
			bw.write("<th align=center width=25%>Test End Time</th>");
			bw.write("</tr>");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void endSuite()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter(ReportResultFile,true));
			bw.write("</table>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void addArrayList(String scriptid,String desc,String methodname1,String packageclassname,String Status,String screenshot)
	{
		testscriptid.add(scriptid);
		description.add(desc);
		methodname.add(methodname1);
		pkgclassname.add(packageclassname);
		teststatus.add(Status);
		screenshotName.add(screenshot);
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void writeTestResults(String testcaseid,String testname,String status,String starttime,String endtime)
	{
		String FileName = null;
		BufferedWriter bw=null;
		try
		{
			FileName=ReportFolderPath+"\\"+strScenarioName+"_"+testname+"_Results.html";
			bw=new BufferedWriter(new FileWriter(FileName));
			bw.write("<html>");
			bw.write("<head><title>"+testname+" Detail Results</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>"+testname+" Detail Results</h1>");
			bw.newLine();
			bw.write("<table border=1 width=100%>");
			bw.write("<h2 align=left>"+testname+" Detail Results</h2>");
			bw.write("<tr>");
			bw.write("<th width=10%>TestScriptID</th>");
			bw.write("<th width=20%>Description</th>");
			bw.write("<th width=15%>TestScriptName</th>");
			bw.write("<th width=20%>PackageName</th>");
			bw.write("<th width=10%>Status</th>");
			bw.write("<th width=25%>ScreenShotName</th>");
			bw.write("</tr>");
			
			if (methodname != null)
			{
				
				for (int i=0;i<methodname.size();i++)
				{
					bw.write("<tr>");
					bw.write("<td width=10%>"+testscriptid.get(i)+"</td>");
					bw.write("<td width=20%>"+description.get(i)+"</td>");
					bw.write("<td width=15%>"+methodname.get(i)+"</td>");
					bw.write("<td width=20%>"+pkgclassname.get(i)+"</td>");
					if (teststatus.get(i).equalsIgnoreCase("pass"))
					{
						bw.write("<td width=10%>"+teststatus.get(i)+"</td>");
						bw.write("<td width=25%>&nbsp</td>");
					}
					else
					{
						bw.write("<td width=10%>"+teststatus.get(i)+"</td>");
						bw.write("<td width=25%><a href=file:///"+screenshotName.get(i)+".jpg"+">ScreenShotName</a></td>");
					}
					bw.write("</tr>");
				}
				
			}
			bw.write("</table>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		try
		{
			bw=new BufferedWriter(new FileWriter(ReportResultFile,true));
			bw.write("<tr>");
			bw.write("<td width=15% align=center>"+testcaseid+"</td>");
			bw.write("<td width=20% align=center>"+testname+"</td>");
			bw.write("<td width=15% align=center><a href=file:///"+FileName+">"+status+"</a></td>");
			bw.write("<td width=25% align=center>"+starttime+"</td>");
			bw.write("<td width=25% align=center>"+endtime+"</td>");
			bw.write("</tr>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	 testscriptid=new ArrayList<String>();
	 description=new ArrayList<String>();
	 methodname=new ArrayList<String>();
	 pkgclassname=new ArrayList<String>();
	 teststatus=new ArrayList<String>();
	 screenshotName=new ArrayList<String>();
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void updateEndTime(String endTime)
	{
		try
		{
			StringBuffer str=new StringBuffer();
			FileInputStream fin=new FileInputStream(ReportResultFile);
			DataInputStream dis=new DataInputStream(fin);
			InputStreamReader fr=new InputStreamReader(dis);
			BufferedReader br=new BufferedReader(fr);
			String strLine=null;
			while((strLine=br.readLine())!=null)
			{
				if (strLine.indexOf("END_TIME")!=-1)
				{
					strLine=strLine.replace("END_TIME", endTime);
				}
				str.append(strLine);
			}
			fin.close();
			FileOutputStream fout=new FileOutputStream(ReportResultFile);
			DataOutputStream out=new DataOutputStream(fout);
			out.writeBytes(str.toString());
			
			fout.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
