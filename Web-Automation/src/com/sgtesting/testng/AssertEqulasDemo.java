package com.sgtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqulasDemo {

	@Test
	public void assertEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript";
		Assert.assertEquals(s1, s2);
		System.out.println("This is the last statement in assertEqulas Example!!!");
	}
	
	@Test
	public void assertNotEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript1";
		Assert.assertNotEquals(s1, s2);
		System.out.println("This is the last statement in assertNotEqulas Example!!!");
	}
}
