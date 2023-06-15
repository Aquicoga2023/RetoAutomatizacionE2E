package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class WaitFor implements Task {
    private int seconds;

    public WaitFor(int seconds) {
        this.seconds = seconds;
    }

    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep((this.seconds * 1000));
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

    }

    public static Performable seconds(int i) {
        return Tasks.instrumented(WaitFor.class, i);
    }
}

