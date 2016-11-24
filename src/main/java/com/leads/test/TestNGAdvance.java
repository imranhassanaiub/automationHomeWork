package com.leads.test;

import org.testng.annotations.Test;

public class TestNGAdvance {

	@Test(timeOut=5000)
	public void timeoutTest() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Hello");
	}
}
