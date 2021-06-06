package com.sgtesting.testng;

import org.testng.annotations.*;

public class SummaryAnnotations {

	@Test
	public void testcase1()
	{
		System.out.println("It is @Test annotation testcase1 method...");
	}

	@Test
	public void testcase2()
	{
		System.out.println("It is @Test annotation testcase2 method...");
	}
	
	@BeforeMethod
	public void beforeMethodDemo()
	{
		System.out.println("It is @BeforeMethod annotation beforeMethodDemo method");
	}
	
	@AfterMethod
	public void afterMethodDemo()
	{
		System.out.println("It is @AfterMethod annotation afterMethodDemo method");
	}
	
	@BeforeClass
	public void beforeClassDemo()
	{
		System.out.println("It is @BeforeClass annotation beforeClassDemo method");
	}
	
	@AfterClass
	public void afterClassDemo()
	{
		System.out.println("It is @AfterClass annotation afterClassDemo method");
	}
	
	@BeforeTest
	public void beforeTestDemo()
	{
		System.out.println("It is @BeforeTest annotation beforeTestDemo method");
	}
	
	@AfterTest
	public void afterTestDemo()
	{
		System.out.println("It is @AfterTest annotation afterTestDemo method");
	}
	
	@BeforeSuite
	public void beforeSuiteDemo()
	{
		System.out.println("It is @BeforeSuite annotation beforeSuiteDemo method");
	}
	
	@AfterSuite
	public void afterSuiteDemo()
	{
		System.out.println("It is @AfterSuite annotation afterSuiteDemo method");
	}
}
