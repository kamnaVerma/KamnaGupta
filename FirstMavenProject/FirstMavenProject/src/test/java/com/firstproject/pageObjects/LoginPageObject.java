package com.firstproject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	public WebDriver driver;
	
	public LoginPageObject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername") //using Id locator we are finding username WebElement
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement submit;
	
	//Actions to be performed on the above mentioned WebElements - for each action a method is required
	
	public void setUsername(String txtusername){
		username.sendKeys(txtusername);
	}
	
	public void setPassword(String txtpassword){
		password.sendKeys(txtpassword);
	}
	
	public void clickLogin(){
		submit.click();
	}

}
