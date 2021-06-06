package com.sgtesting.assignment3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	public static WebDriver driver=null;
	public static PageObjectModelOfActiTimeApp pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		
		loginAsAdmin();
		minimizeFlyOutWindow();
		createUser1();
		logoutAsAdmin();
		
		loginAsUser1();
		createUser2();
		logoutAsUser1();
		
		loginAsUser2();
		createUser3();
		logoutAsUser2();
		
		loginAsAdmin();
		modifyUser1();
		logoutAsAdmin();
		
		loginAsUpdatedUser1();
		modifyUser2();
		logoutAsUser1();
		
		loginAsUpdatedUser2();
		modifyUser3();
		logoutAsUser2();
		
		loginAsUpdatedUser2();
		deleteUser3();
		logoutAsUser2();
		
		loginAsUpdatedUser1();
		deleteUser2();
		logoutAsUser1();
		
		loginAsAdmin();
		deleteUser1();
		logoutAsAdmin();
		
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
			Thread.sleep(2000);	//To make the delay of 3 Seconds
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsAdmin()
	{
		try
		{
			pom.getUserName().sendKeys("admin");
			pom.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			pom.closeFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser1()
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsAdmin()
	{
		try
		{
			pom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser1()
	{
		try
		{
			pom.getUserName().sendKeys("User1");
			pom.getPassword().sendKeys("welcome1");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
			Thread.sleep(2000);
			pom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnAddUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("User2");
			pom.lastnameTextField().sendKeys("Demo");
			pom.emailTextField().sendKeys("user2@gmail.com");
			pom.usernameTextField().sendKeys("User2");
			pom.passwordTextField().sendKeys("welcome2");
			pom.passwordCopyTextField().sendKeys("welcome2");
			Thread.sleep(2000);
			pom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsUser1()
	{
		try
		{
			pom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser2()
	{
		try
		{
			pom.getUserName().sendKeys("User2");
			pom.getPassword().sendKeys("welcome2");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
			Thread.sleep(2000);
			pom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnAddUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("User3");
			pom.lastnameTextField().sendKeys("Demo");
			pom.emailTextField().sendKeys("user3@gmail.com");
			pom.usernameTextField().sendKeys("User3");
			pom.passwordTextField().sendKeys("welcome3");
			pom.passwordCopyTextField().sendKeys("welcome3");
			Thread.sleep(2000);
			pom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsUser2()
	{
		try
		{
			pom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser1()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("New");
			pom.lastnameTextField().sendKeys("New");
			pom.emailTextField().clear();
			pom.emailTextField().sendKeys("user1new@gmail.com");
			pom.passwordTextField().sendKeys("welcome1new");
			pom.passwordCopyTextField().sendKeys("welcome1new");
			Thread.sleep(2000);
			pom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUpdatedUser1()
	{
		try
		{
			pom.getUserName().sendKeys("User1");
			pom.getPassword().sendKeys("welcome1new");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
			Thread.sleep(2000);
			pom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("New");
			pom.lastnameTextField().sendKeys("New");
			pom.emailTextField().clear();
			pom.emailTextField().sendKeys("user2new@gmail.com");
			pom.passwordTextField().sendKeys("welcome2new");
			pom.passwordCopyTextField().sendKeys("welcome2new");
			Thread.sleep(2000);
			pom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUpdatedUser2()
	{
		try
		{
			pom.getUserName().sendKeys("User2");
			pom.getPassword().sendKeys("welcome2new");
			Thread.sleep(2000);
			pom.clickLoginButton().click();
			Thread.sleep(2000);
			pom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser3()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			pom.firstnameTextField().sendKeys("New");
			pom.lastnameTextField().sendKeys("New");
			pom.emailTextField().clear();
			pom.emailTextField().sendKeys("user3new@gmail.com");
			pom.passwordTextField().sendKeys("welcome3new");
			pom.passwordCopyTextField().sendKeys("welcome3new");
			Thread.sleep(2000);
			pom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnCreatedUser3().click();;
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
	static void deleteUser2()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
			pom.clickOnCreatedUser2().click();;
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
	static void deleteUser1()
	{
		try
		{
			pom.clickOnUser().click();
			Thread.sleep(2000);
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
