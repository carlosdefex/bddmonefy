package com.monefy.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/change_currency.feature",
        glue = "com.monefy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ChangeCurrency {
}
