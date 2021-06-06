package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagNameAlone();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValueCombination();
	//	relativeXPathUsingAttributeNameValueCombination();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombination();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingOROperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAndOperator();
	//	relativeXPathUsingTextContent();
	//	relativeXPathUsingPartialTextContent();
	//	relativeXPathUsingPartialAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeNameAlone();
	//	relativeXPathUsingTagNameWithAttributeNameAlone1();
		relativeXPathUsingTagNameWithAttributeNameAlone2();
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
			oBrowser.get("file:///F:/HTML/XPath/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * The absolute xpath always starts with root tag i.e HTML
	 */
	static void absoluteXPath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 1: Identifying Element based on TagName Alone
	 * Syntax: //<tagName>
	 */
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identifying Element based on TagName With Index Number
	 * Syntax: //<tagName>[index]
	 */
	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Welcome123");
	}

	/**
	 * Case 3: Identifying Element based on TagName Along with Attribute Name and value combination
	 * Syntax: //<tagName>[@attributename='attributevalue']
	 */
	static void relativeXPathUsingTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * Case 4: Identifying Element based on Attribute Name and value combination
	 * Syntax: //*[@attributename='attributevalue']
	 */
	static void relativeXPathUsingAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 5: Identifying Element based on Attribute value Alone
	 * Syntax: //*[@*='attributevalue']
	 */
	static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	
	/**
	 * Case 6: Identifying Element based on TagName Along with Multiple Attribute Name and value combination
	 * Syntax: //<tagName>[@attributename1='attributevalue1'][@attributename2='attributevalue2']
	 */
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 7: Identifying Element based on TagName Along with Multiple Attribute Name and value combination using OR operator
	 * Syntax: //<tagName>[@attributename1='attributevalue1' or @attributename2='attributevalue2']
	 */
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @name='submit1btn1']")).click();
	}
	
	/**
	 * Case 8: Identifying Element based on TagName Along with Multiple Attribute Name and value combination using AND operator
	 * Syntax: //<tagName>[@attributename1='attributevalue1' and @attributename2='attributevalue2']
	 */
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @name='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: Identifying Element based on Text Content
	 * Syntax: //<tagName>[text()='content']
	 * Example:
	 * <div>Login </div>
	 * //div[text()='Login ']
	 */
	static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Gmail']")).click();
	}
	
	/**
	 * Case 10: Identifying Element based on Partial Matching of Text Content
	 *  starts-with(text(),'text Content')
	 *  ends-with(text(),'text Content')
	 *  contains(text(),'text Content')
	 *  Syntax:
	 *  //<tagName>[starts-with(text(),'text Content')]
	 *  //<tagName>[ends-with(text(),'text Content')]
	 *  //<tagName>[contains(text(),'text Content')]
	 */
	static void relativeXPathUsingPartialTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'Gm')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'mail')]")).click();
	}
	
	/**
	 * Case 11: Identifying Element based on Partial Matching Attribute Value
	 *  starts-with(@attributename,'partial attribute value')
	 *  ends-with(@attributename,'partial attribute value')
	 *  contains(@attributename,'partial attribute value')
	 *  Syntax:
	 *  //<tagName>[starts-with(@attributename,'partial attribute value')]
	 *  //<tagName>[ends-with(@attributename,'partial attribute value')]
	 *  //<tagName>[contains(@attributename,'partial attribute value')]
	 */
	static void relativeXPathUsingPartialAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'pwd1')]")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//input[contains(@id,'pass1')]")).sendKeys("Welcome123");
	}
	
	/**
	 * Case 12: Identifying Element based on TagName Along with Attribute Name alone
	 * Syntax: //<tagName>[@attributename]
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAlone()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of  Links are :"+olinks.size());
			//Click on 2nd Link
			olinks.get(1).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * There are N numbers of links available in the application 
	 * based on ends-with approach click on specific link
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAlone1()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of  Links are :"+olinks.size());
			
			for(int i=0;i<olinks.size();i++)
			{
				String content=olinks.get(i).getText();
				System.out.println(content);
				if(content.endsWith("HQ"))
				{
					olinks.get(i).click();
					break;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  StaleElementReferenceException
	 *  org.openqa.selenium.StaleElementReferenceException: 
	 *  stale element reference: element is not attached to the page document
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAlone2()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of  Links are :"+olinks.size());
			
			for(int i=0;i<olinks.size();i++)
			{
				String content=olinks.get(i).getText();
				System.out.println(content);
				if(content.endsWith("HQ"))
				{
					olinks.get(i).click();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
