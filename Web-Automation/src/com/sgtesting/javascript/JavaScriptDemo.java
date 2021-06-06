package com.sgtesting.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getTitleOfApplication();
		getURLOfApplication();
		getNumberOfLinksInApplication();
		setTextInUserName();
		setTextInUserName2();
	//	clickOnButton1();
	//	clickOnButton2();
		clickOnCheckBox1();
		clickOnCheckBox2();
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
			driver.get("file:\\D:\\Notes\\SG_Software\\Selenium\\Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void getTitleOfApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title of the Application :"+title);
	}
	
	static void getURLOfApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL of the Application :"+url);
	}

	static void getNumberOfLinksInApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		long links= (long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links in the Application :"+links);
	}
	
	static void setTextInUserName()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser123'");
	}
	
	static void setTextInUserName2()
	{
		WebElement oEle=driver.findElement(By.id("pwd1pass1word1"));
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Welcome123'",oEle);
	}
	
	static void clickOnButton1()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	static void clickOnButton2()
	{
		WebElement oEle=driver.findElement(By.id("btn1submit1button1"));
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",oEle);
	}
	
	static void clickOnCheckBox1()
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	static void clickOnCheckBox2()
	{
		WebElement oEle=driver.findElement(By.id("chk2linux"));
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",oEle);
	}
}
