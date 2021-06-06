package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupTesting();	
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void popupTesting()
	{
		try
		{
			System.out.println("Before Click on the © actiTIME Inc. Link # of Child Browsers :"+getPopupCount());
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(4000);
			System.out.println("After Click on the © actiTIME Inc. Link # of Child Browsers :"+getPopupCount());
			if (getPopupCount()>0)
			{
				closePopUps();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static int getPopupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	static void closePopUps()
	{
		String parentBrowser=null;
		Object popups[]=null;
		try
		{
			 parentBrowser=oBrowser.getWindowHandle().toString();
			 System.out.println("Parent Browser :"+parentBrowser);
			 popups=oBrowser.getWindowHandles().toArray();
			 for(int i=1;i<popups.length;i++)
			 {
				 String childBrowser=popups[i].toString();
				 System.out.println("Child browser :"+childBrowser);
				 oBrowser.switchTo().window(childBrowser);
				 oBrowser.findElement(By.linkText("Start Using actiTIME")).click();
				 Thread.sleep(4000);
				 String title=oBrowser.getTitle();
				 System.out.println("Child browser Title :"+title);
				 oBrowser.close();
			 }
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
