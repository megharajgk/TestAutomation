package com.sgtesting.assignment6;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario1 {

	public static Logger log=Logger.getLogger("Assignment No=6, Scenario-1");
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
	static void createUser()
	{
		try
		{
			log.info("The createUser() method has started");
			log.info("Clicking on USER");
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			log.info("Clicking on +Add User button");
			driver.findElement(By.xpath("//div[text()='Add User']")).click();
			log.info("Add User popup window is opened");
			log.info("In FirstName text field, entered FirstName as 'User1'");
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("User1");
			log.info("In LastName text field, entered LastName as 'Demo'");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Demo");
			log.info("In email text field, entered email as 'usre1@gmail.com'");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("usre1@gmail.com");
			log.info("In UserName text field, entered UserName as 'User1'");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("User1");
			log.info("In Password text field, entered Password as 'welcome1'");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome1");
			log.info("In Retype Password text field, entered Password as 'welcome1'");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("welcome1");
			Thread.sleep(2000);
			log.info("Clicking on +Create User button");
			driver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			log.info("The createUser() method has ended");
			log.info("------------------------------------------");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void deleteUser()
	{
		try
		{
			log.info("The deleteUser() method has started");
			driver.findElement(By.xpath("//table[@class='userNameContainer']")).click();
			Thread.sleep(2000);
			log.info("Clicked on Created User");
			driver.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			log.info("Clicked on Delete User button");
			log.info("Confirmation popup window has appeared");
			Alert al=driver.switchTo().alert();
			log.info("Switched to popup window");
			al.accept();
			log.info("In popup window, accepted the message by clicking on OK button");
			log.info("The deleteUser() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
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
	@Test(priority=8)
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
