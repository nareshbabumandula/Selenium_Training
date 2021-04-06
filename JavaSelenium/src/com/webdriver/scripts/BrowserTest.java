package com.webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BrowserTest{
	
	WebDriver driver;
	
	@Test
	public void BrowserMethods() {
		// Access the website
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		String strTitle = driver.getTitle(); // Browser title
		System.out.println("Browser title is : " + strTitle);
		System.out.println("URL is : " + driver.getCurrentUrl()); // Get URL
		Reporter.log("Browser title is : " + strTitle);
		Reporter.log("<p></p>");
		Reporter.log("URL is : " + driver.getCurrentUrl());
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\GitHub\\Selenium_Training\\JavaSelenium\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser
	}

}
