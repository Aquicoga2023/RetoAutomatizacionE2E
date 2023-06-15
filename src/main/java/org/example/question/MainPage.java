package org.example.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.DB_MainPage;
import org.example.pageObject.LoginForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MainPage implements Question {

    public static Question<String> displayed() {
        return new MainPage();
    }
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(DB_MainPage.CATEGORIES,isVisible()).forNoMoreThan(10).seconds();
        return Text.of(DB_MainPage.CATEGORIES).answeredBy(actor);
    }
}
