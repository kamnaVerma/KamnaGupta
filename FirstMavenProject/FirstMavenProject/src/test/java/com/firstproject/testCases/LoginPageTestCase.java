package com.firstproject.testCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.firstproject.pageObjects.LoginPageObject;

public class LoginPageTestCase extends BaseClass
{
	@Test
	public void LoginTC() throws IOException 
	{
		LoginPageObject lp = new LoginPageObject(driver);
				
		lp.setUsername(username);
		logger.info("Username Entered");
		lp.setPassword(password);
		logger.info("Password Entered");
		lp.clickLogin();
		
		if (driver.getTitle().equals("OrangeHRM")){
			Assert.assertTrue(true);
			logger.info("Login Test Opened");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
		
	}

}
