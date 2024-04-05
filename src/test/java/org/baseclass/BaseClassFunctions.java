package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClassFunctions extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		browserLaunch("https://en-gb.facebook.com/");
		
//		String dataFromExcel = b.getDataFromExcel("C:\\Users\\Welcome\\eclipse-workspace\\MavenProject10amSep\\"
//				+ "src\\test\\resources\\ExcelFiles\\Framework.xlsx", "TestData", 1, 3);
//		
//		b.sendValues(b.findElementID("email"), dataFromExcel);
		
		WebElement username = findElementID("email");
		
		jsSetData(username, "js data");
		
	}

}
