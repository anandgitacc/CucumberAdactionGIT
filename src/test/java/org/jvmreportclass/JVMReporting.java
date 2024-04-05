package org.jvmreportclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReporting {
	
	public static void genJVMReport(String jsonFile) {
		
		// 1. to mention the path of the jvm report to be generated
		File file = new File("C:\\Users\\Welcome\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\Reports");
		
		// 2. to create object for Configuration:C -> addClassification()
		Configuration configuration = new Configuration(file, "FB login validation");
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "117");
		configuration.addClassifications("Test Number", "4");
		configuration.addClassifications("Sprint Number", "23");
		
		// 3. to add json files into list
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		// 4. to create object for ReportBuilder:C
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		// 5. to generate the report
		builder.generateReports();
		
	}

}
