package com.demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage {
	
	WebDriver driver;
	

	@FindBy(how=How.XPATH, using="//table[@class='checkout_cart']/tbody/tr[contains(@class,'product_row')]")
	List<WebElement> noOfCheckOutItemsElement;
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Continue']")
	WebElement continueElement;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateCheckoutItem(String product) throws InterruptedException
	{
		//String checkOutItemsXpath = "//div[@id='checkout_page_container']";
		//WebElement wait = new WebDriverWait(driver,120).until(ExpectedConditions.elementToBeClickable(By.xpath(checkOutItemsXpath)));
		//Boolean waitForCheckOutItemsList = wait.until(ExpectedConditions.elementToBeSelected(By.xpath(checkOutItemsXpath)));
		
		//Thread.sleep(5000);
		//String noOfCheckOutItemsXpath = "//table[@class='checkout_cart']/tbody/tr[contains(@class,'product_row')]";
		//List<WebElement> noOfCheckOutItemsElement = driver.findElements(By.xpath(noOfCheckOutItemsXpath));
		
		Assert.assertEquals(noOfCheckOutItemsElement.size(),1,"Wrong No Of Checkout Items");
		
		Thread.sleep(5000);
		String checkOutItemXpath = "//td/a[text()='"+product+"']";
		WebElement checkOutItemElement = driver.findElement(By.xpath(checkOutItemXpath));
		
		Assert.assertEquals(checkOutItemElement.getText(), product, "CheckOut item is not matched");
		
		Thread.sleep(10000);
		System.out.println("Waited for 10 sec");
		
		continueElement.click();
		System.out.println("Clicked On Continue Button");
		
		
		
	}
	
	

}
