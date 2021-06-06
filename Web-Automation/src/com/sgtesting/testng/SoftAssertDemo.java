package com.sgtesting.testng;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

public static SoftAssert softassert=new SoftAssert();
	
	@Test
	public void assertEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript";
		softassert.assertEquals(s1, s2);
		System.out.println("This statement executes either pass or fail of assertEqulas step!!!");
	}

	@Test
	public void assertNotEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript1";
		softassert.assertNotEquals(s1, s2);
		System.out.println("This statement executes either pass or fail of assertNotEqulas step!!!");
	}
	
	@Test
	public void assertTrueTesting()
	{
		int a=25;
		int b=100;
		softassert.assertTrue(a<=b);
		System.out.println("This statement executes either pass or fail of assertTrue step!!!");
	}
	
	@Test
	public void assertFalseTesting()
	{
		int a=25;
		int b=100;
		softassert.assertFalse(a>=b);
		System.out.println("This statement executes either pass or fail of assertFalse step!!!");
	}
	
	@Test
	public void assertNullTesting()
	{
		File f1=null;
		softassert.assertNull(f1);
		System.out.println("This statement executes either pass or fail of assertNull step!!!");
	}

	@Test
	public void assertNotNullTesting()
	{
		File f1=null;
		f1=new File("D:\\Sample\\Demo");
		softassert.assertNotNull(f1);
		System.out.println("This statement executes either pass or fail of assertNotNull step!!!");
	}
	
	@Test
	public void assertSameTesting()
	{
		String s1="JavaScript";
		String s2="JavaScript";
		softassert.assertSame(s1, s2);
		System.out.println("This statement executes either pass or fail of assertSame step!!!");
	}

	
	@Test
	public void assertNotSameTesting()
	{
		String s1="JavaScript";
		String s2=new String("JavaScript");
		softassert.assertNotSame(s1, s2);
		System.out.println("This statement executes either pass or fail of assertNotSame step!!!");
	}
}
