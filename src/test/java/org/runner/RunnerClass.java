package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreportclass.JVMReporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles", 
					glue="org.stepdef",
//					plugin = {"pretty","json:src\\test\\resources\\Reports\\sample1.json"},
//					plugin = {"pretty","rerun:src\\test\\resources\\Reports\\failedscenarios.txt"},
					plugin = {"pretty","rerun:target\\failedscenarios.txt"},
					monochrome = true,
					tags = "@Loginpage"
					)
public class RunnerClass {
	
	@AfterClass
public static void reportGeneration() {
	JVMReporting.genJVMReport("C:\\Users\\Welcome\\eclipse-workspace\\CucumberAdactin\\"
			+ "src\\test\\resources\\Reports\\sample1.json");
}
	
}

