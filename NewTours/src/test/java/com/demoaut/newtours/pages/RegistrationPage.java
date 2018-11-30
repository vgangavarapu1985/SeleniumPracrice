package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	public WebDriver driver;

	@FindBy(how = How.NAME, using = "firstName")
	WebElement firstNameElement;

	@FindBy(how = How.NAME, using = "lastName")
	WebElement lastNameElement;

	@FindBy(how = How.NAME, using = "phone")
	WebElement phoneElement;

	@FindBy(how = How.NAME, using = "userName")
	WebElement emailElement;

	@FindBy(how = How.NAME, using = "email")
	WebElement userNameElement;

	@FindBy(how = How.NAME, using = "password")
	WebElement passwordElement;

	@FindBy(how = How.NAME, using = "confirmPassword")
	WebElement confirmpasswordElement;

	@FindBy(how = How.NAME, using = "register")
	WebElement submitElement;



	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find FirstName field and set the firstname
	public void setFirstName(String firstName) {

		firstNameElement.sendKeys(firstName);

	}

	// Find LastName field and set the LastName
	public void setLastName(String lastName) {

		lastNameElement.sendKeys(lastName);

	}

	// Find Phone field and set the Phone Number
	public void setPhoneNumber(String phoneNumber) {

		phoneElement.sendKeys(phoneNumber);

	}

	// Find Email field and set the Email
	public void setEmail(String email) {

		emailElement.sendKeys(email);

	}

	// Find UserName field and set the UserName
	public void setUserName(String userName) {

		userNameElement.sendKeys(userName);

	}

	// Find Password field and set the password
	public void setPassword(String password) {

		passwordElement.sendKeys(password);

	}

	// Find ConfirmPassword field and set the password
	public void setConfirmPassword(String confirmPassword) {

		confirmpasswordElement.sendKeys(confirmPassword);

	}

	// Find Submit Button and click on it
	public void clickOnSubmitButton() {

		submitElement.click();

	}
	
	public void registerUserProfile(String firstName, String lastName, String phoneNumber,String email,String userName, String password )
	{
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setUserName(userName);
		setPassword(password);
		setConfirmPassword(password);
		clickOnSubmitButton();
		
	}

}
