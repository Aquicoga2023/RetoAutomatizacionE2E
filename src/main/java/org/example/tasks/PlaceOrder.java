package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
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
        String year = t.recall("Year");

        t.attemptsTo(
                WaitFor.seconds(3),
                WaitUntil.the(DB_MainPage.CART,isClickable()).forNoMoreThan(20).seconds(),
                Open.url("https://www.demoblaze.com/cart.html")
                );
        t.attemptsTo(
                WaitFor.seconds(5),
                WaitUntil.the(DB_MainPage.PLACE_ORDER,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(DB_MainPage.PLACE_ORDER),
                WaitUntil.the(OrderForm.NAME,isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(OrderForm.NAME),
                Enter.theValue(country).into(OrderForm.COUNTRY),
                Enter.theValue(city).into(OrderForm.CITY),
                Enter.theValue(creditcard).into(OrderForm.CARD),
                Enter.theValue(month).into(OrderForm.MONTH),
                Enter.theValue(year).into(OrderForm.YEAR),
                WaitUntil.the(OrderForm.PURCHASE,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OrderForm.PURCHASE)
        );
    }
}
