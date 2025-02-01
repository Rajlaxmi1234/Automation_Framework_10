package com.Qspiders.computer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.ObjectRepository.ShoppingCartPage;
import com.Qspider.genericUtility.BaseClass;
import com.Qspider.genericUtility.ListernerUtility;
import com.aventstack.extentreports.Status;
@Listeners(ListernerUtility.class)
public class AddToCartTest extends BaseClass{
	@Test
	public void addToCart() throws IOException {
		hp=new HomePage(driver);
		hp.getAddToCartButton().click();
		hp.getShoppingCartLink().click();
		scp=new ShoppingCartPage(driver);
		Assert.assertEquals(scp.getProductName().getText(), "14.1-inch Laptop","product is not added");
		test.log(Status.PASS, "product added successfully");
		wutil.takeScreenshot(driver);
	}

}
