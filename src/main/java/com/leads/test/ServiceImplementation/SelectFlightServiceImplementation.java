package com.leads.test.ServiceImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.leads.test.serviceInterfaces.SelectFlightService;
import com.leads.test.utils.XpathLocator;

public class SelectFlightServiceImplementation implements SelectFlightService {

	public void selectflight(WebDriver driver) {

		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectDepart)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectReturn)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.continueToBookFlightbutton)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
