package co.com.fruiz.sostenibilidad.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class Answer implements Question<Boolean> {
    private String question;

    public  Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String namePdf;
        namePdf = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (question.equals(namePdf)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
