package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class VisitWebPage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String url = actor.recall("baseURL");

        actor.attemptsTo(Open.url(url), WaitFor.seconds(3));

    }
}
