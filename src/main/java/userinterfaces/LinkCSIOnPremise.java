package userinterfaces;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://10.71.24.146/Login")
public class LinkCSIOnPremise extends PageObject {


    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.id("username"));

    public static final Target CAMPO_CONTRASENA = Target.the("campo contraseña")
            .located(By.id("password"));

    public static final Target BOTON_INGRESAR = Target.the("botón ingresar")
            .located(By.id("login-button"));
}

