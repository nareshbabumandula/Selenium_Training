package com.webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BrowserTest{
	
	WebDriver driver;
	
	@Test
	public void BrowserMethods() throws AWTException, InterruptedException {
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
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		driver.navigate().back(); // browser backward operation
		driver.navigate().forward(); // browser forward operation
		driver.navigate().refresh(); // Refresh the browser
		String SessionID = driver.getWindowHandle();
		System.out.println("Browser session ID is : " + SessionID);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Features")).sendKeys(selectLinkOpeninNewTab);
		Set<String> SessionIDs = driver.getWindowHandles();
		System.out.println("Browser session ID's are : " + SessionIDs);
		// Using Lambda to iterate through set collection elements
		SessionIDs.forEach((session)->{System.out.println(session);});
		
		// Switch to different window
		Iterator<String> iter = SessionIDs.iterator();
		while(iter.hasNext()) {
			String childwindow = iter.next(); // get each session ID
			if (!childwindow.equals(SessionID)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				driver.findElement(By.linkText("Sample")).click();
				Thread.sleep(2000);
			}
			
			// switch to parent window
			driver.switchTo().window(SessionID);
			driver.findElement(By.id("subject")).sendKeys("Test Subject");
			
		}
		
		System.out.println(driver.getPageSource()); // Entire html code of the page will be printed
		

	}
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close(); // Closed the active tab only
		driver.quit(); // Terminate the browser with the tabs
		
	}

}
