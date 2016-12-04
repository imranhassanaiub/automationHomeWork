package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.leads.test.ServiceImplementation.FlightFinderServiceImplementation;
import com.leads.test.serviceInterfaces.FlightFinderService;

public class FlightFinderTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	FlightFinderService flightfinderservice;

	@Test
	public void checkFlightFind()

	{
		flightfinderservice = new FlightFinderServiceImplementation();
		flightfinderservice.checkFlightFind(driver);
	}

}
