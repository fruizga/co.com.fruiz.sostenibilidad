package co.com.fruiz.sostenibilidad.questions;

import co.com.fruiz.sostenibilidad.userinterface.ConfirmationPage;
import co.com.fruiz.sostenibilidad.userinterface.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    private ConfirmationPage confirmationPage;

    public  Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        //String namePDF = Text.of(String.valueOf(confirmationPage)).viewedBy(actor).asString();
        //String namePDF = confirmationPage;
        if (question.equals(confirmationPage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
