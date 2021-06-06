package com.sgtesting.robot;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTasks {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();	
		minimizeFlyOutWindow();
		importTasks();
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
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Robot rbt=new Robot();
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_ENTER);	//To press "Enter" key from keyboard
			Thread.sleep(1000);
			rbt.keyRelease(KeyEvent.VK_ENTER);//To release "Enter" key from keyboard
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void importTasks()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String FilePath="D:\\Sample\\Demo\\Sample.csv";
			copyFilePath(FilePath);
			Thread.sleep(2000);
			Robot rbt=new Robot();
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			rbt.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			rbt.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void copyFilePath(String FilePath)
	{
		StringSelection strselection=new StringSelection(FilePath);
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Toolkit obj=Toolkit.getDefaultToolkit();
		obj.getSystemClipboard().setContents(strselection, null);
	}
}
