package com.webdriver.scripts;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListboxTest{

	WebDriver driver;

	@Test
	public void ListboxMethods() throws InterruptedException {
		// Access the website
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement canadianprovinces = driver.findElement(By.id("q10"));
		Select select = new Select(canadianprovinces);
		
		select.selectByIndex(1); // Selects the second value from the dropdown
		Thread.sleep(2000);
		select.selectByVisibleText("Ontario"); // Select the value based on text of a dropdown list item
		//System.out.println(select.getAllSelectedOptions());
		System.out.println(select.getOptions().get(0).getText());
		
		List<WebElement> states = canadianprovinces.findElements(By.tagName("option"));
		states.forEach((state)->{System.out.println(state.getText());});
		int noofStates = select.getOptions().size();
		System.out.println("No of canadian provinces are  : " + noofStates);
		
		System.out.println("Iterating the collection using for each loop");
		for (WebElement state : states) {
			System.out.println(state.getText());
		}
		System.out.println("Iterating the collection using for loop");
		for (int i = 0; i < states.size(); i++) {
			System.out.println(states.get(i).getText());
		}
		System.out.println("Iterating the collection using iterator");
		for (Iterator iterator = states.iterator(); iterator.hasNext();) {
			WebElement state = (WebElement) iterator.next();
			System.out.println(state.getText());
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
