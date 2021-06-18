package com.demo.guru99.userInterfaces;

import com.demo.guru99.models.Data;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class RegisterHomePage extends PageObject {

        public static final Target FIRST_NAME = Target.the("Box firstName").located(By.name("firstName"));
        public static final Target LAST_NAME = Target.the("Box lastName").located(By.name("lastName"));
        public static final Target PHONE = Target.the("Box phone").located(By.name("phone"));
        public static final Target EMAIL = Target.the("Box email").located(By.name("userName"));
        public static final Target ADDRESS1 = Target.the("Box address1").located(By.name("address1"));
        public static final Target CITY = Target.the("Box city").located(By.name("city"));
        public static final Target STATE = Target.the("Box state").located(By.name("state"));
        public static final Target POSTAL_CODE = Target.the("Box postalCode").located(By.name("postalCode"));
        public static final Target USER_NAME = Target.the("Box postalCode").located(By.name("email"));
        public static final Target PASSWORD = Target.the("Box password").located(By.name("password"));
        public static final Target CONFIRM_PASSWORD = Target.the("Box confirmPassword").located(By.name("confirmPassword"));
        public static final Target BUTTON_SUBMIT = Target.the("Button Submit").located(By.name("submit"));





}
