package com.sgtesting.actitime.utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	public static Properties prop=null;
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
	public ObjectMap(String FileName)
	{
		FileInputStream fin=null;
		
		try
		{
			fin=new FileInputStream(FileName);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String logicalvalue=prop.getProperty(logicalname);
			String locator[]=logicalvalue.split(",");
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			
			if (locatorname.trim().equalsIgnoreCase("id"))
			{
				by=By.id(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("name"))
			{
				by=By.name(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("classname"))
			{
				by=By.className(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("xpath"))
			{
				by=By.xpath(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("cssselector"))
			{
				by=By.cssSelector(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("tagname"))
			{
				by=By.tagName(locatorvalue);
			}
			else if (locatorname.trim().equalsIgnoreCase("partiallinktext"))
			{
				by=By.partialLinkText(locatorvalue);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
