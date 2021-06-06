package com.sgtesting.assignment3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static WebDriver driver=null;
	public static PageObjectModelOfActiTimeApp pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeBrowser();
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
			pom=new PageObjectModelOfActiTimeApp(driver);
			
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
			pom.getUserName().sendKeys("admin");
			pom.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyOutWindow()
	{
		try
		{
			pom.closeFlyOutWindow().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			pom.clickOnTasks().click();
			Thread.sleep(2000);
			pom.clickOnAddNew().click();
			Thread.sleep(2000);
			pom.createNewCustomer().click();
			Thread.sleep(2000);
			pom.EnterCustomerNameTextField().sendKeys("demoCustomer");
			Thread.sleep(2000);
			pom.createCustomerButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			pom.CustomerSettings().click();
			Thread.sleep(2000);
			pom.clickOnActionsCustomer().click();
			Thread.sleep(2000);
			pom.deleteCustomer().click();
			Thread.sleep(2000);
			pom.deleteCustomerPermanently().click();
			Thread.sleep(2000);
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
			pom.clickLogout().click();
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
