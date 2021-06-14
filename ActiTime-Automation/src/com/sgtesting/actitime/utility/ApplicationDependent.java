package com.sgtesting.actitime.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationDependent {
	
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
	public static boolean isObjectPresent(WebDriver oBrowser,By by)
	{
		boolean status=false;
		try
		{
			oBrowser.findElement(by);
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
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
	public static boolean isAlertPresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().alert();
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}
}
