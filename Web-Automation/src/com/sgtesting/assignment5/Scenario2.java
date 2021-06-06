package com.sgtesting.assignment5;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Scenario2 {
	public static WebDriver driver=null;
	
	@Test(priority=1)
	public void launchBrowser()
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
	public void navigate()
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
	
	@Test(priority=3)
	public void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public static void createUser()
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
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public static void modifyUser()
	{
		try
		{

			//driver.findElement(By.xpath("//a[@class='content users']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//table[@class='userNameContainer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("new");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("new");
			driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user1new@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome1new");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("welcome1new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public static void deleteUser()
	{
		try
		{
			driver.findElement(By.xpath("//table[@class='userNameContainer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.accept();
			Thread.sleep(2000);
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
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void closeApplication()
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
