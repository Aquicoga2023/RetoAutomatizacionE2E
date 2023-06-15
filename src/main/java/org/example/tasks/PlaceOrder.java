package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.DB_MainPage;
import org.example.pageObject.LoginForm;
import org.example.pageObject.OrderForm;
import org.mockito.internal.matchers.Or;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlaceOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T t)
    {
        String name= t.recall("Name");
        String country = t.recall("Country");
        String city = t.recall("City");
        String creditcard = t.recall("Creditcard");
        String month = t.recall("Month");
        String Year = t.recall("Year");

        t.attemptsTo(
                WaitFor.seconds(3),
                WaitUntil.the(DB_MainPage.CART,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(DB_MainPage.CART)
                /*
                WaitFor.seconds(5),
                WaitUntil.the(DB_MainPage.PLACE_ORDER,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(DB_MainPage.PLACE_ORDER),
                WaitUntil.the(OrderForm.NAME,isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(OrderForm.NAME),
                Enter.theValue(name).into(OrderForm.COUNTRY),
                Enter.theValue(name).into(OrderForm.CITY),
                Enter.theValue(name).into(OrderForm.CARD),
                Enter.theValue(name).into(OrderForm.MONTH),
                Enter.theValue(name).into(OrderForm.YEAR),
                WaitUntil.the(OrderForm.PURCHASE,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OrderForm.PURCHASE)
                */

        );
    }
}
