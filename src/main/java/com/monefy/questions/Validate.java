package com.monefy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.monefy.components.Index.BTN_ADD_ENTRY;

public class Validate implements Question<Boolean> {

    public static Validate buttonPresent() {
        return new Validate();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean response = false;
        if(BTN_ADD_ENTRY.resolveAllFor(actor).isEmpty()){
            response = true;
        }
        return response;
    }
}
