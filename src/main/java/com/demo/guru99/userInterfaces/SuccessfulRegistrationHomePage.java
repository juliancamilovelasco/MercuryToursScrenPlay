package com.demo.guru99.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SuccessfulRegistrationHomePage extends PageObject {
    public static final Target REGISTER_OK = Target.the("Register Ok").locatedBy("(//font[@face])[3]/a");
}
