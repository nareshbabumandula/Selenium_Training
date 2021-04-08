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

public class ButtonTest{

	WebDriver driver;

	@Test
	public void buttonMethods() {
		
		WebElement login = driver.findElement(By.name("btnSubmit"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println(login.getTagName());
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getAttribute("name"));
		System.out.println(login.getAttribute("value"));
		System.out.println(login.getAttribute("class"));
		System.out.println(login.getAttribute("tabindex"));
		login.click();
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
