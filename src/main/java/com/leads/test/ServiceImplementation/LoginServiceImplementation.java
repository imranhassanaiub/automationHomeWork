package com.leads.test.ServiceImplementation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.leads.test.model.Login;
import com.leads.test.repoImpl.LoginRepoImpl;
import com.leads.test.repoInterface.LoginRepo;
import com.leads.test.serviceInterfaces.LoginService;
import com.leads.test.utils.XpathLocator;

public class LoginServiceImplementation implements LoginService {

	LoginRepo<Login> loginrepo=new LoginRepoImpl();
	
	public String checkTitle(WebDriver driver) {

		System.out.println("Login Page Title Verified!!");
		return driver.getTitle();

	}

	public void checkLogin(WebDriver driver) {

		Login login =null;
		try{
		login=loginrepo.get();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(XpathLocator.Login.username)).sendKeys(login.getUsername());
		driver.findElement(By.xpath(XpathLocator.Login.password)).sendKeys(login.getPassword());
		driver.findElement(By.xpath(XpathLocator.Login.signin)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
