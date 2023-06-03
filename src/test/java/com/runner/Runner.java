package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// hooks

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature"
				,glue = "com\\step"
				,tags = {"@AdminTest"}         //{"@LoginTest, @AdminTest"}
        		//,dryRun = true
        		,monochrome = true
        		)
public class Runner {
	

}
