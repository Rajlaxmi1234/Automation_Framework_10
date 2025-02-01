package com.Qspiders.computer;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.TextReporter;

import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.genericUtility.BaseClass;
import com.Qspider.genericUtility.ListernerUtility;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
@Listeners(ListernerUtility.class)
public class TC_DWS_002_Test extends BaseClass {
	@Test
	public void clickOnComputer() {
		
		hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "computers page is not displayed");
		test.log(Status.PASS, "computers page is displayed");
	
	}
}
