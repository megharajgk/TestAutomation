package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.driverscript.DriverScript;

public class HomePage extends DriverScript{
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	public static String minimizeFlyOutWindow(WebDriver oBrowser)
	{
		String scriptStatus="Fail";
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			scriptStatus="Pass";
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return scriptStatus;
	}
}
