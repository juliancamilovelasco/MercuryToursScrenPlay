package com.demo.guru99.tasks;

import com.demo.guru99.userInterfaces.LinkRegisterHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRegisterLink implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinkRegisterHomePage.REGISTER_LINK));
    }

    public static ClickRegisterLink click () {
        return instrumented(ClickRegisterLink.class);
    }


}
