package com.sgtesting.assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario7 {

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
	static void createCustomer()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("demoCustomer");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void createProject()
	{
		try
		{
			//driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("demoProject");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void createTask()
	{
		try
		{
			//driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Add New Task']")).click();//Add New Tasks
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();//Create new tasks
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[@class='nameCell first']//input")).sendKeys("Task-1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='nameCell first']/following::tr[4]//input")).sendKeys("Task-2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='nameCell first']/following::tr[8]//input")).sendKeys("Task-3");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='nameCell first']/following::tr[12]//input")).sendKeys("Task-4");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='nameCell first']/following::tr[16]//input")).sendKeys("Task-5");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();//create tasks button
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteTasks()
	{
		try
		{
			//driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']//div[@class='checkbox inactive']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/following::tr[1]//div[@class='checkbox inactive']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/following::tr[3]//div[@class='checkbox inactive']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='deleteButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_submitBtn']")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	static void deleteProject()
	{
		try
		{
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='node projectNode notSelected']/div[@class='editButton available']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='editProjectPanelHeader']//div[@class='actionButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='buttonIcon']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	static void deleteCustomer()
	{
		try
		{
			driver.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='ACTIONS']")).click(); //To click on Actions
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Delete']")).click();	//To click on Delete
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();	//To click on Delete permanently
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
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
	
	@Test(priority=11)
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
