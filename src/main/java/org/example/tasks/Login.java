package org.example.tasks;

import lombok.extern.java.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.DB_MainPage;
import org.example.pageObject.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        String user=t.recall("username");
        String password= t.recall("password");

        t.attemptsTo(Click.on(DB_MainPage.LOGINBTN),
                WaitUntil.the(LoginForm.USERNAME,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(user).into(LoginForm.USERNAME),
                WaitUntil.the(LoginForm.PASSWORD,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(password).into(LoginForm.PASSWORD),
                Click.on(LoginForm.LOGINBTN),
                WaitUntil.the(DB_MainPage.NAMEOFUSER,isVisible()).forNoMoreThan(20).seconds()

        );

    }
}
