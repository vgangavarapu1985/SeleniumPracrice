package com.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductCategoriesPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@value='Search Products']")
	WebElement searchElement;

	@FindBy(how = How.XPATH, using = "//div[@class='product_grid_display group']/div[contains(@class,'product_grid_item')]")
	List<WebElement> noOfSearchResults;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement addToCartElement;

	@FindBy(how = How.XPATH, using = "//a[@title='Checkout']/em[@class='count']")
	WebElement countWebElement;

	
	public ProductCategoriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchProduct(String searchProduct) {
		searchElement.sendKeys(searchProduct);
		searchElement.sendKeys(Keys.ENTER);

		Assert.assertEquals(noOfSearchResults.size(), 1, "Wrong No Of items in the search results");

	}

	public void AddProductToCart() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		addToCartElement.click();

		String addedTextXpath = "//div/p[text()='Item has been added to your cart!']";
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addedTextXpath)));
		Assert.assertTrue(until.isDisplayed());

		Thread.sleep(2000);

		String length = countWebElement.getText();
		System.out.println("No of items in the cart as of now:" + length.trim());

		countWebElement.click();

	}

}
