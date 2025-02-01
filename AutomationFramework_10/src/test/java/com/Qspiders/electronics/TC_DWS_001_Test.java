package com.Qspiders.electronics;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.genericUtility.BaseClass;
import com.Qspider.genericUtility.ListernerUtility;
import com.aventstack.extentreports.Status;
@Listeners(ListernerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
@Test
public void  electronics() {
	hp=new HomePage(driver);
	WebElement electronic = hp.getElectronicsLink();
	wutil.mouseHover(driver, electronic);
	hp.getCameraLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Camera, phot","camera  page is  not displayed");
	test.log(Status.PASS, "camera page is displayed");
}
}
