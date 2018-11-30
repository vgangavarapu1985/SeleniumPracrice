package com.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ConfirmationPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//table[@class='wpsc-purchase-log-transaction-results']/tbody/tr")
	List<WebElement> noOfItemsElement;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void cofirmTheOrder(String product) {
		
		Assert.assertEquals(noOfItemsElement.size(), 1, "Wrong No Of Items in the confirmation page");

		String itemXpath = "//td[text()='" + product + "']";
		WebElement itemElement = driver.findElement(By.xpath(itemXpath));
		Assert.assertEquals(itemElement.isDisplayed(), true, "Item is not showing as " + product);

	}

}
