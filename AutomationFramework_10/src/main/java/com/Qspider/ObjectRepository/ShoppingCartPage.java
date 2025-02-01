package com.Qspider.ObjectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
@FindBy(xpath = "//td[@class=\"product\"]/../..//a[text()='14.1-inch Laptop']")
private WebElement productName;

public ShoppingCartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getProductName() {
	return productName;
}

}
