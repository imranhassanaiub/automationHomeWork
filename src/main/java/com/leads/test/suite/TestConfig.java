package com.leads.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestConfig {

	@BeforeSuite
	public void testBeforeSuite()
	{
		System.out.println("test Before Suite");
	}
	
	@AfterSuite
	public void testAfterSuite()
	{
		System.out.println("test After Suite");
	}
	
	@BeforeTest
	public void testBeforeTest()
	{
		System.out.println("test Before Test");
	}
	
	@Test
	public void tests()
	{
		System.out.println("Test");
	}
	@AfterTest
	public void testAfterTest()
	{
		System.out.println("test After Test");
	}
}
