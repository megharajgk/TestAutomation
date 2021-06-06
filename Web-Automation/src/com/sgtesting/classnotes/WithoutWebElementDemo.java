package com.sgtesting.classnotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withOutWebElementApproach();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
	
	static void withOutWebElementApproach()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			String value=driver.findElement(By.id("username")).getAttribute("value");
			System.out.println(value);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
