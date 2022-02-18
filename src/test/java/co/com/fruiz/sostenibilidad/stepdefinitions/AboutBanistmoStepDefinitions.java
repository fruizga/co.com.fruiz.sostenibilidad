package co.com.fruiz.sostenibilidad.stepdefinitions;

import co.com.fruiz.sostenibilidad.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AboutBanistmoStepDefinitions {


    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}

    @Dado("^que Faber quiere descargar el PDF  \"([^\"]*)\" de sostenibilidad$")
    public void queFaberQuiereDescargarElPDFDeSostenibilidad(String arg1) {
        OnStage.theActorCalled("Faber").wasAbleTo(OpenUp.thePage());
    }


    @Cuando("^busca el documento el PDF  \"([^\"]*)\" de sostenibilidad$")
    public void buscaElDocumentoElPDFDeSostenibilidad(String arg1) {

    }

    @Entonces("^encuentra y descarga el PDF  \"([^\"]*)\" de sostenibilidad$")
    public void encuentraYDescargaElPDFDeSostenibilidad(String arg1) {

    }
}
