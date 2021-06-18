package com.demo.guru99.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonSubmitHomePage extends PageObject {
    public static final Target BUTTON_SUBMIT = Target.the("Button Submit").located(By.name("submit"));
}
