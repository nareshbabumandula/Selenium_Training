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

public class CheckboxTest{

	WebDriver driver;

	@Test
	public void checkboxMethods() {
		// Access the website
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement MarketingDept = driver.findElement(By.name("email_to[]"));
		System.out.println(MarketingDept.isDisplayed());
		System.out.println(MarketingDept.isEnabled());
		System.out.println("Before selecting the Marketing Department checkbox the selection status is : "+ MarketingDept.isSelected());
		System.out.println(MarketingDept.getAttribute("type"));
		System.out.println(MarketingDept.getAttribute("name"));
		System.out.println(MarketingDept.getAttribute("value"));
		System.out.println(MarketingDept.getTagName());
		System.out.println(MarketingDept.getText());
		MarketingDept.click();
		System.out.println("After selecting the Marketing Department checkbox the selection status is : "+ MarketingDept.isSelected());
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		checkboxes.forEach((n)->{System.out.println(n.getAttribute("name"));});
		//checkboxes.forEach((n)->{n.click();});
		
		/*
		 * for (Iterator iterator = checkboxes.iterator(); iterator.hasNext();) {
		 * WebElement webElement = (WebElement) iterator.next(); webElement.click(); }
		 */
		
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
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
