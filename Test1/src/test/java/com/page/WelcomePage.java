package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WelcomePage 
{
	WebDriver driver;
	
	@FindBy(how=How.NAME,using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement Register;
		
	public WelcomePage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	public String clickLogin()
	{
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		login.click();
		return driver.getTitle();
	}
	
	public String register()
	{
		Register.click();
		return driver.getCurrentUrl();
	}
	
}
