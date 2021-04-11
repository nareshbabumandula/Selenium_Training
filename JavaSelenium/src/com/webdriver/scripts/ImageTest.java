package com.webdriver.scripts;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ImageTest{

	WebDriver driver;

	@Test
	public void ImageMethods() {
		// Access the website
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement image = driver.findElement(By.className("test_img"));
		System.out.println(image.isDisplayed());
		System.out.println(image.isEnabled());
		System.out.println(image.getAttribute("src"));
		System.out.println(image.getAttribute("alt"));
		System.out.println(image.getAttribute("class"));
		System.out.println(image.getTagName());
		
		image.click();
		
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
