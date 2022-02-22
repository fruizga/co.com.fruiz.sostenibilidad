package co.com.fruiz.sostenibilidad.stepdefinitions;

import co.com.fruiz.sostenibilidad.questions.Answer;
import co.com.fruiz.sostenibilidad.tasks.AboutUs;
import co.com.fruiz.sostenibilidad.tasks.OpenUp;
import co.com.fruiz.sostenibilidad.tasks.SwitchToNewWindow;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AboutBanistmoStepDefinitions {


    @Before
    public void setStage () {
        setTheStage(new OnlineCast());}

    @Dado("^que Faber quiere descargar el PDF  \"([^\"]*)\" de sostenibilidad$")
    public void queFaberQuiereDescargarElPDFDeSostenibilidad(String arg1) {
        theActorCalled("Faber").wasAbleTo(OpenUp.thePage());
    }


    @Cuando("^busca el documento el PDF  \"(.*)\" de sostenibilidad$")
    public void buscaElDocumentoElPDFDeSostenibilidad(String arg1) {
        theActorInTheSpotlight().attemptsTo(AboutUs.onThePage());
        theActorInTheSpotlight().attemptsTo(SwitchToNewWindow.switchToNewTab());
    }

    @Entonces("^encuentra y descarga el PDF  (.*) de sostenibilidad$")
    public void encuentraYDescargaElPDFDeSostenibilidad(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
