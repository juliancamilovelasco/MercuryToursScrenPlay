package com.demo.guru99.tasks;

import com.demo.guru99.userInterfaces.GuruHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    @Override
    @Step("{0} opens the browser on Google Home Page")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new GuruHomePage()));

    }

    public static OpenTheBrowser on() {
        return instrumented(OpenTheBrowser.class);
    }



}
