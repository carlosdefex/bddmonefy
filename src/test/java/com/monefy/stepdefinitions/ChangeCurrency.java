package com.monefy.stepdefinitions;

import com.monefy.task.EnterTheMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ChangeCurrency {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the {string} is at Menu in {word}")
    public void iAmAtMenuInConfiguracion(String actor, String subMenu) {
        theActorCalled(actor).attemptsTo(
                EnterTheMenu.opcion(subMenu)
        );
    }

    @When("I want to change currency for {string}")
    public void iWantToChangeCurrencyFor(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I will could to look {word}")
    public void iWillCouldToLookCOP(String currency) {
        // Write code here that turns the phrase above into concrete actions

    }
}
