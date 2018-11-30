package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignOnPage {

	public WebDriver driver;

	@FindBy(how = How.NAME, using = "userName")
	WebElement userNameElement;

	@FindBy(how = How.NAME, using = "password")
	WebElement passWordElement;

	@FindBy(how = How.NAME, using = "login")
	WebElement submitButton;


	public SignOnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find UserName and click on it
	public void setUserName(String userName) {
		userNameElement.sendKeys(userName);

	}

	// Find Password and click on it
	public void setPassword(String password) {
		passWordElement.sendKeys(password);
	}

	// Find Password and click on it
	public void clickOnSubmitButton() {
		submitButton.click();
	}

	public void verifySignOn() {
		boolean isDisplayed = passWordElement.isDisplayed();

		Assert.assertEquals(isDisplayed, true, "Signed into New Tours Application with Invalid credentials");
	}
	
	public void verifyAfterSignOn(String userName, String password)
	{
		setUserName(userName);
		setPassword(password);
		clickOnSubmitButton();
		verifySignOn();
	}
}
