package com.flipkart.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//resources//Features",
                  glue = "com.flipkart.stepdefinitions",
                  plugin = "html:target",
                  monochrome = true,
                  dryRun = false,
                  tags = "@Sanity")

public class TestRunner {

}

 