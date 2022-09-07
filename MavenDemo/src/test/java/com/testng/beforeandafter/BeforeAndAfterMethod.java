package com.testng.beforeandafter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	public WebDriver driver;

	@BeforeMethod
	public void launchingTheApplication() {
		
		System.out.println("Application is launched");
		
		String url = "https://nxtgenaiacademy.com/";

		// Set the system property for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Chrome driver
		driver = new ChromeDriver();

		// launch the url 
		driver.get(url);

		// maximize the application
		driver.manage().window().maximize();
		System.out.println("Application launched successfully");
	}
	
	@AfterMethod
	public void closingTheApplication() {
		driver.close();
	  System.out.println("Application is Closed");
	}

	@Test(priority = 1)
	public void navigateToRegistrationForm() {
		
		System.out.println("Navigate To Registration Form");

		Actions action = new Actions(driver);

		// Performing mouseHover over the QA AUTOMATION.

		// Creating the WebElement object.
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		// Validation of navigation. 

		System.out.println("QA AUTOMATION is displayed");

		action.moveToElement(qaAutomation).perform();

		// Hover over the Practice Automation.

		WebElement practiceAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a/span"));

		System.out.println("Practice Automation is displayed");

		action.moveToElement(practiceAutomation).perform();

		WebElement ragistrationForm = driver.findElement(By.xpath("//*[@id=\"menu-item-4134\"]/a"));

		// Click on the Demo Site – Registration Form.

		ragistrationForm.click();


	}
	
	@Test(priority = 2)
	public void navigateToAlertAndPopup() {
		
		System.out.println("Navigate To Alert And Popup");

		Actions action = new Actions(driver);

		// Performing mouseHover over the QA AUTOMATION.

		// Creating the WebElement object.
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		// Validation of navigation. 

		System.out.println("QA AUTOMATION is displayed");

		action.moveToElement(qaAutomation).perform();

		// Hover over the Practice Automation.

		WebElement practiceAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a/span"));

		System.out.println("Practice Automation is displayed");

		action.moveToElement(practiceAutomation).perform();

		WebElement alertAndPopup = driver.findElement(By.xpath("//*[@id='menu-item-4132']/a"));

		// Click on the Demo Site – Alert and Popup.

		alertAndPopup.click();


	}
	
	@Test(priority = 3)
	public void navigateToMultipleWindow() {
		
		System.out.println("Navigate To Multiple Window");

		Actions action = new Actions(driver);

		// Performing mouseHover over the QA AUTOMATION.

		// Creating the WebElement object.
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		// Validation of navigation. 

		System.out.println("QA AUTOMATION is displayed");

		action.moveToElement(qaAutomation).perform();

		// Hover over the Practice Automation.

		WebElement practiceAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a/span"));

		System.out.println("Practice Automation is displayed");

		action.moveToElement(practiceAutomation).perform();

		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id='menu-item-4133']/a"));

		// Click on the Demo Site – Multiple Windows.

		multipleWindow.click();


	}
	
	@Test(priority = 4)
	public void navigateToWebTable() {
		
		System.out.println("Navigate To WebTable");

		Actions action = new Actions(driver);

		// Performing mouseHover over the QA AUTOMATION.

		// Creating the WebElement object.
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		// Validation of navigation. 

		System.out.println("QA AUTOMATION is displayed");

		action.moveToElement(qaAutomation).perform();

		// Hover over the Practice Automation.

		WebElement practiceAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a/span"));

		System.out.println("Practice Automation is displayed");

		action.moveToElement(practiceAutomation).perform();

		WebElement webTable = driver.findElement(By.xpath("//*[@id='menu-item-4135']/a"));

		// Click on the Demo Site – WebTable.

		webTable.click();


	}

}
