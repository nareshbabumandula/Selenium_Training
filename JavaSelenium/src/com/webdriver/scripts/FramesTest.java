package com.webdriver.scripts;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FramesTest{

	WebDriver driver;

	@Test
	public void frameMethods() {
		driver.findElement(By.linkText("Autocomplete")).click();
		//driver.switchTo().frame(0); // Switch to frame based on frame index 0
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // Switch to iframe based on frame webeelement
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		driver.switchTo().defaultContent(); // Switch out from the iframe
		driver.findElement(By.linkText("Draggable")).click();
		
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); 
	}

}
