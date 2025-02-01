package com.Qspiders.book;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.genericUtility.BaseClass;
import com.Qspider.genericUtility.ListernerUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

@Listeners(ListernerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
	
	@Test
	public void clickOnBooks() {
		
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		org.testng.Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Book","books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
