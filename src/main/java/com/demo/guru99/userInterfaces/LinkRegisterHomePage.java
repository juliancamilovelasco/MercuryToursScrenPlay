package com.demo.guru99.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LinkRegisterHomePage extends PageObject {
    public static final Target REGISTER_LINK = Target.the("Link Register").locatedBy("(//a[@href='register.php'])[2]");
}
