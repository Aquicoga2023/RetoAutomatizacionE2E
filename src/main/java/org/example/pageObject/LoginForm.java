package org.example.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginForm extends PageObject {

    public static final Target USERNAME = Target.the("username").located(By.id("loginusername"));
    public static final Target PASSWORD = Target.the("password").located(By.id("loginpassword"));

    public static final Target LOGINBTN = Target.the("Log in").located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
}
