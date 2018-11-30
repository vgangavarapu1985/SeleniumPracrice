package com.mortgaecalculator.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProjectFunctions {
	
	WebDriver driver;
	public ProjectFunctions(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void findTextboxByIDAndEnterData(String locatorValue, String propertyValue )
	{
		WebElement findTextBoxElement = driver.findElement(By.id(locatorValue));
		findTextBoxElement.clear();
		findTextBoxElement.sendKeys(propertyValue);
	}
	
	public void selectTheDropdownValue(String locatorValue, String propValue)
	{
		WebElement findDropdownElement = driver.findElement(By.name(locatorValue));
		Select select = new Select(findDropdownElement);
		select.selectByVisibleText(propValue);
		
	}
	
	public void clickOnButtonByValue(String propValue)
	{
		WebElement findButtonElement = driver.findElement(By.xpath("//input[@type='submit' and @value='"+propValue+"']"));
		findButtonElement.click();
	}

}
