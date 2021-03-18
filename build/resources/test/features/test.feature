Feature: Registro tienda cerca

  @test
  Scenario Outline: Registrarse de forma exitosa en la tienda cerca
    Given que quiero registrarme en la tienda cerca ingreso a la pagina
    When selecciono la ciudad "<ciudad>"
    And el tipo de usuario "<consumidor>"
    And diligencio numero telefonico "<celular>"
    And acepto terminos y condiciones
    And diligencio campos "<nombre>" "<apellido>" "<email>"
    And seleciono la direccion "<direccion>"
    Then Visualizo el mensaje de registro exitoso

    Examples:
      |ciudad|consumidor|celular|nombre|apellido|email|direccion|
      |Bogotá|Consumidor|3017211000|pedro pablo|zapata garcia|pedrozapata01@gmail.com|Cra. 13 #96-67|