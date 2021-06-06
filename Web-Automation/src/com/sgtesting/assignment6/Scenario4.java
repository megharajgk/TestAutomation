package com.sgtesting.assignment6;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario4 {

	public static Logger log=Logger.getLogger("Assignment No=6, Scenario-4");
	public static WebDriver driver=null;
	
	@Test(priority=1)
	static void launchBrowser()
	{
		String path=null;
		try
		{
			log.info("The launchBrowser() method has started");
			log.info("Getting default user directory path");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			log.info("Chrome browser has launched successfully!!!!");
			driver.manage().window().maximize();
			log.info("Chrome browser is maximized");
			log.info("The launchBrowser() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void navigate()
	{
		try
		{
			log.info("The navigate() method has started");
			log.info("Navigating the URL--> 'http://localhost:81/login.do'");
			driver.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			log.info("Login page of 'actiTime' is displayed");
			log.info("The navigate() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void login()
	{
		try
		{
			log.info("The login() method has started");
			log.info("In login page, Entering the Username as 'admin'");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			Thread.sleep(2000);
			log.info("In login page, Entering the Password as 'manager'");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			log.info("In login page, Clicking on LOGIN button");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			log.info("The login() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("Home page is displayed");
			log.info("The minimizeFlyOutWindow() method has started");
			log.info("Minimizing the Flyout window");
			driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
			log.info("The minimizeFlyOutWindow() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void createCustomer()
	{
		try
		{
			log.info("The createCustomer() method has started");
			driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			log.info("Clicked on TASKS button");
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			log.info("Clicked on +Add New button");
			driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			log.info("In drop down, clicked on 'Create New Customer'");
			driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("demoCustomer");
			Thread.sleep(2000);
			log.info("In customer name text field, entered as demoCustomer");
			driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			log.info("Clicked on Create Customer button");
			log.info("The createCustomer() method has ended");
			log.info("------------------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void modifyCustomer()
	{
		try
		{
			log.info("The modifyCustomer() method has started");
			driver.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			log.info("Clicked on Editbutton of customer");
			driver.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("This is Testing purpose");
			Thread.sleep(2000);
			log.info("In text area, typed as 'This is Testing purpose'");
			
			log.info("Clicked on Cross mark in popup window");
			log.info("The modifyCustomer() method has ended");
			log.info("------------------------------------------");
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteCustomer()
	{
		try
		{
			log.info("The deleteCustomer() method has started");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			log.info("Clicked on Editbutton of customer");
			driver.findElement(By.xpath("//div[text()='ACTIONS']")).click(); //To click on Actions
			Thread.sleep(2000);
			log.info("Clicked on ACTION button");
			driver.findElement(By.xpath("//div[text()='Delete']")).click();	//To click on Delete
			Thread.sleep(2000);
			log.info("Clicked on Delete button");
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();	//To click on Delete permanently
			Thread.sleep(2000);
			log.info("Clicked on Delete Permanently button");
			log.info("The deleteCustomer() method has ended");
			log.info("------------------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void logout()
	{
		try
		{
			log.info("The logout() method has started");
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
			log.info("Clicked on LOGOUT button");
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void closeApplication()
	{
		try
		{
			log.info("The closeApplication() method has started");
			driver.close();
			log.info("Chrome browser closed successfully!!!!");
			log.info("The closeApplication() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
