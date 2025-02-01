package com.Qspiders.book;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Qspider.ObjectRepository.BooksPage;
import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.genericUtility.BaseClass;
import com.aventstack.extentreports.Status;

public class TC_DWS_002_Test extends BaseClass {
@Test
public void sortby() {
	hp=new HomePage(driver);
	hp.getBooksLink().click();
	bp=new BooksPage(driver);
	WebElement sortby = bp.getSortByDropDown();
	wutil.selectByindex(sortby, 1);
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","books page is not displayed");

}
}
