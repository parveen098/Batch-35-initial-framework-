package com.cucumber.BDD;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"jason:/target/cucumber.json"},
		features = {"./src/test/resources/login.feature"},
		glue = {"com.cucumber.BDD"},
		tags = "@smoke"
		
		
		)


public class Runnerfile extends AbstractTestNGCucumberTests {
	
	
	
	
	

}
