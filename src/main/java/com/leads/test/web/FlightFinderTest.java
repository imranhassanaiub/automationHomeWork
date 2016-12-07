package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.leads.test.ServiceImplementation.FlightFinderServiceImplementation;
import com.leads.test.serviceInterfaces.FlightFinderService;
import com.leads.test.utils.PageTitle;

import junit.framework.Assert;

public class FlightFinderTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	FlightFinderService flightfinderservice = new FlightFinderServiceImplementation();

	@Test(dependsOnMethods = "checkFlightFind")
	public void checkFlightFinderPageTiltle() {

		Assert.assertEquals(flightfinderservice.checkFlightFinderPageTiltle(driver), PageTitle.flightFinderPagetitle);

	}

	@Test
	public void checkFlightFind()

	{
		flightfinderservice.checkFlightFind(driver);
	}

}
