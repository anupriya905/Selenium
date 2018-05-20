package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register 
{
	WebDriver driver;
	
	@FindBy(how=How.ID,using="email")
	WebElement Email;
	
	@FindBy(how=How.NAME,using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(how=How.NAME,using="register")
	WebElement Register;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement SignOff;
	
	public Register(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	public void clickUserInfo()
	{
		Email.sendKeys("anupriya905@gmail.com");
		Password.sendKeys("anupriya");
		ConfirmPassword.sendKeys("anupriya");
		Register.click();
	}
	
	public void SignOff()
	{
		SignOff.click();
	}
}
