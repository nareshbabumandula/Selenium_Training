package com.webdriver.scripts;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JavaScriptExecutorTest{

	WebDriver driver;

	@Test
	public void JavaScriptExecutorMethods() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Navigate to new Page i.e to generate access page. (launch new url)
		jse.executeScript("window.location = 'https://www.mycontactform.com/'"); 

		//Fetching the Domain Name of the site. Tostring() change object to name.		
		String DomainName = jse.executeScript("return document.domain;").toString();			
		System.out.println("Domain name of the site = "+DomainName);	

		//Fetching the URL of the site. Tostring() change object to name		
		String url = jse.executeScript("return document.URL;").toString();			
		System.out.println("URL of the site = "+url);

		// Refresh the browser window
		jse.executeScript("history.go(0)");

		// Enter data in textbox using DOM method
		jse.executeScript("document.getElementById('user').value='Anjali'");

		jse.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(By.linkText("Sample Forms"))); 
		jse.executeScript("arguments[0].style.background='yellow'", driver.findElement(By.linkText("Sample Forms")));  
		Thread.sleep(2000);

		// Click on Sample Forms link using JavaScriptExecutor click method - arguments[0].click();
		jse.executeScript("arguments[0].click();", driver.findElement(By.linkText("Sample Forms")));

		//Vertical scroll down by 1000  pixels		
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		// This will scroll up the page by 1000 pixel vertical	
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		//This will scroll the page till the element is found		
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("q5")));
		Thread.sleep(3000);

		//This will scroll the web page till end.		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//This will scroll the page Horizontally till the element is found		
		//jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("q6"));
		
		System.out.println(jse.executeScript("return window.innerHeight;"));
		System.out.println(jse.executeScript("return window.innerWidth;"));
			
		//Get InnerText of a Webpage
		String sText =  jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
		Thread.sleep(2000);
		jse.executeScript("alert('Hello world');");


	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // Terminate the browser with the tabs

	}

}
