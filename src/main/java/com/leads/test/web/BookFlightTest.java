package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.leads.test.ServiceImplementation.BookFlightServiceImplementation;
import com.leads.test.serviceInterfaces.BookFlightService;

public class BookFlightTest {
	WebDriver driver = DriverConfiquration.loadDriver();

	BookFlightService bookflightservice;

	@Test
	public void bookAflight() {
		bookflightservice = new BookFlightServiceImplementation();

		bookflightservice.bookAflight(driver);
	}

	@AfterClass
	public void closeDriver()

	{
		driver.close();

	}
}
