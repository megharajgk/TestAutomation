package com.sgtesting.classnotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withWebElementApproach();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void withWebElementApproach()
	{
		WebElement wEle=null;
		try
		{
			wEle=oBrowser.findElement(By.id("username"));
			wEle.sendKeys("DemoUser1");
			Thread.sleep(2000);
			wEle.clear();
			Thread.sleep(2000);
			wEle.sendKeys("DemoUser2");
			Thread.sleep(2000);
			wEle.clear();
			Thread.sleep(2000);
			wEle.sendKeys("DemoUser3");
			Thread.sleep(2000);
			wEle.clear();
			Thread.sleep(2000);
			wEle.sendKeys("DemoUser3");
			Thread.sleep(2000);
			String value=wEle.getAttribute("value");
			System.out.println(value);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
