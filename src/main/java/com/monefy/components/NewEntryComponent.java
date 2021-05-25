package com.monefy.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewEntryComponent {

    public static final Target SELECTNUM = Target.the("Select Num")
            .locatedBy(".//android.widget.Button[@resource-id='com.monefy.app.lite:id/buttonKeyboard{0}']");
    public static final Target BTN_SELECT_CATEGORY = Target.the("Ingrese new entry")
            .located(By.id("com.monefy.app.lite:id/keyboard_action_button"));
    public static final Target SELECT_CATEGORY = Target.the("Select Category")
            .locatedBy(".//android.widget.TextView[@text='{0}']/..");
}
