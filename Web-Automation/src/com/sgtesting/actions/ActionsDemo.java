package com.sgtesting.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo 
{
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseDemo();
		
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
			driver.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void mouseDemo()
	{
		try
		{
			WebElement oEle=driver.findElement(By.xpath("//img[@alt='Fashion']"));
			Thread.sleep(4000);
			Actions oMouse=new Actions(driver);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_3XS_gI']/a[3]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
