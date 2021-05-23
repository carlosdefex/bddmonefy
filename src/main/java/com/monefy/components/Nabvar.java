package com.monefy.components;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Nabvar {

    public final static Target BTNMENU = Target.the("Enter the Menu")
            .located(By.id("com.monefy.app.lite:id/overflow"));
    public final static Target SUBMENU = Target.the("Enter the Sub-Menu ")
            .locatedBy(".//android.widget.TextView[@resource-id='com.monefy.app.lite:id/{0}_textview']");
}
