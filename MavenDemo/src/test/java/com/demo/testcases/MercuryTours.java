package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTours {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	@Test(priority = 0)
	public void signIn()
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("Kumar");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		System.out.println("All issues fixed!");
	}
}
