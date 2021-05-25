package com.monefy.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/new_entry.feature",
        glue = "com.monefy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class NewEntryStepDefinitionRunner {
}
