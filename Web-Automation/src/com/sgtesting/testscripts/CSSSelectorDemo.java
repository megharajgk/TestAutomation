package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCssSelector();
	//	relativeCSSUsingTagNameAlone();
	//	relativeCSSUsingTagNameWithIdAttributeValue();
	//	relativeCSSUsingIdAttributeValueAlone();
	//	relativeCSSUsingTagNameWithClassAttributeValue();
	//	relativeCSSUsingClassAttributeValueAlone();
	//	relativeCSSUsingAttributeNameAndValueCombination();
	//	relativeCSSUsingMultipleAttributeNameAndValueCombination();
	//	relativeCSSUsingAttributeNameAndValueCombinationForAnyTag();
	//	relativeCSSUsingPartialMatchingOfAttributeValue();
	//	relativeCSSUsingParentElementReference();
	//	relativeCSSUsingTagNameWithAttributeNameAlone();
	//	relativeCSSUsingnthChildConcept();
		relativeCSSUsingSiblingConcept();
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
	
	static void absoluteCssSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser123");
	}
	
	/**
	 * Case 1: Identify the Element based on tagName
	 * Syntax: <tagName>
	 */
	static void relativeCSSUsingTagNameAlone()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the Element based on tagName with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	static void relativeCSSUsingTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the Element based on id attribute value alone
	 * Syntax: #<id attribute value>
	 */
	static void relativeCSSUsingIdAttributeValueAlone()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify the Element based on tagName with ClassName attribute value
	 * Syntax: <tagName>.<Class Attribute Value>
	 */
	static void relativeCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 5: Identify the Element based on ClassName attribute value Alone
	 * Syntax: <tagName>.<Class Attribute Value>
	 */
	static void relativeCSSUsingClassAttributeValueAlone()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 6: Identify the Element based on <tagName> with attribute Name and attribute value combination
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	static void relativeCSSUsingAttributeNameAndValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1']")).click();
	}
	
	/**
	 * Case 7: Identify the Element based on <tagName> with Multiple attribute Name and attribute value combination
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	static void relativeCSSUsingMultipleAttributeNameAndValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[name='submit1btn1'][value='Submit']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on attribute Name and attribute value combination for any tag
	 * Syntax: *[attributename='attributevalue']
	 */
	static void relativeCSSUsingAttributeNameAndValueCombinationForAnyTag()
	{
		oBrowser.findElement(By.cssSelector("*[name='submit1btn1']")).click();
	}

	/**
	 * Case 9: Identify the Element based on partial matching of attribute value 
	 * starts-with in css is ^=
	 * Syntax: <tagName>[id ^= 'attribute value'] 
	 * ends-with in css is $= 
	 * Syntax: <tagName>[id $= 'attribute value'] 
	 * contains in css is *=
	 * Syntax: <tagName>[id *= 'attribute value'] 
	 */
	static void relativeCSSUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
	}
	
	/**
	 * Case 10: Identify the Element based on Parent Element referece
	 * Syntax: <parentElement> > <childElement>
	 */
	static void relativeCSSUsingParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("div#d2 > form#frm2 >input")).click();
	}
	
	/**
	 * Case 11: Identifying Element based on TagName Along with Attribute Name alone
	 * Syntax: //<tagName>[attributename]
	 */
	static void relativeCSSUsingTagNameWithAttributeNameAlone()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
			System.out.println("# of  Links are :"+olinks.size());
			//Click on 2nd Link
			olinks.get(1).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 12: Identify the Element based on nth-child concept
	 * Syntax: <parentElement> > nth-child
	 */
	static void relativeCSSUsingnthChildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(7)")).sendKeys("DemoUser12345");
	}
	
	/**
	 * Case 13: Identify the Element based on sibling concept
	 * Syntax: <parentElement> > nth-child
	 */
	static void relativeCSSUsingSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 >input + input + input")).sendKeys("DemoUser12345");
	}
	
}
