package com.sgtesting.assignment4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
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
	static void login()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add User']")).click();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("User1");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Demo");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("usre1@gmail.com");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("User1");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome1");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			driver.findElement(By.xpath("//table[@class='userNameContainer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
