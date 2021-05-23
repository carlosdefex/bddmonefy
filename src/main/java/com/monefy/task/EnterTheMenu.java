package com.monefy.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.monefy.components.Nabvar.BTNMENU;
import static com.monefy.components.Nabvar.SUBMENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterTheMenu implements Task {

    private String subMenu;

    public EnterTheMenu(String subMenu){
        this.subMenu = subMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(BTNMENU);
        Click.on(SUBMENU.of(subMenu));
    }

    public static EnterTheMenu opcion(String subMenu){
        return instrumented(EnterTheMenu.class, subMenu);
    }
}
