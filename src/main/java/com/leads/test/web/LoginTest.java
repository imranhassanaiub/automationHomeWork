package com.leads.test.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leads.test.utils.PageTitle;
import com.leads.test.utils.PageUrl;
import com.leads.test.utils.XpathLocator;

import junit.framework.Assert;

public class LoginTest {

	WebDriver driver;

	@BeforeClass
	public void loadUrl() {
		System.setProperty("webdriver.gecko.driver", "E://geckodriver-v0.11.1-win64/wires.exe");
		driver = new FirefoxDriver();
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

		/*
		driver.findElement(By.xpath(XpathLocator.FlightFind.typeRadioButton)).click();
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.passengerdropdown))).selectByVisibleText("2");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.departingfromdropdown))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.ondropdownMonth))).selectByVisibleText("November");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.ondropdownday))).selectByVisibleText("20");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.arrivingindropdown))).selectByVisibleText("London");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.returningdropdownMonth))).selectByVisibleText("December");
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.returningdropdownDay))).selectByVisibleText("5");
		driver.findElement(By.xpath(XpathLocator.FlightFind.serviceClassRadio)).click();
		new Select(driver.findElement(By.xpath(XpathLocator.FlightFind.airlinedropdown))).selectByVisibleText("Unified Airlines");
		driver.findElement(By.xpath(XpathLocator.FlightFind.continuebutton)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
	}
	/*
	 * @AfterClass public void closeDriver()
	 * 
	 * { driver.close(); // driver.quit(); }
	 */
}
