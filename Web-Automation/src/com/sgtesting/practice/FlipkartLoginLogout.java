package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginLogout {
	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		logout();
		//closeBrowser();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			driver.navigate().to("http:\\www.flipkart.com");
			Thread.sleep(2000);
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
			driver.findElement(By.className("_2doB4z")).click();	//To click on cross mark
			Thread.sleep(2000);
			driver.findElement(By.className("_1_3w1N")).click();	//To click on Login button
			Thread.sleep(2000);
			driver.findElement(By.className("VJZDxU")).sendKeys("Enter the Mobile Number");	//To enter the mobile number
			Thread.sleep(2000);
			driver.findElement(By.className("_3mctLh")).sendKeys("Enter the Password");	//To enter the password
			Thread.sleep(2000);
			driver.findElement(By.className("_3AWRsL")).click();	//To click on LOGIN
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/svg")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
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
}
