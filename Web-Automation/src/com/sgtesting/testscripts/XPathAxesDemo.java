package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonNameSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextSachinTendulkar();
	//	forDesignationIndianFreedomFighterMakeTheStatusAsActive();
	//	forAPersonSachinTendulkarHisPrevious2ndRowMakeTheStatusAsActive();
	//	basedOnSpecificTextFieldFindTheidAttributeValueOfTable();
		basedOnTableTagSelectCityNameIn4thRow();
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
			oBrowser.get("file:///F:/HTML/XPath/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  following-sibling
	 */
	static void enterSalaryForPersonNameSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
	}


	/**
	 *  following
	 */
	static void enterSalaryForPersonWhoIsNextSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("35000");
	}

	/**
	 *  preceding-sibling
	 */
	static void forDesignationIndianFreedomFighterMakeTheStatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 *  preceding
	 */
	static void forAPersonSachinTendulkarHisPrevious2ndRowMakeTheStatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	
	/**
	 *  ancestor
	 */
	static void basedOnSpecificTextFieldFindTheidAttributeValueOfTable()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr[1]/ancestor::table"));
		String attributeValue=oEle.getAttribute("id");
		System.out.println(attributeValue);
	}
	
	/**
	 *  descendant
	 */
	static void basedOnTableTagSelectCityNameIn4thRow()
	{
		try {
			WebElement oEle=oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[4]/select"));
			Select oSelect=new Select(oEle);
			oSelect.selectByVisibleText("Bangalore");
			Thread.sleep(2000);
			oSelect.selectByIndex(2);
			Thread.sleep(2000);
			oSelect.selectByValue("pj");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
