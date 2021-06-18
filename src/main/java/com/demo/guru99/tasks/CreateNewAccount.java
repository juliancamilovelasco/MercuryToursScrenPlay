package com.demo.guru99.tasks;

import com.demo.guru99.models.Data;
import com.demo.guru99.userInterfaces.RegisterHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.demo.guru99.userInterfaces.RegisterHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewAccount implements Task {

        Data data;

        public CreateNewAccount(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.getFirstName()).into(FIRST_NAME));
        actor.attemptsTo(Enter.theValue(data.getLastName()).into(LAST_NAME));
        actor.attemptsTo(Enter.theValue(data.getPhone()).into(PHONE));
        actor.attemptsTo(Enter.theValue(data.getEmail()).into(EMAIL));
        actor.attemptsTo(Enter.theValue(data.getAddress1()).into(ADDRESS1));
        actor.attemptsTo(Enter.theValue(data.getCity()).into(CITY));
        actor.attemptsTo(Enter.theValue(data.getState()).into(STATE));
        actor.attemptsTo(Enter.theValue(data.getPostalCode()).into(POSTAL_CODE));
        actor.attemptsTo(Enter.theValue(data.getUserName()).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(data.getPassword()).into(PASSWORD));
        actor.attemptsTo(Enter.theValue(data.getConfirmPassword()).into(CONFIRM_PASSWORD));
    }

    public static CreateNewAccount fillIn(Data data) {
        return instrumented(CreateNewAccount.class);
    }
}
