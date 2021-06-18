package com.demo.guru99.tasks;

import com.demo.guru99.userInterfaces.SuccessfulRegistrationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SuccessfulRegistration implements Task {

    private String message;

    public SuccessfulRegistration(String message){
        this.message = message;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(SuccessfulRegistrationHomePage.REGISTER_OK).text().isEqualTo(message));

    }

    public static SuccessfulRegistration RegistrationOk(String message) {
        return instrumented(SuccessfulRegistration.class, message);
    }
}
