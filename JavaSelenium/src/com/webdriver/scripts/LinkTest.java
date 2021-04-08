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

public class LinkTest{

	WebDriver driver;

	@Test
	public void linkMethods() {
		
		//WebElement Testimonials = driver.findElement(By.linkText(">> More Testimonials"));
		WebElement Testimonials = driver.findElement(By.partialLinkText("Testimonials"));
		System.out.println(Testimonials.isDisplayed());
		System.out.println(Testimonials.isEnabled());
		System.out.println(Testimonials.getTagName());
		System.out.println(Testimonials.getAttribute("href"));
		System.out.println(Testimonials.getText());
		Testimonials.click();
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); 
	}

}
