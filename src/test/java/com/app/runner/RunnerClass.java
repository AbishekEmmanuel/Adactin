package com.app.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Downloads\\eclipse-java-2025-12-R-win32-x86_64\\eclipse\\CucumberPom\\src\\test\\java\\com\\app\\feature\\Adaction.feature",
                 glue = "com.app.StepDefinition",
                 dryRun = false,
                 plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
                 publish = true,
                 monochrome = true
                 )
                 
public class RunnerClass {
  "Hi"

}
