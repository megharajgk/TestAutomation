package com.sgtesting.classnotes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesHandling {

	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		framesHandling();
		//closeBrowser();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
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
			driver.switchTo().frame(0);// It is w.r.t 1st Frame (using index)
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();// to click on "org.openqa.selenium"
			Thread.sleep(2000);
			driver.switchTo().defaultContent();//// It is w.r.t Parent Frame
			Thread.sleep(2000);
			driver.switchTo().frame("packageFrame"); // It is w.r.t 2nd Frame (using name)
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();// to click on "WebDriver"
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oEle=driver.findElement(By.className("rightIframe")); // It is w.r.t 3rd Frame (using WebElement)
			driver.switchTo().frame(oEle);
			String content = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
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
