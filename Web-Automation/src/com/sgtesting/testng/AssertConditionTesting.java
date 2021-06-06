package com.sgtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionTesting {

	@Test
	public void assertTrueTesting()
	{
		int a=25;
		int b=100;
		Assert.assertTrue(a<=b);
		System.out.println("This is the last statement in assertTrue Example!!!");
	}
	
	@Test
	public void assertFalseTesting()
	{
		int a=25;
		int b=100;
		Assert.assertFalse(a>=b);
		System.out.println("This is the last statement in assertFalse Example!!!");
	}
}
