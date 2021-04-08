package com.application.locators;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LocatorsTest{

	WebDriver driver;

	@Test
	public void seleniumLocators() throws InterruptedException {
		// Access the website
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Locating username field based on ID locator
		driver.findElement(By.id("user")).sendKeys("naresh");
		Thread.sleep(2000);
		driver.findElement(By.id("user")).clear();

		// Locating username field based on name locator
		driver.findElement(By.name("user")).sendKeys("Anjali");
		Thread.sleep(2000);
		driver.findElement(By.name("user")).clear();

		// Locating username field based on className locator
		driver.findElement(By.className("txt_log")).sendKeys("Nishanth");
		Thread.sleep(2000);
		driver.findElement(By.className("txt_log")).clear();

		// Locating username field based on CSS Selector locator
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Ravi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();

		// CSS Selector starts-with wildcard
		driver.findElement(By.cssSelector("input[id^='use']")).sendKeys("Kiran");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='use']")).clear();

		// CSS Selector ends-with wildcard
		driver.findElement(By.cssSelector("input[id$='ser']")).sendKeys("Swetha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='ser']")).clear();

		// CSS Selector contains wildcard
		driver.findElement(By.cssSelector("input[id*='ser']")).sendKeys("Mahitha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='ser']")).clear();

		// CSS # as a replacement for ID
		driver.findElement(By.cssSelector("input#user")).sendKeys("Alex");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user")).clear();

		// CSS using . as a replacement for Class name
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Tim");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.txt_log")).clear();


		//driver.findElement(By.cssSelector("html>body>div:nth-of-type(4)>div:nth-of-type(2)>div>form>fieldset>div>input")).sendKeys("Sandeep");
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("html>body>div:nth-of-type(4)>div:nth-of-type(2)>div>form>fieldset>div>input")).clear();

		driver.findElement(By.cssSelector("div>form>fieldset>div>input")).sendKeys("Sandeep");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div>form>fieldset>div>input")).clear();

		// Absolute XPath
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("Gunjan");
		//Thread.sleep(2000); 
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/form/fieldset/div[1]/input")).clear();


		// Relative XPath
		driver.findElement(By.xpath("//fieldset/div/input")).sendKeys("Madhu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//fieldset/div/input")).clear();

		// XPath with Attributes
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("Ruken");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='user']")).clear();

		// XPath to traverse in a reverse direction... Indentify password based on username field
		driver.findElement(By.xpath("//input[@id='user']/../../div[2]/input")).sendKeys("Teja");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']/../../div[2]/input")).clear();

		// XPath with following function
		driver.findElement(By.xpath("//input[@id='user']/following::input")).sendKeys("Pavan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']/following::input")).clear();

		// XPath with preceding function
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input")).sendKeys("Vijay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input")).clear();

	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser with the tabs

	}

}
