package co.tiendaCerca.steps;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.definitions.TiendaDefinition;
import co.tiendaCerca.utils.AssertionsManager;
import co.tiendaCerca.utils.ExecutionInformation;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class TiendaCerca {

    private final TiendaDefinition tiendaDefinition = new TiendaDefinition();

    @Before
    public void setUp(Scenario scenario) throws IOException {
        ExecutionInformation.setExecutionInformation(scenario);
        AssertionsManager.initAsserts();
    }

    @After
    public void tearDown() {
        AssertionsManager.assertAll();
        WebBrowserController.closeWebApp();
    }

    @Given("^que quiero registrarme en la tienda cerca ingreso a la pagina$")
    public void que_quiero_registrarme_en_la_tienda_cerca_ingreso_a_la_pagina() {
        tiendaDefinition.abrirNavegador();
    }

    @When("^selecciono la ciudad \"([^\"]*)\"$")
    public void selecciono_la_ciudad(String ciudad) {
        tiendaDefinition.seleccionarCiudad(ciudad);
    }

    @When("^el tipo de usuario \"([^\"]*)\"$")
    public void el_tipo_de_usuario(String tipoUsuario) {
        tiendaDefinition.seleccionarTipoUsuario(tipoUsuario);
    }

    @When("^diligencio numero telefonico \"([^\"]*)\"$")
    public void diligencio_numero_telefonico(String celular)  {
        tiendaDefinition.enviarNumeroCelular(celular);
    }

    @When("^acepto terminos y condiciones$")
    public void acepto_terminos_y_condiciones() {
        tiendaDefinition.aceptarTerminosYPoliticas();
    }

    @When("^diligencio campos \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void diligencio_campos(String nombre, String apellido, String email) {
        tiendaDefinition.datosBasicos(nombre,apellido,email);
    }

    @When("^seleciono la direccion \"([^\"]*)\"$")
    public void seleciono_la_direccion(String direccion) {
        tiendaDefinition.enviarDireccion(direccion);
    }

    @Then("^Visualizo el mensaje de registro exitoso$")
    public void visualizo_el_mensaje_de_registro_exitoso()  {
        tiendaDefinition.obtenerTextoResultado();
    }


}
