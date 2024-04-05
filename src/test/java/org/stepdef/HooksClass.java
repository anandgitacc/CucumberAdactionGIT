package org.stepdef;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	@Before
	public void browser() {
		browserLaunch("https://adactinhotelapp.com/");
		System.out.println("browser should be launched 1st");
	}
	
	@After
	public void cucumberScreenshot(Scenario scenario) {
//		if (scenario.isFailed()) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
//		}
	}
	
//	@After
//	public static void tearDown(Scenario scenario) {
//        //validate if scenario has failed
//        if(scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) driver.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName()); 
//        } 
	

}
