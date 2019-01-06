package com.tt.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"},
		glue= {"com.tt.stepdef"}
		//tags= {""}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
