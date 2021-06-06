package com.sgtesting.assignment3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver driver=null;
	public static PageObjectModelOfActiTimeApp pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	
	
	static void createUser()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnAddUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("User1");
			pom.lastnameTextField().sendKeys("Demo");
			pom.emailTextField().sendKeys("user1@gmail.com");
			pom.usernameTextField().sendKeys("User1");
			pom.passwordTextField().sendKeys("welcome1");
			pom.passwordCopyTextField().sendKeys("welcome1");
			Thread.sleep(2000);
			pom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("New");
			pom.lastnameTextField().sendKeys("New");
			pom.emailTextField().clear();
			pom.emailTextField().sendKeys("user1new@gmail.com");
			pom.usernameTextField().sendKeys("New");
			pom.passwordTextField().sendKeys("new");
			pom.passwordCopyTextField().sendKeys("new");
			Thread.sleep(2000);
			pom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.clickOnDeleteUser().click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.accept();
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
