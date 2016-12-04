package com.leads.test.ServiceImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.leads.test.serviceInterfaces.LoginService;
import com.leads.test.utils.XpathLocator;

public class LoginServiceImplementation implements LoginService {

	public String checkTitle(WebDriver driver) {

		return driver.getTitle();

	}

	public void checkLogin(WebDriver driver) {

		driver.findElement(By.xpath(XpathLocator.Login.username)).sendKeys("demo");
		driver.findElement(By.xpath(XpathLocator.Login.password)).sendKeys("demo");
		driver.findElement(By.xpath(XpathLocator.Login.signin)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
