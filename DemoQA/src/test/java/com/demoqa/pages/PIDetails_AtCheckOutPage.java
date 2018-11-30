package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIDetails_AtCheckOutPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@title='billingemail']")
	WebElement emailElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billingfirstname']")
	WebElement firstNameElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billinglastname']")
	WebElement lastNameElement;

	@FindBy(how = How.XPATH, using = "//textarea[@title='billingaddress']")
	WebElement addressElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billingcity']")
	WebElement cityElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billingstate']")
	WebElement stateElement;

	@FindBy(how = How.XPATH, using = "//select[@title='billingcountry']")
	WebElement countryElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billingpostcode']")
	WebElement postCodeElement;

	@FindBy(how = How.XPATH, using = "//input[@title='billingphone']")
	WebElement phoneElement;

	@FindBy(how = How.XPATH, using = "//input[@name='shippingSameBilling']")
	WebElement sameAddressElement;

	@FindBy(how = How.XPATH, using = "//input[@name='submit' and @value='Purchase']")
	WebElement purchaseElement;

	public PIDetails_AtCheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String email) {
		emailElement.sendKeys(email);
	}

	public void setFirstName(String firstName) {
		firstNameElement.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		lastNameElement.sendKeys(lastName);
	}

	public void setAddress(String address) {
		addressElement.sendKeys(address);
	}

	public void setCity(String city) {
		cityElement.sendKeys(city);

	}

	public void setState(String state) {
		stateElement.sendKeys(state);
	}

	public void setCountry(String country) {
		Select selectCountry = new Select(countryElement);
		selectCountry.selectByVisibleText(country);

	}

	public void setPostalCode(String postCode) {
		postCodeElement.sendKeys(postCode);

	}

	public void setPhone(String phoneNumber) {
		phoneElement.sendKeys(phoneNumber);
	}

	public void clickOnShippingAddressCheckbox() {
		sameAddressElement.click();
	}

	public void clickOnPurchase() {
		purchaseElement.click();
	}

	public void enterPersonalDetails(String email, String firstName, String lastName, String address, String city,
			String state, String country, String postCode, String phoneNumber) {
		System.out.println("Started entering the personal details");
		setEmail(email);
		System.out.println("email done");
		setFirstName(firstName);
		System.out.println("firstName done");
		setLastName(lastName);
		System.out.println("lastName done");
		setAddress(address);
		System.out.println("address done");
		setCity(city);
		System.out.println("city done");
		setState(state);
		System.out.println("state done");
		setCountry(country);
		System.out.println("country done");
		setPostalCode(postCode);
		System.out.println("post code done");
		setPhone(phoneNumber);
		System.out.println("phone done");
		clickOnShippingAddressCheckbox();
		System.out.println("checkbox done");
		clickOnPurchase();
		System.out.println("purchase done");

	}

}
