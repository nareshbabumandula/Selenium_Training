package com.webdriver.scripts;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ActionsTest{

	WebDriver driver;

	@Test
	public void actionsMethods() throws InterruptedException {
		
		Actions menu = new Actions(driver);
		WebElement addons = driver.findElement(By.linkText("ADD-ONS"));
		menu.moveToElement(addons).perform(); // Hover the mouse on ADD-ONS tab
		driver.findElement(By.linkText("Travel Insurance")).click();
		//menu.contextClick(driver.findElement(By.linkText("Product Description"))).perform();
		WebElement International = driver.findElement(By.linkText("International"));
		Thread.sleep(2000);
		menu.moveToElement(International).build();
		menu.contextClick(International).build().perform();
	
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); 
	}

}
