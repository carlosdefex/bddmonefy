package com.monefy.components;

import net.serenitybdd.screenplay.targets.Target;


public class Index {
    public static final Target BTN_ADD_ENTRY = Target.the("Ingrese new entry")
            .locatedBy(".//android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.monefy.app.lite:id/income_button_title']");
    public static final Target BTN_TUTORIAL = Target.the("Ingrese new entry")
            .locatedBy(".//android.widget.LinearLayout/following-sibling::android.widget.FrameLayout/android.widget.TextView");
    public static final Target BTN_SELECT_CATEGORY = Target.the("Ingrese new entry")
            .locatedBy("com.monefy.app.lite:id/keyboard_action_button");
}
