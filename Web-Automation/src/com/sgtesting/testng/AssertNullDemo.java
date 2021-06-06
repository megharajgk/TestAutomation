package com.sgtesting.testng;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {

	@Test
	public void assertNullTesting()
	{
		File f1=null;
		Assert.assertNull(f1);
		System.out.println("This is the last statement in assertNull Example!!!");
	}

	@Test
	public void assertNotNullTesting()
	{
		File f1=null;
		f1=new File("D:\\Sample\\Demo");
		Assert.assertNotNull(f1);
		System.out.println("This is the last statement in assertNotNull Example!!!");
	}
}
