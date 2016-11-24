package com.leads.test.suite;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="numbers")														
	public void TestData(int number,int expects)
	{
		Assert.assertEquals(number+10, expects);
		//System.out.println("The Result is "+);
	}
	
	@DataProvider(name="numbers")
	public Object[][] provideData()
	{
		Object[][] data =new Object[][]
				{
			{10,20},{20,30},{40,30},{10,30},{50,60}
				};
				return data;
	}
}
