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

public class TextboxTest{

	WebDriver driver;

	@Test
	public void TextboxMethods() {
		// Access the website
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement USERNAME = driver.findElement(By.id("user"));
		System.out.println(USERNAME.isDisplayed());
		System.out.println(USERNAME.isEnabled());
		System.out.println(USERNAME.getAttribute("name"));
		System.out.println(USERNAME.getAttribute("type"));
		System.out.println(USERNAME.getAttribute("class"));
		System.out.println(USERNAME.getAttribute("id"));
		System.out.println(USERNAME.getAttribute("tabindex"));
		System.out.println(USERNAME.getTagName());
		USERNAME.sendKeys("Anjali");
		String actValue = USERNAME.getAttribute("value");
		Assert.assertEquals(actValue, "Anjali");
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
