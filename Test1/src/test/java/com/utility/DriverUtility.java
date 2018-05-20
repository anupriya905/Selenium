package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility 
{
	public static WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7a.03.26\\Downloads\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
		if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b7a.03.26\\Downloads\\IEDriverServer_x64_3.11.1\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b7a.03.26\\Downloads\\geckodriver-v0.20.1-win64");
			return new FirefoxDriver();
		}
		else
		{
			return null;
		}

	
	}
}
