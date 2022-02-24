package co.com.fruiz.sostenibilidad.tasks;

import co.com.fruiz.sostenibilidad.userinterface.BanistmoAboutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AboutUs implements Task {
    public static AboutUs onThePage() {return Tasks.instrumented(AboutUs.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BanistmoAboutPage.ABOUT_BUTTON),
                Click.on(BanistmoAboutPage.CORP_INFO),
                Click.on(BanistmoAboutPage.SUSTAIN_OPTION),
                Click.on(BanistmoAboutPage.GENERATION_OPTION),
                Click.on(BanistmoAboutPage.DOCUMENT_DOWNLOAD)

        );
    }
}