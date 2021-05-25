package com.monefy.stepdefinitions;

import com.monefy.questions.Validate;
import com.monefy.task.DepositMoney;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class NewEntryStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I enter a new amount of {int} of {word} category")
    public void add(int num, String category) {
        theActorCalled("test").attemptsTo(
        DepositMoney.newEntry(num, category));
    }

    @Then("I will see the amount reflected in balance")
    public void balanceCorrectly() {
        Validate.buttonPresent();
    }
}
