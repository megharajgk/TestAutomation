package com.sgtesting.assignment6;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sgtesting.assignment5.GenericClass;

public class AdvancedScenario1 {
	public static Logger log=Logger.getLogger("Assignment No=6, AdvancedScenario-1");
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
	static void createUser1()
	{
		try
		{
			log.info("The loginAsAdmin() method has started");
			GenericClass.loginAsAdmin(driver);
			log.info("The loginAsAdmin() method has ended");
			log.info("------------------------------------------");
			
			log.info("The minimizeFlyOutWindow() method has started");
			GenericClass.minimizeFlyOutWindow(driver);
			Thread.sleep(2000);
			log.info("The minimizeFlyOutWindow() method has ended");
			log.info("------------------------------------------");
			
			log.info("The createUser1() method has started");
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			log.info("Clicked on USER");
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click(); //To click on Add User
			Thread.sleep(2000);
			log.info("Clicked on +Add User");
			driver.findElement(By.name("firstName")).sendKeys("User1");
			log.info("In FirstName text field, entered as 'User1'");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			log.info("In LastName text field, entered as 'Demo'");
			driver.findElement(By.name("email")).sendKeys("user1@gmail.com");
			log.info("In email text field, entered as 'user1@gmail.com'");
			driver.findElement(By.name("username")).sendKeys("User1");
			log.info("In UserName text field, entered as 'User1'");
			driver.findElement(By.name("password")).sendKeys("welcome1");
			log.info("In Password text field, entered as 'welcome1'");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			log.info("In Re-type Password text field, entered as 'welcome1'");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			log.info("Clicked on Create User button");
			log.info("The createUser1() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void createUser2()
	{
		try
		{
			log.info("The createUser2() method has started");
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			log.info("Clicked on +Add User");
			driver.findElement(By.name("firstName")).sendKeys("User2");
			log.info("In FirstName text field, entered as 'User2'");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			log.info("In LastName text field, entered as 'Demo'");
			driver.findElement(By.name("email")).sendKeys("user2@gmail.com");
			log.info("In email text field, entered as 'user2@gmail.com'");
			driver.findElement(By.name("username")).sendKeys("User2");
			log.info("In UserName text field, entered as 'User2'");
			driver.findElement(By.name("password")).sendKeys("welcome2");
			log.info("In Password text field, entered as 'welcome2'");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			log.info("In Re-type Password text field, entered as 'welcome2'");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			log.info("Clicked on Create User button");
			log.info("The createUser2() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void createUser3()
	{
		try
		{
			log.info("The createUser3() method has started");
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			
			log.info("Clicked on +Add User");
			driver.findElement(By.name("firstName")).sendKeys("User3");
			log.info("In FirstName text field, entered as 'User3'");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			log.info("In LastName text field, entered as 'Demo'");
			driver.findElement(By.name("email")).sendKeys("user3@gmail.com");
			log.info("In email text field, entered as 'user3@gmail.com'");
			driver.findElement(By.name("username")).sendKeys("User3");
			log.info("In UserName text field, entered as 'User3'");
			driver.findElement(By.name("password")).sendKeys("welcome3");
			log.info("In Password text field, entered as 'welcome3'");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			log.info("In Re-type Password text field, entered as 'welcome3'");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			log.info("Clicked on Create User button");
			log.info("The createUser3() method has ended");
			log.info("------------------------------------------");
			
			log.info("The logout() method has started");
			GenericClass.logout(driver);
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void loginLogout()
	{
		try
		{
			log.info("The loginAsUser1() method has started");
			GenericClass.loginAsUser1(driver);
			log.info("The loginAsUser1() method has ended");
			log.info("------------------------------------------");
			
			log.info("The logout() method has started");
			GenericClass.logout(driver);
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
			
			log.info("The loginAsUser2() method has started");
			GenericClass.loginAsUser2(driver);
			log.info("The loginAsUser2() method has ended");
			log.info("------------------------------------------");
			
			log.info("The logout() method has started");
			GenericClass.logout(driver);
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
			
			log.info("The loginAsUser3() method has started");
			GenericClass.loginAsUser3(driver);
			log.info("The loginAsUser3() method has ended");
			log.info("------------------------------------------");
			
			log.info("The logout() method has started");
			GenericClass.logout(driver);
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteUser1()
	{
		try
		{
			log.info("The loginAsAdmin() method has started");
			GenericClass.loginAsAdmin(driver);
			log.info("The loginAsAdmin() method has ended");
			log.info("------------------------------------------");
			
			log.info("The deleteUser1() method has started");
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			log.info("Clicked on USER");
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			log.info("Clicked on created user i.e, User1");
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			log.info("Clicked on Delete Button");
			Alert al=driver.switchTo().alert();
			log.info("Switched to popup window");
			String content=al.getText();
			System.out.println(content);
			al.accept();
			log.info("Accepted the message in popup window by clicking on OK button");
			Thread.sleep(2000);
			log.info("The deleteUser1() method has ended");
			log.info("------------------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void deleteUser2()
	{
		try
		{
			log.info("The deleteUser2() method has started");
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			log.info("Clicked on created user i.e, User2");
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			log.info("Clicked on Delete Button");
			Alert al=driver.switchTo().alert();
			log.info("Switched to popup window");
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
			log.info("Accepted the message in popup window by clicking on OK button");
			log.info("The deleteUser2() method has ended");
			log.info("------------------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void deleteUser3()
	{
		try
		{
			log.info("The deleteUser3() method has started");
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			log.info("Clicked on created user i.e, User3");
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			log.info("Clicked on Delete Button");
			Alert al=driver.switchTo().alert();
			log.info("Switched to popup window");
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
			log.info("Accepted the message in popup window by clicking on OK button");
			log.info("The deleteUser3() method has ended");
			log.info("------------------------------------------");
			
			log.info("The logout() method has started");
			GenericClass.logout(driver);
			log.info("The logout() method has ended");
			log.info("------------------------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
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
