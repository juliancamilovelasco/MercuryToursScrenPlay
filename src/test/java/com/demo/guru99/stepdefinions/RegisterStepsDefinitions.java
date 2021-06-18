package com.demo.guru99.stepdefinions;

import com.demo.guru99.models.Data;
import com.demo.guru99.tasks.*;
import com.demo.guru99.userInterfaces.RegisterHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor julian = Actor.named("julian");

    @Before
    public void setUp() {
        julian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^That Julian want to create a new account$")
    public void thatJulianWantToCreateANewAccount() {
        julian.wasAbleTo(OpenTheBrowser.on());
        julian.wasAbleTo(ClickRegisterLink.click());
    }

    @When("^He Fills all box$")
    public void heFillsAllBox(List<Data> dataList) throws InterruptedException {
        julian.attemptsTo(new CreateNewAccount(dataList.get(0)));
        Thread.sleep(3000);
        julian.attemptsTo(ClickButtonSubmit.clickButtonSubmit());
    }

    @Then("^He should see (.*)$")
    public void heShouldSee(String message) {
        julian.wasAbleTo(SuccessfulRegistration.RegistrationOk(message));

    }

}
