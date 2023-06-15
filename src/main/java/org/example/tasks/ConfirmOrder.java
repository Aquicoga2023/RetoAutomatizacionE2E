package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.DB_MainPage;
import org.example.pageObject.OrderForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
            t.attemptsTo(
                    WaitUntil.the(OrderForm.BTN_OK,isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(OrderForm.BTN_OK),
                    WaitUntil.the(DB_MainPage.CATEGORIES,isVisible()).forNoMoreThan(20).seconds()
            );
    }
}
