package com.newtours.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//img[contains(@src,'editprofile.gif')]")
	WebElement editProfileElement; 
	
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement firstNameElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='lastName']")
	WebElement lastNameElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='phone']")
	WebElement phoneElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	WebElement emailElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='address1']")
	WebElement addressElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='city']")
	WebElement cityElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='state']")
	WebElement stateElement;
	
	@FindBy(how=How.XPATH, using="//input[@name='postalCode']")
	WebElement postElement;

	@FindBy(how=How.XPATH, using="//select[@name='country']")
	WebElement countryElement;
	
	@FindBy(how=How.XPATH, using="//img[contains(@src,'profile_submit')]")
	WebElement submitElement;
	
	public ProfilePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyprofilePageDisplayed()
	{
		boolean displayed = editProfileElement.isDisplayed();
		Assert.assertTrue(displayed);
	}

	public void setFirstName(String firstName)
	{
		firstNameElement.clear();
		firstNameElement.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		lastNameElement.clear();
		lastNameElement.sendKeys(lastName);
	}
	public void setPhone(String phone)
	{
		phoneElement.clear();
		phoneElement.sendKeys(phone);
		
	}
	
	public void setEmail(String email)
	{
		emailElement.clear();
		emailElement.sendKeys(email);
	}
	
	public void setAddress(String address)
	{
		addressElement.clear();
		addressElement.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		cityElement.clear();
		cityElement.sendKeys(city);
	}
	
	public void setState(String state)
	{
		stateElement.clear();
		stateElement.sendKeys(state);
	}
	
	public void setPostCode(String postCode)
	{
		postElement.clear();
		postElement.sendKeys(postCode);
	}
	
	public void setCountry(String countryValue)
	{
		Select select = new Select(countryElement);
		select.selectByVisibleText(countryValue);
	}
	
	public void clickOnSubmitButton()
	{
		submitElement.click();
	}
	
}

