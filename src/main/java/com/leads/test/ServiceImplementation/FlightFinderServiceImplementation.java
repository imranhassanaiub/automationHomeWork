package com.leads.test.ServiceImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.leads.test.serviceInterfaces.FlightFinderService;
import com.leads.test.utils.XpathLocator;

public class FlightFinderServiceImplementation implements FlightFinderService {

	public void checkFlightFind(WebDriver driver) {
		driver.findElement(By.xpath(XpathLocator.FlightFind.typeRadioButton)).click();
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.passengerdropdown))).selectByVisibleText("1");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.departingfromdropdown)))
				.selectByVisibleText("Paris");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.ondropdownMonth)))
				.selectByVisibleText("November");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.ondropdownday))).selectByVisibleText("20");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.arrivingindropdown)))
				.selectByVisibleText("London");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.returningdropdownMonth)))
				.selectByVisibleText("December");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.returningdropdownDay))).selectByVisibleText("5");
		driver.findElement(By.xpath(XpathLocator.FlightFind.serviceClassRadio)).click();
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.airlinedropdown)))
				.selectByVisibleText("Unified Airlines");
		driver.findElement(By.xpath(XpathLocator.FlightFind.continuebutton)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}