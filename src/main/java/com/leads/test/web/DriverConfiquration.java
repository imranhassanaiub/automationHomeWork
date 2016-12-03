package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfiquration {
	private static  WebDriver driver=null;
	/*protected WebDriver loadDriver()
	{
		
		
	}*/
	private DriverConfiquration()
	{
		
	}
	public static synchronized WebDriver loadDriver()
	{
		if(driver==null)
			{
				System.setProperty("webdriver.gecko.driver", "E://geckodriver-v0.11.1-win64/wires.exe");
				return driver = new FirefoxDriver();
			}
		else
			return driver;
	}

}
