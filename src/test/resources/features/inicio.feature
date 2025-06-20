#Author: Wichigan
#language: es

  @Escenario1
  Característica: Iniciar sesión de usuario

    Yo como usuario deseo poder ingresar a la página CSI.

    Escenario: Usuario inicia sesión con credenciales válidas
      Dado que el usuario ingresa su nombre de usuario "90048104" y su contrasena "Julio-182026**"
      Cuando el usuario intenta iniciar sesion
      Entonces el sistema valida el acceso
