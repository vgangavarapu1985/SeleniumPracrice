package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Product Category')]")
	WebElement productCategoryElement;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectProduct(String product)

	{
		// Mouse Hover on Product Category
		Actions action = new Actions(driver);
		action.moveToElement(productCategoryElement).build().perform();

		String prodcutXpath = "//a[text()=" + product + "']";
		WebElement productElement = driver.findElement(By.xpath(prodcutXpath));

		productElement.click();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement selectedProductElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/h1[text()='" + product + "']")));
		Assert.assertEquals(selectedProductElement.isDisplayed(), true,
				"Selected product" + product + "is not displayed");

	}

}
