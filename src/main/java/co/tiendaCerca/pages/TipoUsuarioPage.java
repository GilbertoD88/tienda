package co.tiendaCerca.pages;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.controllers.WebElementController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TipoUsuarioPage {

    @FindBy(how = How.XPATH, using = "//button/span[text()='Consumidor']")
    private WebElement botonConsumidor;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Tendero']")
    private WebElement botonTendero;

    private WebElementController webElementController = new WebElementController();

    public TipoUsuarioPage() {
        PageFactory.initElements(WebBrowserController.getDriver(), this);
    }

    public void clickBotonConsumidor(){
        webElementController.clickElement(botonConsumidor);
    }

    public void clickBotonTendero(){
        webElementController.clickElement(botonTendero);
    }

}
