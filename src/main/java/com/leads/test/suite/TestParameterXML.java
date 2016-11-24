package com.leads.test.suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterXML {

	@Test
	@Parameters({"url","port"})
	public void dbConnection(String url,String port)
	{
		System.out.println(url+port);
	}
}
