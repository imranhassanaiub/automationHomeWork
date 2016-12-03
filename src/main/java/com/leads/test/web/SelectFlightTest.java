package com.leads.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leads.test.utils.XpathLocator;

public class SelectFlightTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	@BeforeClass
	public void loadUrl() {

	}

	@Test
	public void selectflight() {
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectDepart)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectReturn)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.continueToBookFlightbutton)).click();
	}

	@AfterClass
	public void closeDriver()

	{
		driver.close();
		// driver.quit();
	}
}
