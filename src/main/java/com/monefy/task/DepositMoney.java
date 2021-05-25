package com.monefy.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Arrays;

import static com.monefy.components.Index.BTN_ADD_ENTRY;
import static com.monefy.components.NewEntryComponent.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DepositMoney implements Task {

    private int number;
    private String category;

    public DepositMoney(int number, String category) {
        this.number = number;
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADD_ENTRY));
        Arrays.stream(numberArray(number))
                        .forEach(e -> actor.attemptsTo(Click.on(SELECTNUM.of(String.valueOf(e)))));
        actor.attemptsTo(
                Click.on(BTN_SELECT_CATEGORY),
        Click.on(SELECT_CATEGORY.of(category)));
    }

    public static DepositMoney newEntry(int number, String category) {
        return instrumented(DepositMoney.class, number, category);
    }

    private int[] numberArray(int num) {
        int j = 0;
        int length = Integer.toString(num).length();
        int[] arr = new int[length];
        while (num != 0) {
            arr[length - j - 1] = num % 10;
            num = num / 10;
            j++;
        }
        return arr;
    }
}
