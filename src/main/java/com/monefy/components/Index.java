package com.monefy.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Index {
    public static final Target BTN_ADD_ENTRY = Target.the("Ingrese new entry")
            .located(By.id("com.monefy.app.lite:id/income_button"));
    public static final Target BTN_TUTORIAL = Target.the("Ingrese new entry")
            .locatedBy(".//android.widget.LinearLayout/following-sibling::android.widget.FrameLayout/android.widget.TextView");
}
