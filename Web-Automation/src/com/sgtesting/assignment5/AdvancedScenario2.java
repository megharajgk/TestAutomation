package com.sgtesting.assignment5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvancedScenario2 {

public static WebDriver driver=null;
	
	@Test(priority=1)
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
	@Test(priority=2)
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
	
	@Test(priority=3)
	static void createUser1()
	{
		try
		{
			GenericClass.loginAsAdmin(driver);
			GenericClass.minimizeFlyOutWindow(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click(); //To click on Add User
			Thread.sleep(2000);
			
			driver.findElement(By.name("firstName")).sendKeys("User1");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User1");
			driver.findElement(By.name("password")).sendKeys("welcome1");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
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
			GenericClass.loginAsUser1(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("firstName")).sendKeys("User2");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user2@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User2");
			driver.findElement(By.name("password")).sendKeys("welcome2");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
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
			GenericClass.loginAsUser2(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("firstName")).sendKeys("User3");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user3@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User3");
			driver.findElement(By.name("password")).sendKeys("welcome3");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	static void modifyUser1()
	{
		try
		{
			GenericClass.loginAsAdmin(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome1new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void modifyUser2()
	{
		try
		{
			GenericClass.loginAsUpdatedUser1(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome2new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void modifyUser3()
	{
		try
		{
			GenericClass.loginAsUpdatedUser2(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("New");
			driver.findElement(By.name("lastName")).sendKeys("New");
			driver.findElement(By.name("password")).sendKeys("welcome3new");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			GenericClass.logout(driver);
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
			GenericClass.loginAsUpdatedUser2(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
			GenericClass.logout(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void deleteUser2()
	{
		try
		{
			GenericClass.loginAsUpdatedUser1(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
			GenericClass.logout(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void deleteUser1()
	{
		try
		{
			GenericClass.loginAsAdmin(driver);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();// To click on USERS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			String content=al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
			GenericClass.logout(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
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
