package com.Qspider.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Qspider.ObjectRepository.BooksPage;
import com.Qspider.ObjectRepository.HomePage;
import com.Qspider.ObjectRepository.LoginPage;
import com.Qspider.ObjectRepository.ShoppingCartPage;
import com.Qspider.ObjectRepository.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

public class BaseClass {
	public static ExtentReports extReport;
	public JavaUtility jutil = new JavaUtility();
	public static WebDriver driver;
	public WebDriverUtility wutil = new WebDriverUtility();
	public FileUtility futil = new FileUtility();
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	public static ExtentTest test;
	public ShoppingCartPage scp;
	public BooksPage bp;

	@BeforeSuite
	public void configureReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_report/ExtentReport_" + jutil.getSystemTime() + ".html");
		extReport = new ExtentReports();
		extReport.attachReporter(spark);
	}

	@Parameters("Browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		wutil.implicitWait(driver);
		driver.get(futil.getDataFromProperty("url"));

	}

	@BeforeMethod
	public void login() throws IOException {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(futil.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}

	@AfterMethod
	public void logout() {
		hp = new HomePage(driver);
		hp.getLogoutLink().click();
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackup() {
		extReport.flush();
	}
}
