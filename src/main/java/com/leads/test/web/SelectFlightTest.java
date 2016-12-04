package com.leads.test.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.leads.test.utils.XpathLocator;

public class SelectFlightTest {

	WebDriver driver = DriverConfiquration.loadDriver();


	@Test
	public void selectflight() {
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectDepart)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectReturn)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.continueToBookFlightbutton)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
}
