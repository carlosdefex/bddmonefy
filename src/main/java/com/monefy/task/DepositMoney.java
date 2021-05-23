package com.monefy.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.Arrays;

import static com.monefy.components.Index.*;
import static com.monefy.components.NewEntryComponent.SELECTNUM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DepositMoney implements Task {

    private int number;

    public DepositMoney(int number) {
        this.number = number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(BTN_TUTORIAL);
        Click.on(BTN_ADD_ENTRY);
        Arrays.stream(numberArray(number))
                .forEach(e -> Click.on(SELECTNUM.of(String.valueOf(e))));
        Click.on(BTN_SELECT_CATEGORY);
    }

    public static DepositMoney newEntry(int number) {
        return instrumented(DepositMoney.class, number);
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
