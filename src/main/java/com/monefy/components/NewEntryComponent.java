package com.monefy.components;

import net.serenitybdd.screenplay.targets.Target;

public class NewEntryComponent {

    public static final Target SELECTNUM = Target.the("Select Num")
            .locatedBy("com.monefy.app.lite:id/buttonKeyboard{0}");
}
