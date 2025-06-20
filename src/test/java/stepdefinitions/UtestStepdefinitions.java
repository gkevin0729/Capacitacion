package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirPagina;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UtestStepdefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa su nombre de usuario {string} y su contrasena {string}")
    public void que_el_usuario_ingresa_su_nombre_de_usuario_y_su_contrasena(String string, String string2) {
        theActorCalled("Kevin").wasAbleTo(AbrirPagina.paginaCSI());


    }
    @Cuando("el usuario intenta iniciar sesion")
    public void el_usuario_intenta_iniciar_sesion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("el sistema valida el acceso")
    public void el_sistema_valida_el_acceso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}


