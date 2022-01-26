package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class library_BusinessFunctions /* extends Constants */ {

	public static WebDriver driver;
	public static Properties objProperties;
	static DesiredCapabilities dc;
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void designHtmlReport() {
		
		htmlReport = new ExtentHtmlReporter("HTML_report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		
		
		
	}

	public static void initialConfig() throws IOException {

		File f = new File(System.getProperty("user.dir") + "//src//test//resources//Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		objProperties = new Properties();
		objProperties.load(fis);

	}

	@BeforeMethod
	public static void LaunchBrowser() throws IOException {
		
		designHtmlReport();
		initialConfig();

		String Browser = objProperties.getProperty("Browser");

		switch (Browser) {
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "chrome":
			// DesiredCapabilities dc = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);
			// ChromeOptions c = new ChromeOptions();
			// c.merge(dc);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		
	}

	public static WebElement FindElement(String OrepLocator) {

		By search = null;

		String locator = OrepLocator.split("&")[0];
		String value = OrepLocator.split("&")[1];

		if (locator.equals("name")) {
			search = By.name(value);
		} else if (locator.equals("id")) {
			search = By.id(value);
		} else if (locator.equals("xpath")) {
			search = By.xpath(value);
		} else if (locator.equals("tagName")) {
			search = By.tagName(value);
		} else if (locator.equals("className")) {
			search = By.className(value);
		} else if (locator.equals("partialLinkText")) {
			search = By.partialLinkText(value);
		} else if (locator.equals("cssSelector")) {
			search = By.cssSelector(value);
		} else if (locator.equals("linkText")) {
			search = By.linkText(value);
		}
		return driver.findElement(search);
	}

	public static List<WebElement> FindElements(String OrepLocator) {
		By search = null;
		System.out.println(OrepLocator);
		String locator = OrepLocator.split("&")[0];
		String value = OrepLocator.split("&")[1];
		System.out.println(locator);
		System.out.println(value);
		if (locator.equals("name")) {
			search = By.name(value);
		} else if (locator.equals("id")) {
			search = By.id(value);
		} else if (locator.equals("xpath")) {
			search = By.xpath(value);
		} else if (locator.equals("tagName")) {
			search = By.tagName(value);
		} else if (locator.equals("className")) {
			search = By.className(value);
		} else if (locator.equals("partialLinkText")) {
			search = By.partialLinkText(value);
		} else if (locator.equals("cssSelector")) {
			search = By.cssSelector(value);
		} else if (locator.equals("linkText")) {
			search = By.linkText(value);
		}
		return driver.findElements(search);
	}
	
	public static WebElement FindElementWithVariableXPath(String OrepLocator, int index ) {

		By search = null;

		String locator = OrepLocator.split("&")[0];
		String value = OrepLocator.split("&")[1];

		if (locator.equals("name")) {
			search = By.name(value);
		} else if (locator.equals("id")) {
			search = By.id(value);
		} else if (locator.equals("xpath")) {
			
			String s = 	value.replace("${i}", String.valueOf(index));
			//System.out.println("xpath after replacing with variable is "+ s);
			search = By.xpath(s);
		} else if (locator.equals("tagName")) {
			search = By.tagName(value);
		} else if (locator.equals("className")) {
			search = By.className(value);
		} else if (locator.equals("partialLinkText")) {
			search = By.partialLinkText(value);
		} else if (locator.equals("cssSelector")) {
			search = By.cssSelector(value);
		} else if (locator.equals("linkText")) {
			search = By.linkText(value);
		}
		return driver.findElement(search);
	}


	@AfterMethod
	public void closeBrowser() {
		 driver.quit();
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	public static void GetScreenShot(String fileName) {

		try {
			if (driver == null)
				System.out.println("driver is null");
			System.out.println("screenshot file name is " + fileName);
			TakesScreenshot s = (TakesScreenshot) driver;
			if (s == null)
				System.out.println("screenshot object is null");

			File f = s.getScreenshotAs(OutputType.FILE);
			if (f == null)
				System.out.println("screenshot file is null");
			File f1 = new File(".//Screenshots//" + fileName + ".png");
			FileUtils.copyFile(f, f1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
