package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.LinkCSIOnPremise;



public class AbrirPagina implements Task {
    private LinkCSIOnPremise paginaCSI;

    public static Performable paginaCSI() {
        return Tasks.instrumented(AbrirPagina.class);
    }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(paginaCSI));
        }

}
