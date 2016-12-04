package com.leads.test.ServiceImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.leads.test.serviceInterfaces.BookFlightService;
import com.leads.test.utils.XpathLocator;

public class BookFlightServiceImplementation implements BookFlightService {

	public void bookAflight(WebDriver driver) {
		driver.findElement(By.xpath(XpathLocator.BookFlight.fname)).sendKeys("Imran");
		driver.findElement(By.xpath(XpathLocator.BookFlight.lname)).sendKeys("Hassan");
		new Select(driver.findElement(By.xpath(XpathLocator.BookFlight.mealprefdropdown)))
				.selectByVisibleText("Muslim");
		new Select(driver.findElement(By.xpath(XpathLocator.BookFlight.cardtypeDropdown))).selectByVisibleText("Visa");
		driver.findElement(By.xpath(XpathLocator.BookFlight.cardnumber)).sendKeys("123456789");
		new Select(driver.findElement(By.xpath(XpathLocator.BookFlight.cardExpirationDropdownMonth)))
				.selectByVisibleText("12");
		new Select(driver.findElement(By.xpath(XpathLocator.BookFlight.cardExpirationDropdownYear)))
				.selectByVisibleText("2010");
		driver.findElement(By.xpath(XpathLocator.BookFlight.cardFname)).sendKeys("Imran");
		driver.findElement(By.xpath(XpathLocator.BookFlight.cardMname)).sendKeys("Mimo");
		driver.findElement(By.xpath(XpathLocator.BookFlight.cardLname)).sendKeys("Hassan");
		driver.findElement(By.xpath(XpathLocator.BookFlight.billingAddress)).click();
		driver.findElement(By.xpath(XpathLocator.BookFlight.deliveryAddress)).click();
		driver.findElement(By.xpath(XpathLocator.BookFlight.securePurchase)).click();

	}

}
