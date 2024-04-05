package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target\\failedscenarios.txt"}, 
					glue = "org.stepdef",
		// plugin = {"pretty","json:src\\test\\resources\\Reports\\sample1.json"},
		plugin = { "pretty","rerun:target\\failedscenarios.txt" }, 
		monochrome = true, 
		tags = "@Loginpage"
		)
public class RerunFailedScenario {

}
