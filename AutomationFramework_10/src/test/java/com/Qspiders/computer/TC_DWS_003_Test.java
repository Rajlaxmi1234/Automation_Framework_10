package com.Qspiders.computer;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.genericUtility.BaseClass;
import com.Qspider.genericUtility.ListernerUtility;
import com.aventstack.extentreports.Status;
@Listeners(ListernerUtility.class)
public class TC_DWS_003_Test extends BaseClass {
@Test
public void desktop() {
	hp=new HomePage(driver);
	WebElement computer = hp.getComputersLink();
	wutil.mouseHover(driver, computer);
	hp.getDesktopLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","desktop page is not displayed");
	test.log(Status.PASS, "desktop page is displayed");
}
}
