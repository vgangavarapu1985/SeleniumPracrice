package com.newtours.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[text()='SIGN-OFF']")
	WebElement signOffElement;
	
	@FindBy(how=How.XPATH, using="//a[text()='PROFILE']")
	WebElement profileElement;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dashBoardPageDisplayed()
	{
		boolean isdisplayed = signOffElement.isDisplayed();
		Assert.assertTrue(isdisplayed);
		
	}
	
	public void clickOnProfileLink()
	{
		profileElement.click();
	}

}
