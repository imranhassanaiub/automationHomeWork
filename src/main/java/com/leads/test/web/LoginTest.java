package com.leads.test.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leads.test.ServiceImplementation.LoginServiceImplementation;
import com.leads.test.serviceInterfaces.LoginService;
import com.leads.test.utils.PageTitle;
import com.leads.test.utils.PageUrl;

import junit.framework.Assert;

public class LoginTest {

	WebDriver driver = DriverConfiquration.loadDriver();

	LoginService loginservice = new LoginServiceImplementation();

	@BeforeClass
	public void loadUrl() {
		loginservice = new LoginServiceImplementation();
		driver.get(PageUrl.baseUrl);
	}

	@Test
	public void checkTitle() {

		Assert.assertEquals(loginservice.checkTitle(driver), PageTitle.loginPageTitle);
	}

	@Test
	public void checkLogin()
	{
		
		loginservice.checkLogin(driver);

	}

}
