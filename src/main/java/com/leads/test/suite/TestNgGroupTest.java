package com.leads.test.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNgGroupTest {

	@BeforeGroups("database")
	public void setupDB()
	{
		System.out.println("DB SEtup");
	}
	
	@AfterClass
	public void cleanDB()
	{
		System.out.println("DB Clean");
	}
	
	
	@Test(groups="normal",priority=2)
	public void normalTest()
	{
		System.out.println("Normal Test");
	}
	
	@Test(groups="normal",priority=2)
	public void normalTest1()
	{
		System.out.println("Normal Test 1 ");
	}
	
	
	
	@Test(groups="database",priority=1)
	public void testConnectionOracle()
	{
		System.out.println("Test connection to Oracle");
	}
	@Test(groups="database",priority=1)
	public void testConnectionOMysql()
	{
		System.out.println("Test connection to MySql");
	}
	
	
	@Test(dependsOnGroups={"database"})
	public void finalTest()
	{
		System.out.println("Final Test !!!");
	}
}
