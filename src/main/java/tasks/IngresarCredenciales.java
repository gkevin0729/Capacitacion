package tasks;



import models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LinkCSIOnPremise;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCredenciales implements Task {

    private final Credenciales credenciales;

    public IngresarCredenciales(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public static IngresarCredenciales con(Credenciales credenciales) {
        return instrumented(IngresarCredenciales.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credenciales.getUsuario()).into(LinkCSIOnPremise.CAMPO_USUARIO),
                Enter.theValue(credenciales.getContrasena()).into(LinkCSIOnPremise.CAMPO_CONTRASENA),
                Click.on(LinkCSIOnPremise.BOTON_INGRESAR)
        );
    }
}

