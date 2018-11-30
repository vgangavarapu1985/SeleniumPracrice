package com.demoqa.tests;

import org.testng.annotations.Test;

import com.demoqa.pages.CheckOutPage;
import com.demoqa.pages.ConfirmationPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.PIDetails_AtCheckOutPage;
import com.demoqa.pages.ProductCategoriesPage;
import com.demoqa.utils.ExcelUtil;

public class ProductOrder extends BaseTest {

	HomePage hPage;
	ProductCategoriesPage pcPage;
	CheckOutPage cPage;
	PIDetails_AtCheckOutPage piPage;
	ConfirmationPage cfPage;
	
	@Test
	public void AddproductToCart() throws InterruptedException {

		hPage = new HomePage(driver);
		pcPage = new ProductCategoriesPage(driver);
		cPage = new CheckOutPage(driver);
		piPage = new PIDetails_AtCheckOutPage(driver);
		cfPage = new ConfirmationPage(driver);
		
		String filePath = "./src/test/resources/ProductDetails.xls";
		ExcelUtil eu = new ExcelUtil(filePath,"ProductDetails");
		
		int noOfRows = eu.getNoOfRows();
		for (int i=1; i<=noOfRows; i++)
		{
			hPage.selectProduct(eu.getCellValue(i, 0));
			System.out.println("Selected The Product");
			pcPage.searchProduct(eu.getCellValue(i, 1));
			pcPage.AddProductToCart();
			System.out.println("Added The Product to Cart");
			cPage.validateCheckoutItem(eu.getCellValue(i, 1));
			System.out.println("Validated the Product at cart");
			String email = eu.getCellValue(i, 2);
			String firstName = eu.getCellValue(i, 3);
			String lastName = eu.getCellValue(i, 4);
			String address = eu.getCellValue(i, 5);
			String city = eu.getCellValue(i, 6);
			String state = eu.getCellValue(i, 7);
			String country = eu.getCellValue(i, 8);
			String postCode = eu.getCellValue(i, 9);
			String phoneNumber = eu.getCellValue(i, 10);
			piPage.enterPersonalDetails(email, firstName, lastName, address, city, state, country, postCode, phoneNumber);
			System.out.println("Entered the personal details");
			cfPage.cofirmTheOrder(eu.getCellValue(i, 1));
			System.out.println("Confirmed The Product");
		}
	}




}
