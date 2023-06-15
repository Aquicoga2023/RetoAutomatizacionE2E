package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PickCategory implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        String categoria= t.recall("categoria");
        Target CATEGORY_ITEM = Target.the(categoria).located(By.xpath("//*[text()='"+categoria+"']"));
        t.attemptsTo(Click.on(CATEGORY_ITEM),WaitFor.seconds(3));

    }
}
