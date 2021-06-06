package com.sgtesting.assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericClass {
	public static void loginAsAdmin(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeFlyOutWindow(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginAsUser1(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginAsUser2(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginAsUser3(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User3");
			driver.findElement(By.name("pwd")).sendKeys("welcome3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginAsUpdatedUser1(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("welcome1new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}public static void loginAsUpdatedUser2(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("welcome2new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}public static void loginAsUpdatedUser3(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User3");
			driver.findElement(By.name("pwd")).sendKeys("welcome3new");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout(WebDriver driver)
	{
		try
		{
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
