package co.tiendaCerca.pages;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.controllers.WebElementController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DatosBasicosPage {

    @FindBy(how = How.ID, using = "abi-phone")
    private WebElement inputCelular;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Ingresar']")
    private WebElement botonIngresar;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Ingresa dirección']")
    private WebElement botonIngresarDireccion;

    @FindBy(how = How.ID, using = "register-name")
    private WebElement inputNombre;

    @FindBy(how = How.ID, using = "register-lastName")
    private WebElement inputApellido;

    @FindBy(how = How.ID, using = "register-email")
    private WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Siguiente']")
    private WebElement botonSiguiente;

    @FindBy(how = How.ID, using = "address")
    private WebElement inputDireccion;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Lugares cercanos')]/..//li")
    private WebElement recomDireccion;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']/span[text()='Seleccionar ubicación']")
    private WebElement botonSeleccionarUbicacion;

    private WebElementController webElementController = new WebElementController();

    public DatosBasicosPage() {
        PageFactory.initElements(WebBrowserController.getDriver(), this);
    }

    public void ingresarCelular(String numCelular){
        webElementController.sendTextToElement(inputCelular,numCelular);
    }

    public void clickIngresar(){
        webElementController.clickElement(botonIngresar);
    }

    public void enviarNombre(String nombre){
        webElementController.sendTextToElement(inputNombre,nombre);
    }

    public void enviarApellido(String apellido){
        webElementController.sendTextToElement(inputApellido,apellido);
    }

    public void enviarEmail(String email){
        webElementController.sendTextToElement(inputEmail,email);
    }

    public void clicksiguiente(){
        webElementController.clickElement(botonSiguiente);
    }

    public void enviarDireccion(String direccion){
        webElementController.sendTextToElement(inputDireccion,direccion);
        webElementController.clickElement(recomDireccion);
    }

    public void seleccionarUbicacion(){
        webElementController.clickElement(botonSeleccionarUbicacion);
    }

    public void clickIngresarDireccion(){
        webElementController.clickElement(botonIngresarDireccion);
    }


}
