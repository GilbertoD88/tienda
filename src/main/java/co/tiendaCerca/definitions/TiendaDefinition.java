package co.tiendaCerca.definitions;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.logs.Log;
import co.tiendaCerca.pages.*;
import java.io.FileInputStream;
import java.util.Properties;

public class TiendaDefinition {
    private Properties prop = new Properties();

    public void abrirNavegador() {
        Log.writeOperationStarted("Abrir pagina 'Tienda'");
        try {
            prop.load(new FileInputStream("src/main/resources/properties/configuration.properties"));
            WebBrowserController.launchWebApp(prop.getProperty("TIENDA.APPURL"));
            Log.writeOperationCompleted();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void seleccionarCiudad(String ciudad) {
        Log.writeOperationStarted("Seleccion de ciudad");
        try {
            IngresoPage ingresoPage =new IngresoPage();
            ingresoPage.selectCity(ciudad);
            ingresoPage.clickBotonContinuar();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void seleccionarTipoUsuario(String tipoUsuario) {
        Log.writeOperationStarted("Seleccion de usuario tipo: ".concat(tipoUsuario));
        try {
            TipoUsuarioPage tipoUsuarioPage =new TipoUsuarioPage();
            if (tipoUsuario.equals("Consumidor")) {
                tipoUsuarioPage.clickBotonConsumidor();
            }else {
                tipoUsuarioPage.clickBotonTendero();
            }
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void enviarNumeroCelular(String numCelular) {
        Log.writeOperationStarted("Envio de numero celular ".concat(numCelular));
        try {
            DatosBasicosPage datosBasicosPage =new DatosBasicosPage();
            datosBasicosPage.ingresarCelular(numCelular);
            datosBasicosPage.clickIngresar();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void aceptarTerminosYPoliticas(){
        Log.writeOperationStarted("Aceptando terminos y condiciones");
        try{
            PoliticasYTerminosPage politicasYTerminosPage = new PoliticasYTerminosPage();
            politicasYTerminosPage.checkTerminosYCondiciones();
            politicasYTerminosPage.checkPoliticas();
            politicasYTerminosPage.clickBotonContinuar();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void datosBasicos(String nombre, String apellido, String correo){
        Log.writeOperationStarted("Diligenciamiento de datos basicos");
        Log.LOGGER.info("Nombre: ".concat(nombre));
        Log.LOGGER.info("Apellidos: ".concat(apellido));
        Log.LOGGER.info("Correo electronico: ".concat(correo));
        try{
            DatosBasicosPage datosBasicosPage = new DatosBasicosPage();
            datosBasicosPage.enviarNombre(nombre);
            datosBasicosPage.enviarApellido(apellido);
            datosBasicosPage.enviarEmail(correo);
            datosBasicosPage.clicksiguiente();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void enviarDireccion(String direccion){
        Log.writeOperationStarted("Envio de direccion: ".concat(direccion));
        try{
            DatosBasicosPage datosBasicosPage = new DatosBasicosPage();
            datosBasicosPage.clickIngresarDireccion();
            datosBasicosPage.enviarDireccion(direccion);
            datosBasicosPage.seleccionarUbicacion();
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

    public void obtenerTextoResultado(){
        Log.writeOperationStarted("Obtencion de texto final");
        boolean resultadoWeb;
        try{
            ResultadoRegistro resultadoRegistro = new ResultadoRegistro();
            resultadoWeb = resultadoRegistro.getResultadoRegistro();
            if (resultadoWeb){
                Log.writeOperationCompleted();
            }
        }catch (Exception e){
            Log.writeOperationExeption(e.getMessage());
        }
    }

}
