package com.Qspider.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
@FindBy(partialLinkText = "Camera, photo")
private WebElement cameraLink;

public ElectronicsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCameraLink() {
	return cameraLink;
}

}
