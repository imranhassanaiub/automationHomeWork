package com.leads.test.ServiceImplementation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.leads.test.model.FlightFinder;
import com.leads.test.repoImpl.FlightFinderRepoImpl;
import com.leads.test.repoInterface.FlightFinderRepo;
import com.leads.test.serviceInterfaces.FlightFinderService;
import com.leads.test.utils.XpathLocator;

public class FlightFinderServiceImplementation implements FlightFinderService {

	FlightFinderRepo<FlightFinder> flightfinderrepo = new FlightFinderRepoImpl();

	public String checkFlightFinderPageTiltle(WebDriver driver) {
		System.out.println("Flight Finder Page Title Verified!!");
		return driver.getTitle();
	}

	public void checkFlightFind(WebDriver driver) {

		FlightFinder flightfinder = null;
		try {
			flightfinder = flightfinderrepo.get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath(XpathLocator.FlightFind.typeRadioButton)).click();
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.passengerdropdown)))
				.selectByVisibleText(flightfinder.getPassengerdropdown());
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.departingfromdropdown)))
				.selectByVisibleText(flightfinder.getDepartingfromdropdown());
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
