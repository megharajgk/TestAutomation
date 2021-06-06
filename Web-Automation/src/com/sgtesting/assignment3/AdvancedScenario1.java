package com.sgtesting.assignment3;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario1 {

	public static WebDriver driver=null;
	public static PageObjectModelOfActiTimeApp pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		loginAsAdmin();
		minimizeFlyOutWindow();
		
		createUser1();
		createUser2();
		createUser3();
		
		logoutAsAdmin();
		
		loginAsUser1();
		logoutAsUser1();
		
		loginAsUser2();
		logoutAsUser2();
		
		loginAsUser3();
		logoutAsUser3();
		
		loginAsAdmin();
		
		deleteUser1();
		deleteUser2();
		deleteUser3();
		
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
	
	static void createUser2()
	{
		try
		{
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
	
	static void createUser3()
	{
		try
		{
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
	static void logoutAsUser1()
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
	static void loginAsUser3()
	{
		try
		{
			pom.getUserName().sendKeys("User3");
			pom.getPassword().sendKeys("welcome3");
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
	static void logoutAsUser3()
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
	static void deleteUser2()
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
	static void deleteUser3()
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
