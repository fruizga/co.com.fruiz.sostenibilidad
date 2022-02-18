package co.com.fruiz.sostenibilidad.tasks;

import co.com.fruiz.sostenibilidad.userinterface.BanistmoAboutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.security.Key;

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