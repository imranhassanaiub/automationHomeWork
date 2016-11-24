package com.leads.test.suite;

import org.testng.annotations.Test;

public class TestOrder {
	@Test(groups={"order","save"})
	public void testMakeOrder()
	{
		System.out.println("Test make order");
	}
	@Test(groups={"order","save"})
	public void testMakeEmptyOrder()
	{
		System.out.println("Test make Empty order");
	}

	@Test(groups={"order"})
	public void testUpdateOrder()
	{
		System.out.println("Test Update order");
	}

	@Test(groups={"order"})
	public void testFindOrder()
	{
		System.out.println("Test Find order");
	}


}
