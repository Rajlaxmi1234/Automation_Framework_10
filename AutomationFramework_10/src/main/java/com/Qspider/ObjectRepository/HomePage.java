package com.Qspider.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Log out")
private WebElement logoutLink;
@FindBy(partialLinkText = "BOOKS")
private  WebElement booksLink;

@FindBy(partialLinkText = "COMPUTERS")
private WebElement computersLink;

@FindBy(partialLinkText = "ELECTRONICS")
private WebElement electronicsLink;

@FindBy(xpath = "//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")
public WebElement addToCartButton;
@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement shoppingCartLink;

@FindBy(partialLinkText  = "Desktops")
private WebElement desktopLink;
@FindBy(partialLinkText = "Camera, photo")
private WebElement cameraLink;

@FindBy(partialLinkText = "Cell phones")
private WebElement cellPhoneLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getBooksLink() {
	return booksLink;
}

public WebElement getComputersLink() {
	return computersLink;
}

public WebElement getElectronicsLink() {
	return electronicsLink;
}

public WebElement getAddToCartButton() {
	return addToCartButton;
}

public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}

public WebElement getDesktopLink() {
	return desktopLink;
}

public WebElement getCameraLink() {
	return cameraLink;
}

public WebElement getCellPhoneLink() {
	return cellPhoneLink;
}

}
