package co.tiendaCerca.pages;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.controllers.WebElementController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IngresoPage {

    @FindBy(how = How.XPATH, using = "//div[text()='Seleccione una ciudad']")
    private WebElement desplegarCiudades;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Continuar']")
    private WebElement botonContinuar;

    private WebElementController webElementController = new WebElementController();

    public IngresoPage() {
        PageFactory.initElements(WebBrowserController.getDriver(), this);
    }

    public void selectCity(String ciudad){
        webElementController.clickElement(desplegarCiudades);
        webElementController.selectWithText(ciudad);
    }

    public void clickBotonContinuar(){
        webElementController.clickElement(botonContinuar);
    }
}
