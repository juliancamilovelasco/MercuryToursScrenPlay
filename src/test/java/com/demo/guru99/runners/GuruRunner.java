package com.demo.guru99.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/features/register.feature",
        glue = "com.demo.guru99.stepdefinions",
        snippets = SnippetType.CAMELCASE)

public class GuruRunner {

}
