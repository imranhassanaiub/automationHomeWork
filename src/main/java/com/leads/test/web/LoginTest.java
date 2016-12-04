package com.leads.test.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

	}

}
