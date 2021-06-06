package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withOutWebElementApproach();
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
	
	static void withOutWebElementApproach()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			String value=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(value);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
