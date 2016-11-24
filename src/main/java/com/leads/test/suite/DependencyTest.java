package com.leads.test.suite;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void method1()
	{
		throw new RuntimeException();
		//System.out.println("Method 1");
	}
	
	@Test(dependsOnMethods="method1")
	public void method2()
	{
		System.out.println("Method 2 ");
	}
}
