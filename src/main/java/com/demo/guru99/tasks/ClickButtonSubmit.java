package com.demo.guru99.tasks;

import com.demo.guru99.userInterfaces.ButtonSubmitHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButtonSubmit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ButtonSubmitHomePage.BUTTON_SUBMIT));
    }

    public static ClickButtonSubmit clickButtonSubmit () {
        return instrumented(ClickButtonSubmit.class);
    }
}
