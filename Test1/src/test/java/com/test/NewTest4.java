package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 
{
	@Test
	public void TestPopUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7a.03.26\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginsubmit")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String home=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		Assert.assertEquals(windows.size(), 2);
		
		for(String s:windows)
		{
			System.out.println(s);
			driver.switchTo().window(s);
		
		}
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert al=driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
		}
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("52654993");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().window(home);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('creditcardlogin').click()");
		
		//driver.close();
		//driver.quit();
		
	}
}
