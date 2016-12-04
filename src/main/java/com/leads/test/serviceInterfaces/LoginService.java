package com.leads.test.serviceInterfaces;

import org.openqa.selenium.WebDriver;

public interface LoginService {

	String checkTitle(WebDriver driver);
	void checkLogin(WebDriver driver);
}
