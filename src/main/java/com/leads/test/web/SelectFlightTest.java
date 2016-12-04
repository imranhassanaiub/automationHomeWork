package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.leads.test.ServiceImplementation.SelectFlightServiceImplementation;
import com.leads.test.serviceInterfaces.SelectFlightService;

public class SelectFlightTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	SelectFlightService selectflightservice;

	@Test
	public void selectflight() {
		selectflightservice = new SelectFlightServiceImplementation();
		selectflightservice.selectflight(driver);
	}

}
