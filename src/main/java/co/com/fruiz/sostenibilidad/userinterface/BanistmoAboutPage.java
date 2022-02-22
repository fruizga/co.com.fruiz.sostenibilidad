package co.com.fruiz.sostenibilidad.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BanistmoAboutPage extends PageObject {
    public static final Target ABOUT_BUTTON = Target.the("Opción Acerca de " +
            "nosotros").located(By.xpath("//*[@id=\"menu-top\"]/div/ul[1]/li[4]/a"));
    public static final Target CORP_INFO = Target.the("Opción de información " +
            "corporativa").located(By.xpath("//*[@data-toggle=\"dropdown\"]"));
    public static final Target SUSTAIN_OPTION = Target.the("Opción " +
            "sostenibilidad").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/ul[3]/li[1]/a"));
    public static final Target GENERATION_OPTION = Target.the("Opcion para mostrar lista de " +
            "ediciones de boletines").located(By.xpath("//*[@id=\"filialTabs\"]/li[5]/a"));
    public static final Target DOCUMENT_DOWNLOAD = Target.the("Icono para descargar PDF" +
            " de la edición N° 9").located(By.xpath("//*[@id=\"tab5\"]/table/tbody/tr[1]/td[2]/span/a/img"));

}
