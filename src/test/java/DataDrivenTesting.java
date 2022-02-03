import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.*;

public class DataDrivenTesting extends library_BusinessFunctions {

	XSSFWorkbook wb;
	XSSFSheet ws;

	@Test
	public void DataDrivenTest() throws IOException, Exception {

		driver.navigate().to(objProperties.getProperty("DataDrivenURL"));
		FileInputStream f = new FileInputStream(
				new File(System.getProperty("user.dir") + "//src//test//resources//AutomationDemoSIte.xlsx"));
		wb = new XSSFWorkbook(f);
		ws = wb.getSheet("TestData");
		int firstRow = ws.getFirstRowNum();
		int lastRow = ws.getLastRowNum();
		System.out.println("first row and last row" + firstRow + " " + lastRow);
		HashMap<String, String> testDataRow = new HashMap<String, String>();

		for (int i = firstRow + 1; i <= lastRow; i++) {

			
			testDataRow = populateTestData(i);

			if (testDataRow.get("RunMode").equals("Yes")) {
				
				Thread.sleep(2000);

				if(i>=2) clearForm();
				
				Thread.sleep(4000);

				FindElement(Orep.DataDrivenFirstName).sendKeys(testDataRow.get("FirstName"));
				FindElement(Orep.DataDrivenLastName).sendKeys(testDataRow.get("LastName"));
				FindElement(Orep.DataDrivenAddress).sendKeys(testDataRow.get("Address"));
				FindElement(Orep.DataDrivenEmail).sendKeys(testDataRow.get("Email Address"));
				FindElement(Orep.DataDrivenPhone).sendKeys(testDataRow.get("PhoneNumber"));

				if (testDataRow.get("Gender").equals("Male"))
					FindElement(Orep.DataDrivenGenderMale).click();
				else
					FindElement(Orep.DataDrivenGenderFemale).click();

				String hobbies = (String) testDataRow.get("Hobbies");
				// Cricket & Hockey
				String[] AllHobbies = hobbies.split("&");
				for (String hobby : AllHobbies) {
					if (hobby.trim().equals("Cricket"))
						FindElement(Orep.DataDrivenHobbiesCricket).click();
					else if (hobby.trim().equals("Movies"))
						FindElement(Orep.DataDrivenHobbiesMovies).click();
					else if (hobby.trim().equals("Hockey"))
						FindElement(Orep.DataDrivenHobbiesHockey).click();
				}

				// JavascriptExecutor js = (JavascriptExecutor) driver;
				// js.executeScript("window.scrollBy(0,100)");

				FindElement(Orep.DataDrivenLanguages).click();
				// DataDrivenAllLanguages
				String language = testDataRow.get("Languages");
				driver.findElement(
						By.xpath("//div[@id='msdd']/following-sibling::div/ul/li/a[text()='" + language + "']"))
						.click();

				FindElement(Orep.DataDrivenSkillsField).click();
				
				Select skillsSelect = new Select(FindElement(Orep.DataDrivenSkillsDropDown));
				skillsSelect.selectByVisibleText(testDataRow.get("Skills"));
				
				Select country = new Select(FindElement(Orep.DataDrivenSelectCountryDropDown));
				country.selectByVisibleText(testDataRow.get("SelectCountry"));
				
				Select year = new Select(FindElement(Orep.DataDrivenYear));
				year.selectByVisibleText(testDataRow.get("DOB_YY"));
				
				Select month = new Select(FindElement(Orep.DataDrivenMonth));
				month.selectByVisibleText(testDataRow.get("DOB_MM"));
				
				Select day = new Select(FindElement(Orep.DataDrivenDay));
				day.selectByVisibleText(testDataRow.get("DOB_DD"));
				
				FindElement(Orep.DataDrivenPassword).sendKeys(testDataRow.get("Password"));
				FindElement(Orep.DataDrivenConfirmPassword).sendKeys(testDataRow.get("confirm Password"));
				
				Thread.sleep(10000);

			}
			else {
				System.out.println("RunMode in test data excel file is not marked as Yes for row number :" + i);
			}
		}
		f.close();

	}

	private void clearForm() {

		// hobbies checkboxes

		if (FindElement(Orep.DataDrivenHobbiesCricket).isSelected() == true)
			FindElement(Orep.DataDrivenHobbiesCricket).click();
		if (FindElement(Orep.DataDrivenHobbiesMovies).isSelected() == true)
			FindElement(Orep.DataDrivenHobbiesMovies).click();
		if (FindElement(Orep.DataDrivenHobbiesHockey).isSelected() == true)
			FindElement(Orep.DataDrivenHobbiesHockey).click();

		// ui-icon ui-icon-close

		List<WebElement> languages = FindElements(Orep.LanguageClose);
		for (WebElement l : languages)
			l.click();
		
		Select skillsSelect = new Select(FindElement(Orep.DataDrivenSkillsDropDown));
		skillsSelect.selectByVisibleText("Select Skills");
		
		
		Select country = new Select(FindElement(Orep.DataDrivenSelectCountryDropDown));
		country.selectByVisibleText("");
		
		Select year = new Select(FindElement(Orep.DataDrivenYear));
		year.selectByVisibleText("year");
		
		Select month = new Select(FindElement(Orep.DataDrivenMonth));
		month.selectByVisibleText("Month");
		
		Select day = new Select(FindElement(Orep.DataDrivenDay));
		day.selectByVisibleText("Day");
		
	

		FindElement(Orep.DataDrivenFirstName).clear();
		FindElement(Orep.DataDrivenLastName).clear();
		FindElement(Orep.DataDrivenAddress).clear();
		FindElement(Orep.DataDrivenEmail).clear();
		FindElement(Orep.DataDrivenPhone).clear();
		FindElement(Orep.DataDrivenPassword).clear();
		FindElement(Orep.DataDrivenConfirmPassword).clear();

	}

	private HashMap<String, String> populateTestData(int i) {

		HashMap<String, String> testDataRow = new HashMap<String, String>();

		testDataRow.put("RunMode", ws.getRow(i).getCell(0).getStringCellValue());
		testDataRow.put("TestCaseName", ws.getRow(i).getCell(1).getStringCellValue());
		testDataRow.put("FirstName", ws.getRow(i).getCell(2).getStringCellValue());
		testDataRow.put("LastName", ws.getRow(i).getCell(3).getStringCellValue());
		testDataRow.put("Address", ws.getRow(i).getCell(4).getStringCellValue());
		testDataRow.put("Email Address", ws.getRow(i).getCell(5).getStringCellValue());
		testDataRow.put("PhoneNumber", ws.getRow(i).getCell(6).getRawValue());
		testDataRow.put("Gender", ws.getRow(i).getCell(7).getStringCellValue());
		testDataRow.put("Hobbies", ws.getRow(i).getCell(8).getStringCellValue());
		testDataRow.put("Languages", ws.getRow(i).getCell(9).getStringCellValue());
		testDataRow.put("Skills", ws.getRow(i).getCell(10).getStringCellValue());
		testDataRow.put("Country", ws.getRow(i).getCell(11).getStringCellValue());
		testDataRow.put("SelectCountry", ws.getRow(i).getCell(12).getStringCellValue());
		testDataRow.put("DOB_YY", ws.getRow(i).getCell(13).getRawValue());
		testDataRow.put("DOB_MM", ws.getRow(i).getCell(14).getStringCellValue());
		testDataRow.put("DOB_DD", ws.getRow(i).getCell(15).getRawValue());
		testDataRow.put("Password", ws.getRow(i).getCell(16).getStringCellValue());
		testDataRow.put("confirm Password", ws.getRow(i).getCell(17).getStringCellValue());
		return testDataRow;

	}

}
