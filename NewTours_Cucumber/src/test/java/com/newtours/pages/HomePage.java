package com.newtours.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[text()='SIGN-ON']")
	WebElement signOnElement;
	
	@FindBy(how=How.XPATH, using="//a[text()='REGISTER']")
	WebElement registerElement;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomePageDisplayed()
	{
		boolean isdisplayed = signOnElement.isDisplayed();
		Assert.assertTrue(isdisplayed);
	}
	
	public void clickOnLoginLink()
	{
		signOnElement.click();
	}
	
	public void clickOnRegisterLink()
	{
		registerElement.click();
	}

}
