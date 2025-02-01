package com.Qspider.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Aman
 */
public class WebDriverUtility {
	/**
	 * this method will perform mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	/**
	 * this method will perform mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	/**
	 * this method will perform mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();

	}

	/**
	 * this method will perform drag and drop action
	 * 
	 * @param driver
	 * @param element
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	/**
	 * this method will perform right click action
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}
/**
 *  this method will select the option by index
 * @param element
 * @param index
 */
	public void selectByindex(WebElement element, int index) {
		Select dropDown = new Select(element);
		dropDown.selectByIndex(index);
	}
	/**
	 *  this method will select the option by 
	 * @param element
	 * @param index
	 */
	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	/**
	 *  this method will select the option by visible text
	 * @param element
	 * @param index
	 */
	public void selectByVisibleText(WebElement element, String Text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
		;
	}
	/**
	 *  this method will switch to  the frame by index
	 * @param element
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 *  this method will switch to  the frame by String  Name or id 
	 * @param element
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	/**
	 *  this method will switch to  the frame by web Element
	 * @param element
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 *  this method will switch to  the Alert 
	 * @param element
	 * @param index
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		Alert alt = new Alert() {

			@Override
			public void sendKeys(String keysToSend) {
				driver.switchTo().alert().sendKeys(keysToSend);

			}

			@Override
			public String getText() {
				driver.switchTo().alert().getText();
				return null;
			}

			@Override
			public void dismiss() {
				driver.switchTo().alert().dismiss();

			}

			@Override
			public void accept() {
				driver.switchTo().alert().accept();
			}

		};

	}
	/**
	 *  this method will switch to window
	 * @param element
	 * @param index
	 */
	public void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(expUrl)) {
				break;
			}
		}

	}
	/**
	 *  this method will give implicitwait to findElement or findElements
	 * @param element
	 * @param index
	 */
	public Timeouts implicitWait(WebDriver driver) {
		return driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	/**
	 *  this method will give explicitwait 
	 * @param element
	 * @param index
	 */
	public WebDriverWait explicitWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		return wait;
	}
	/**
	 *  this method will take a screenshot
	 * @param element
	 * @param index
	 */
	public void takeScreenshot(WebDriver driver) throws IOException {
		JavaUtility jutil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/" + jutil.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);
	}
}
