package org.example.stepsdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.example.question.LoginSuccess;
import org.example.question.MainPage;
import org.example.tasks.*;
import org.example.utils.CucumberTable;
import org.example.utils.EnvConf;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class demoBlazeStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Steps
    EnvConf envConf;

    @Dado("que soy un usuario registrado en Demoblaze")
    public void queSoyUnUsuarioRegistradoEnDemoblaze()
    {
        Actor actor =theActorCalled("Aaron");
        envConf.setUpall(theActorInTheSpotlight());
        theActorInTheSpotlight().attemptsTo(new VisitWebPage());
        theActorInTheSpotlight().should(seeThat(MainPage.displayed(), CoreMatchers.equalTo("CATEGORIES")));
        theActorInTheSpotlight().attemptsTo(new Login());
        theActorInTheSpotlight().should(seeThat(LoginSuccess.displayed(),CoreMatchers.equalTo("Welcome "+actor.recall("username"))));

    }

    @Cuando("realizo una compra de {int} productos en la categoria {string}")
    public void realizoUnaCompraDeCantProdsProductosEnLaCategoriaCategoria(int cantidad,String categoria) {
        theActorInTheSpotlight().remember("cantidad",cantidad);
        theActorInTheSpotlight().remember("categoria",categoria);
        theActorInTheSpotlight().attemptsTo(new PickCategory());
        theActorInTheSpotlight().attemptsTo(new PickItem());


    }

    @Y("completo el formulario")
    public void completoElFormulario(DataTable dataTable)
    {

        CucumberTable.rememberTableValues(dataTable);
        theActorInTheSpotlight().attemptsTo(new PlaceOrder());

    }

    @Entonces("valido que la compra se haya realizado de forma satisfactoria")
    public void validoQueLaCompraSeHayaRealizadoDeFormaSatisfactoria()
    {
        theActorInTheSpotlight().attemptsTo(new ConfirmOrder());
    }
}
