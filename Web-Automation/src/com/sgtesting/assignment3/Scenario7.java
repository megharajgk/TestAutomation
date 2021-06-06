package com.sgtesting.assignment3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static WebDriver driver=null;
	public static PageObjectModelOfActiTimeApp pom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTasks();
		deleteProject();
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
	static void createProject()
	{
		try
		{
			pom.clickOnAddNew().click();
			Thread.sleep(2000);
			pom.createNewProject().click();
			Thread.sleep(2000);
			pom.enterProjectNameTextField().sendKeys("demoProject");
			Thread.sleep(2000);
			pom.createProjectButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createTask()
	{
		try
		{
			pom.clickOnAddNewTasks().click();
			Thread.sleep(2000);
			pom.clickOnCreateNewTasks().click();
			Thread.sleep(2000);
			pom.enterTask1TextField().sendKeys("Task-1");
			Thread.sleep(2000);
			pom.enterTask2TextField().sendKeys("Task-2");
			Thread.sleep(2000);
			pom.enterTask3TextField().sendKeys("Task-3");
			Thread.sleep(2000);
			pom.enterTask4TextField().sendKeys("Task-4");
			Thread.sleep(2000);
			pom.enterTask5TextField().sendKeys("Task-5");
			Thread.sleep(2000);
			pom.createTasksButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTasks()
	{
		try
		{
			pom.Task1Checkbox().click();
			Thread.sleep(2000);
			pom.Task2Checkbox().click();
			Thread.sleep(2000);
			pom.Task4Checkbox().click();
			Thread.sleep(2000);
			pom.DeleteTask().click();
			Thread.sleep(2000);
			pom.deleteTaskPermanently().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			pom.projectSettings().click();
			Thread.sleep(2000);
			pom.clickOnActionsProject().click();
			Thread.sleep(2000);
			pom.DeleteProject().click();
			Thread.sleep(2000);
			pom.deleteProjectPermanently().click();
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
