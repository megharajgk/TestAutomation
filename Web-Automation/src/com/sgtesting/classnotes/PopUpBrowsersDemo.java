package com.sgtesting.classnotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo {

	public static WebDriver driver=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		popupTesting();	
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			driver.get("http://localhost:81/login.do");
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
			System.out.println("Before Click on the © actiTIME Inc. Link number of Child Browsers :"+getPopupCount());
			Thread.sleep(2000);
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(4000);
			System.out.println("After Click on the © actiTIME Inc. Link number of Child Browsers :"+getPopupCount());
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
		count=driver.getWindowHandles().size()-1;
		return count;
	}
	
	static void closePopUps()
	{
		String parentBrowser=null;
		Object popups[]=null;
		try
		{
			 parentBrowser=driver.getWindowHandle().toString();
			 System.out.println("Parent Browser :"+parentBrowser);
			 popups=driver.getWindowHandles().toArray();
			 for(int i=1;i<popups.length;i++)
			 {
				 String childBrowser=popups[i].toString();
				 System.out.println("Child browser :"+childBrowser);
				 driver.switchTo().window(childBrowser);
				 driver.findElement(By.linkText("Start Using actiTIME")).click();
				 Thread.sleep(4000);
				 String title=driver.getTitle();
				 System.out.println("Child browser Title :"+title);
				 driver.close();	//To close particular tab in browser
				 Thread.sleep(4000);
				 driver.quit();		//To close browser
				
			 }
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
