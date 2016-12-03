package com.leads.test.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leads.test.utils.PageTitle;
import com.leads.test.utils.PageUrl;
import com.leads.test.utils.XpathLocator;

import junit.framework.Assert;

public class LoginTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	@BeforeClass
	public void loadUrl() {
		driver.get(PageUrl.baseUrl);
	}

	@Test
	public void checkTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, PageTitle.loginPageTitle);
	}

	@Test
	public void checkLogin()

	{
		driver.findElement(By.xpath(XpathLocator.Login.username)).sendKeys("demo");
		driver.findElement(By.xpath(XpathLocator.Login.password)).sendKeys("demo");
		driver.findElement(By.xpath(XpathLocator.Login.signin)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

/*		// FlightFinder

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

		// Select Flight

		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectDepart)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.selectReturn)).click();
		driver.findElement(By.xpath(XpathLocator.SelectFlight.continueToBookFlightbutton)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Book A Flight

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
        
 */       
	}

	@AfterClass
	public void closeDriver() {

		// driver.close(); // driver.quit();
	}
}
