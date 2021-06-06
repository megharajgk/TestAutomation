package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static WebDriver driver =null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//close();
	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.out.println(path);
			
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			driver.get("http:\\redbus.in");
			/*	OR
			driver.navigate().to("http:\\redbus.in"); 
			*/
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			//driver.findElement(By.id("i-icon-profile"));
			//driver.findElement(By.className("hid-config-sign"));
			driver.findElement(By.id("src")).sendKeys("Bengaluru");;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
