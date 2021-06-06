package com.sgtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameTesting {

	@Test
	public void assertSameTesting()
	{
		String s1="JavaScript";
		String s2="JavaScript";
		Assert.assertSame(s1, s2);
		System.out.println("This is the last statement in assertSame Example!!!");
	}

	
	@Test
	public void assertNotSameTesting()
	{
		String s1="JavaScript";
		String s2=new String("JavaScript1");
		Assert.assertNotSame(s1, s2);
		System.out.println("This is the last statement in assertNotSame Example!!!");
	}
}
