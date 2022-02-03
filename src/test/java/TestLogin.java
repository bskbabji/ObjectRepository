import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import javax.imageio.ImageIO;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Utility.Orep;
import Utility.library_BusinessFunctions;

public class TestLogin extends library_BusinessFunctions {
	/*
	 * @Test(priority = 1) 
	 * public void TestMultipleWindows() throws InterruptedException, IOException {
	 * 
	 * test = extent.createTest("TestMultipleWindows");
	 * 
	 * driver.navigate().to(objProperties.getProperty("HomePageURL"));
	 * 
	 * FindElement(Orep.StartTrialButton).click();
	 * 
	 * test.info("clicked trial button"); test.log(Status.INFO, "xxxxxxx");
	 * Set<String> windowHandleSet = driver.getWindowHandles();
	 * GetScreenShot("firstScreenshot");
	 * 
	 * Thread.sleep(300); for (String windowHandle : windowHandleSet) {
	 * driver.switchTo().window(windowHandle); GetScreenShot("SecondScreenshot");
	 * System.out.println(driver.getTitle());
	 * 
	 * if ((driver.getTitle()).
	 * equals("Salesforce: We Bring Companies and Customers Together")) { break; } }
	 * 
	 * test.fail("fail details", MediaEntityBuilder.createScreenCaptureFromPath(
	 * ".//Screenshots//firstScreenshot.png").build());
	 * //test.addScreenCaptureFromPath(".//Screenshots//firstScreenshot.png");
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test(priority = 2) public void TestSliderOne() {
	 * 
	 * driver.navigate().to(objProperties.getProperty("MouseOperationsURL")); //
	 * Actions class and mouse // operations
	 * 
	 * driver.switchTo().frame(0); Actions act = new Actions(driver); WebElement
	 * Slider = FindElement(Orep.Slider); act.dragAndDropBy(Slider, 400,
	 * 0).build().perform();
	 * 
	 * }
	 * 
	 * @Test(priority = 3) public void TestSliderTwo() {
	 * 
	 * driver.navigate().to(objProperties.getProperty("ResizeableURL"));
	 * driver.switchTo().frame(0); Actions act = new Actions(driver); WebElement
	 * Slider = FindElement(Orep.Resizeable); act.dragAndDropBy(Slider, 50,
	 * 0).build().perform();
	 * 
	 * }
	 * 
	 * @Test(priority = 4) public void TestRightClick() throws InterruptedException,
	 * IOException, AWTException {
	 * 
	 * driver.navigate().to(objProperties.getProperty("mouseOpeartionRightClick"));
	 * 
	 * Actions act = new Actions(driver); WebElement RightClickEle =
	 * FindElement(Orep.RightClickButton);
	 * act.contextClick(RightClickEle).build().perform();
	 * GetScreenShot("clickedCopy"); Thread.sleep(100); WebElement CopyEle =
	 * FindElement(Orep.RightClickButtonCopyOption);
	 * act.click(CopyEle).build().perform();
	 * 
	 * Robot r = new Robot(); Rectangle rect = new
	 * Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); BufferedImage img =
	 * r.createScreenCapture(rect); File f = new File(".//Screenshots/alert.png");
	 * ImageIO.write(img, "png", f);
	 * 
	 * Thread.sleep(6000); Alert alert = driver.switchTo().alert();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * alert.accept();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void HandlingTables() throws InterruptedException
	 * {
	 * 
	 * driver.navigate().to(objProperties.getProperty("TableHandlingURL"));
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0,500)"); Thread.sleep(1000);
	 * FindElement(Orep.FirstPage).click(); String text =
	 * FindElement(Orep.NumberOfEntries).getText(); System.out.println(text);
	 * 
	 * String numberOfRowsPerPage = text.substring(text.indexOf("to") + 3,
	 * text.indexOf("of") - 1); int rowCountPerPage =
	 * Integer.parseInt(numberOfRowsPerPage); System.out.println("rows per page " +
	 * rowCountPerPage);
	 * 
	 * String TotalEntries = text.substring(text.indexOf("of") + 3,
	 * text.indexOf("entries") - 1); int totalEntries =
	 * Integer.parseInt(TotalEntries); System.out.println("total entries " +
	 * totalEntries);
	 * 
	 * int pageCount; if (totalEntries % rowCountPerPage == 0) pageCount =
	 * totalEntries / rowCountPerPage; else pageCount = (totalEntries /
	 * rowCountPerPage) + 1;
	 * 
	 * System.out.println("number of pages " + pageCount);
	 * 
	 * int flag = 0;
	 * 
	 * for (int page = 1; page <= pageCount; page++) { for (int i = 1; i <=
	 * rowCountPerPage; i++) {
	 * 
	 * // String LastName = //
	 * driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[3]")).
	 * getText(); String LastName =
	 * FindElementWithVariableXPath(Orep.LastNameTableRow, i).getText();
	 * 
	 * if (LastName.equals(objProperties.getProperty("LastNameRequired"))) { flag =
	 * 1; System.out.println("The other details are:"); // String FirstName = //
	 * driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).
	 * getText(); String FirstName =
	 * FindElementWithVariableXPath(Orep.FirstNameTableRow, i).getText();
	 * System.out.println("first name is " + FirstName); break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if (flag == 1) break; else FindElement(Orep.NextPage).click(); } }
	 */

	/*
	 * @Test public void TestBasicHTMLControls() throws InterruptedException {
	 * 
	 * driver.navigate().to(objProperties.getProperty("BasicHTMLControlsURL"));
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,400)"); Thread.sleep(500);
	 * 
	 * WebElement MaleElement = FindElement(Orep.MaleRadioButton);
	 * if(MaleElement.isSelected()==true) { Thread.sleep(300);
	 * FindElement(Orep.FemaleRadioButton).click();
	 * 
	 * Thread.sleep(300); }
	 * 
	 * FindElement(Orep.EnglishCheckBox).click();
	 * FindElement(Orep.HindiCheckBox).click();
	 * FindElement(Orep.ChineseCheckBox).click();
	 * 
	 * Thread.sleep(300);
	 * 
	 * FindElement(Orep.ChineseCheckBox).click();
	 * 
	 * Thread.sleep(300);
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void TestDropDownControls() throws InterruptedException {
	 * 
	 * driver.navigate().to(objProperties.getProperty("DropDownControlsURL"));
	 * 
	 * WebElement SingleDropDown = FindElement(Orep.CourseDropDown);
	 * 
	 * Select SingleDropDownOptions = new Select(SingleDropDown);
	 * 
	 * List<WebElement> AvailableOptions = SingleDropDownOptions.getOptions();
	 * 
	 * System.out.println("Single Choice Drop Down options are:");
	 * 
	 * for( WebElement ele : AvailableOptions) { System.out.println(ele.getText());
	 * }
	 * 
	 * SingleDropDownOptions.selectByIndex(1);
	 * 
	 * Thread.sleep(800);
	 * 
	 * SingleDropDownOptions.selectByValue("net");
	 * 
	 * Thread.sleep(500);
	 * 
	 * SingleDropDownOptions.selectByVisibleText("Javascript"); Thread.sleep(500);
	 * 
	 * Select MultiDropDown = new Select(FindElement(Orep.IDE_MultiDropDown));
	 * 
	 * List<WebElement> MultiDropDownOptions = MultiDropDown.getOptions();
	 * 
	 * System.out.println("Multi Choice Drop Down options are:");
	 * 
	 * for( WebElement ele : MultiDropDownOptions) {
	 * System.out.println(ele.getText()); }
	 * 
	 * MultiDropDown.selectByIndex(1); Thread.sleep(500);
	 * 
	 * MultiDropDown.selectByValue("nb"); Thread.sleep(500);
	 * MultiDropDown.selectByVisibleText("Visual Studio"); Thread.sleep(500);
	 * 
	 * System.out.println("first selected option" +
	 * MultiDropDown.getFirstSelectedOption().getText());
	 * 
	 * }
	 */

	@Test
	public void FileUploadUsingRobot() throws InterruptedException, AWTException {

		driver.navigate().to(objProperties.getProperty("FileUploadURL"));
		Thread.sleep(1000);
		WebElement ele = FindElement(Orep.FileUploadBrowseButton);

		Actions act = new Actions(driver);
		act.click(ele).build().perform();

		StringSelection FileSelected = new StringSelection(
				"C:\\Users\\swapn\\OneDrive\\Desktop\\Selenium SDET\\Selenium_basics.txt");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Clipboard cp = tk.getSystemClipboard();
		cp.setContents(FileSelected, null);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);

	}

	@Test
	public void DownloadZipFile() throws InterruptedException {

		driver.navigate().to(objProperties.getProperty("DownloadZipFileURL"));
		FindElement(Orep.DownloadZipFile).click();
		Thread.sleep(1000);
	}

	@Test
	public void FileUploadUsingSendKeys() throws InterruptedException {

		driver.navigate().to(objProperties.getProperty("FileUploadURL"));
		Thread.sleep(2000);
		FindElement(Orep.FileUploadBrowseButton)
				.sendKeys("C:\\Users\\swapn\\OneDrive\\Desktop\\Selenium SDET\\Selenium_basics.txt");
		Thread.sleep(5000);

	}

	@Test
	public void FileDownload() throws InterruptedException {

		driver.navigate().to(objProperties.getProperty("FileDownloadURL"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1500);

		WebElement ele = FindElement(Orep.FileDownload500kb);
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
		System.out.println("download 500 kb button clicked");
		Thread.sleep(100000);
		File objFile = new File(System.getProperty("user.dir"));
		File[] AllFiles = objFile.listFiles();
		Boolean fileFound = false;
		File obj_File = null;
		for (File IndividualFile : AllFiles) {
			if (IndividualFile.isDirectory() == true)
				continue;
			String FileName = IndividualFile.getName();
			System.out.println("FileName:" + FileName);
			if (FileName.contains("file-sample")) {
				fileFound = true;
				obj_File = new File(FileName);
				break;
			}
		}
		Assert.assertTrue(fileFound, "Downloaded File Not Found");
		obj_File.deleteOnExit();

	}
}
