package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1
	public static void browserLaunch(String url) {
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
//		driver.manage().window().maximize();
	}

	// 2
	public static WebElement findElementID(String id) {
		WebElement elementID = driver.findElement(By.id(id));
		return elementID;
	}

	// 3
	public static WebElement findElementName(String name) {
		WebElement elementName = driver.findElement(By.name(name));
		return elementName;
	}
	
	public static WebElement findElementXpath(String xpath) {
		WebElement elementXpath = driver.findElement(By.xpath(xpath));
		return elementXpath;
	}

	// 4
	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 5
	// to get the test data from excel file
	public static String getDataFromExcel(String pathName, String sheetName, int rowNo, int cellNo) throws IOException {
		String data = null;
		File file = new File(pathName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);

		// cell data read -> 3 => String / Nunmeric / Date
		int cellType = cell.getCellType();

		if (cellType == 1) {
			data = cell.getStringCellValue();
		}

		if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
				data = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long lvalue = (long) numericCellValue;
				data = String.valueOf(lvalue);
			}

		}

		return data;
	}
	
	
	// 6
	// drop down -> select index
	public static void selectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	// 7
	// drop down -> print all option
	public static void printDropdown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	}
	
	// 8
	public static void jsSetData(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	
	
	
	
	
	
	
	

}
