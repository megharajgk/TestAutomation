package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		framesHandling();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void framesHandling()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.className("rightIframe"));
			oBrowser.switchTo().frame(oEle);
			String content = oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
