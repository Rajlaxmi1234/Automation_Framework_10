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
public class TC_DWS_002_Test extends BaseClass{
@Test
public void cellPhone() {
	hp=new HomePage(driver);
	WebElement electronic = hp.getElectronicsLink();
	wutil.mouseHover(driver, electronic);
	hp.getCellPhoneLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Cell phone","cell phone page is  not displayed");
	test.log(Status.PASS, "cell phone page is  displayed");
	
}
}
