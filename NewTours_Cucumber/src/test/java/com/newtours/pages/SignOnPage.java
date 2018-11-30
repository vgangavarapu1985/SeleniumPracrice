package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {
	
	WebDriver driver;
	
	@FindBy(how=How.NAME, using="userName")
	WebElement usernameElement;
	
	@FindBy(how=How.NAME, using="password")
	WebElement passwordElement;
	
	@FindBy(how=How.NAME, using="login")
	WebElement submitButtonElement;
	
	public SignOnPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String userName)
	{
		usernameElement.sendKeys(userName);
	}
	
	public void setPassword(String password)
	{
		passwordElement.sendKeys(password);
	}
	
	public void clickOnSubmitButton()
	{
		submitButtonElement.click();
	}
	
	public void logInToNewTours(String userName, String password)
	{
		setUserName(userName);
		setPassword(password);
		clickOnSubmitButton();
	}
}
