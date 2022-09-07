package com.testng.traning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemoAssignment {

	public WebDriver driver;

	String enterFirstNameValue =  "Hammad";
	String enterLastNameValue =  "Siddiqui";
	String streetAddressValue = "Chowk";
	String detailAddressValue = "Campwell road";
	String cityAddressValue = "Lucknow";
	String stateAddressValue = "Uttar Pradesh";
	String pinCodeValue = "226003";
	String countryValue = "India";
	String enterEmailAddressValue = "mohdhammad74@gmail.com";
	String currentDateValue = "08/01/2022";
	String hourValue = "20";
	String minValue = "50";
	String mobileNumberValue = "8874789998";
	String enterQueryValue = "query is entered.";
	String regPageHeadTitleValue = "Register For Demo";
	String actualSuccessfullTextMsgValue = "Registration Form is Successfully Submitted.";

	String url = "https://nxtgenaiacademy.com/";

	@Test(priority = 1)
	public void launchingTheApplication() {

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

	@Test(priority = 2)
	public void navigateToRegistrationForm() {

		Actions action = new Actions(driver);

		// Performing mouseHover over the QA AUTOMATION.

		// Creating the WebElement object.
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));

		// Validation of navigation. 

		if(qaAutomation.isDisplayed()) {

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
		else {
			System.out.println("QA AUTOMATION is not displayed");
		}

		System.out.println("The Application is navigated successfully");

	}

	@Test(priority = 3)
	public void registerUser() {

		// Validating the Registration For Demo is displayed.

		WebElement headTitle = driver.findElement(By.xpath("//*[@id='item-vfb-1']/div/h3"));

		if(headTitle.isDisplayed()) {
			System.out.println("Register For Demo is displayed");
		}
		else
		{
			System.out.println("Register For Demo is not displayed");
		}

		// Validating of registration form head title.

		String actualPresentHeadTitle = headTitle.getText();
		String exceptedPresentHeadTitle = regPageHeadTitleValue;

		if(actualPresentHeadTitle.equals(exceptedPresentHeadTitle)) {
			System.out.println("Title is matched");
			System.out.println("The matched title is : " + actualPresentHeadTitle);
		}
		else
		{
			System.out.println("Title is not matched");
			System.out.println("Actual title : " + actualPresentHeadTitle);
			System.out.println("Excepted title : " + regPageHeadTitleValue);
		}

		// Validating first name.

		WebElement firstName = driver.findElement(By.id("vfb-5"));

		if(firstName.isEnabled()) {
			System.out.println("First Name is enabled");

			firstName.sendKeys(enterFirstNameValue);
			System.out.println("First Name is " + enterFirstNameValue);
		}
		else
		{
			System.out.println("Sorry First Name is not enabled");
		}

		// Verifying the lastName 

		WebElement lastName = driver.findElement(By.id("vfb-7"));

		if(lastName.isEnabled()) {
			System.out.println("Last Name is enabled");

			lastName.sendKeys(enterLastNameValue);
			System.out.println("Last Name is " + enterLastNameValue);
		}
		else
		{
			System.out.println("Sorry Last Name is not enabled");
		}

		// Validating gender.

		WebElement radioMaleBtn = driver.findElement(By.id("vfb-8-1"));


		if(radioMaleBtn.isEnabled()) {
			System.out.println("Male Radio Button is enabled");
			radioMaleBtn.click();
		}
		else
		{
			System.out.println("Male Radio Button is not enabled");

		}

		if(radioMaleBtn.isSelected()) {
			System.out.println("Male Radio Button is selected");
		}
		else
		{
			System.out.println("Male Radio Button is not selected");

		}

		//Validating address.

		// Verifying line1 of address.

		WebElement address = driver.findElement(By.id("vfb-13-address"));

		if(address.isEnabled()) {
			System.out.println("Address line1 is enabled");

			address.sendKeys(streetAddressValue);
			System.out.println("Street : " + streetAddressValue);
		}
		else
		{
			System.out.println("Address line1 is not enabled");
		}

		// Verifying line2 of address.

		WebElement moreAddress = driver.findElement(By.id("vfb-13-address-2"));

		if(moreAddress.isEnabled()) {
			System.out.println("Address line2 is enabled");

			moreAddress.sendKeys(detailAddressValue);
			System.out.println("Details : " + detailAddressValue);
		}
		else
		{
			System.out.println("Address line2 is not enabled");
		}	
		// Verifying city name of a address.

		WebElement cityName = driver.findElement(By.id("vfb-13-city"));

		if(cityName.isEnabled()) {
			System.out.println("Address line3 is enabled");

			cityName.sendKeys(cityAddressValue);
			System.out.println("City : " + cityAddressValue);
		}
		else
		{
			System.out.println("Address line3 is not enabled");
		}

		// Verifying state name of address.

		WebElement stateName = driver.findElement(By.id("vfb-13-state"));

		if(stateName.isEnabled()) {
			System.out.println("Address line4 is enabled");

			stateName.sendKeys(stateAddressValue);
			System.out.println("State : " + stateAddressValue);
		}
		else
		{
			System.out.println("Address line4 is not enabled");
		}

		// Verifying pin/postal code of address.

		WebElement postalCode = driver.findElement(By.id("vfb-13-zip"));

		if(postalCode.isEnabled()) {
			System.out.println("Address line5 is enabled");

			postalCode.sendKeys(pinCodeValue);
			System.out.println("Pin/Postal code : " + pinCodeValue);
		}
		else
		{
			System.out.println("Address line5 is not enabled");
		}

		// Validating Drop down menu.

		WebElement dropDownCountryName = driver.findElement(By.xpath("//*[@id=\"vfb-13-country\"]"));

		if(dropDownCountryName.isEnabled()) {
			System.out.println("Country drop down is enabled");

			Select countryName = new Select(dropDownCountryName);

			// Selecting using ByValue.

			countryName.selectByValue(countryValue);

			System.out.println("Country : " + countryValue);
		}
		else
		{
			System.out.println("Country drop down is not enabled");
		} 

		// Validating email.

		WebElement emailAddress = driver.findElement(By.id("vfb-14"));

		if(emailAddress.isEnabled()) {
			System.out.println("Email is enabled");

			emailAddress.sendKeys(enterEmailAddressValue);
			System.out.println("Email : " + enterEmailAddressValue);
		}
		else
		{
			System.out.println("Email is not enabled");
		}

		//Validating date.

		WebElement date = driver.findElement(By.id("vfb-18"));

		if(date.isEnabled()) {
			System.out.println("Date is enabled");

			date.sendKeys(currentDateValue);
			System.out.println("Date : " + currentDateValue);
		}
		else
		{
			System.out.println("Date is not enabled");
		}

		// Validating time.

		WebElement timeHours = driver.findElement(By.id("vfb-16-hour"));

		if(timeHours.isEnabled()) {
			System.out.println("Convenient Time HH is enabled");

			Select hour = new Select(timeHours);

			// Selecting using ByValue.
			hour.selectByValue(hourValue);
		}
		else {
			System.out.println("Convenient Time HH is not enabled");
		}

		WebElement timeMin = driver.findElement(By.id("vfb-16-min"));

		if(timeMin.isEnabled()) {
			System.out.println("Convenient Time MM is enabled");

			Select min = new Select(timeMin);

			// Selecting using ByValue.
			min.selectByValue(minValue);
		}
		else {
			System.out.println("Convenient Time MM is not enabled");
		}

		// Validating Mobile Number.
		WebElement mobNum = driver.findElement(By.id("vfb-19"));

		if(mobNum.isEnabled()) {
			System.out.println("Mobile Number is enabled");

			mobNum.sendKeys(mobileNumberValue);
			System.out.println("Mobile Number : " + mobileNumberValue);
		}
		else
		{
			System.out.println("Mobile Number is not enabled");
		}

		// Validating course.

		// Validating UFT checkBox.

		WebElement courseUft = driver.findElement(By.id("vfb-20-1"));

		// Checking UFT checkbox is enabled or not.

		if(courseUft.isEnabled()) {
			System.out.println("UFT is enabled");
			courseUft.click();
		}
		else
		{
			System.out.println("UFT is not enabled");

		}

		// Selecting UFT checkBox.

		if(courseUft.isSelected()) {
			System.out.println("UFT is selected");
		}
		else
		{
			System.out.println("UFT is not selected");
		}

		// Validating TestNG checkBox.

		WebElement courseTestNg = driver.findElement(By.id("vfb-20-2"));

		// Checking TestNG checkbox is enabled or not.

		if(courseTestNg.isEnabled()) {
			System.out.println("TestNG is enabled");
			courseTestNg.click();
		}
		else
		{
			System.out.println("TestNG is not enabled");

		}

		// Selecting TestNG checkBox.

		if(courseTestNg.isSelected()) {
			System.out.println("TestNG is selected");
		}
		else
		{
			System.out.println("TestNG is not selected");
		}

		// Validating query
		WebElement query = driver.findElement(By.id("vfb-23"));

		if(query.isEnabled()) {
			System.out.println("Enter your query is enabled");

			query.sendKeys(enterQueryValue);
			System.out.println("Your query : " + enterQueryValue);
		}
		else
		{
			System.out.println("Enter your query is not enabled");
		}

		// Verification 

		WebElement twoDigit = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));

		// Validating the value.

		if(twoDigit.isDisplayed()) {

			System.out.println("Example number is displayed");

		}
		else {

			System.out.println("Example number is not displayed");
		}

		String verifyEnteredValue = twoDigit.getText();
		String exampleValue = verifyEnteredValue.split(":")[1].trim();

		// Enter the verified value.

		WebElement enterTwoDigit = driver.findElement(By.id("vfb-3"));

		if(enterTwoDigit.isEnabled()) {
			System.out.println("Please enter two digits as displayed in Example is enabled");

			enterTwoDigit.sendKeys(exampleValue);
			System.out.println("Example : " + exampleValue);
		}
		else
		{
			System.out.println("Please enter two digits as displayed in Example is not enabled");
		}

		// Click on the Submit button.

		WebElement submitBtn = driver.findElement(By.id("vfb-4"));

		if(submitBtn.isEnabled()) {
			System.out.println("The submit button is enabled");
			submitBtn.click();
			System.out.println("Submit button is clicked");
		}
		else {
			System.out.println("The submit button is not enabled");
		}

		System.out.println("The user is successfully registered");

	}

	@Test(priority = 4)
	public void validateSuccessfulMessage() {

		// Validating the success message is it displayed or not.

		WebElement transactionId = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/div"));

		String realSuccessfullTextMsg = transactionId.getText();
		String exceptedSuccessfullTextMsg = actualSuccessfullTextMsgValue;

		if(realSuccessfullTextMsg.contains(exceptedSuccessfullTextMsg)) {

			// The successful registered message.

			String successMsg = transactionId.getText();
			String showSuccessMsg =successMsg.split(":")[1].trim();
			System.out.println(exceptedSuccessfullTextMsg + "The Transaction ID : " + showSuccessMsg);

		}
		else
		{
			// The unsuccessful registered message.
			System.out.println("The user has registeration is not successfull !!!");
			System.out.println("Actul successfull message" + realSuccessfullTextMsg);
			System.out.println("Excepted successfull message" + exceptedSuccessfullTextMsg);
		}

		System.out.println("The successful registered message is validated.");

	}

	@Test(priority = 5)
	public void closingTheApplication() {

		// Closing the application.

		System.out.println("Application is closed!!!!");
		driver.close();

		System.out.println("The Application is successfuly closed .");

	}


}
