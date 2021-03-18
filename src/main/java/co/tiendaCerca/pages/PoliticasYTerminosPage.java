package co.tiendaCerca.pages;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.controllers.WebElementController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PoliticasYTerminosPage {

    @FindBy(how = How.ID, using = "abi-checkbox-terms")
    private WebElement checkTerminosYCondiciones;

    @FindBy(how = How.ID, using = "abi-checkbox-policies")
    private WebElement checkPoliticaDatos;

    @FindBy(how = How.XPATH, using = "//button/span[text()='Continuar']")
    private WebElement botonContinuar;

    private WebElementController webElementController = new WebElementController();

    public PoliticasYTerminosPage() {
        PageFactory.initElements(WebBrowserController.getDriver(), this);
    }

    public void checkTerminosYCondiciones(){
        webElementController.clickElement(checkTerminosYCondiciones);
    }

    public void checkPoliticas(){
        webElementController.clickElement(checkPoliticaDatos);
    }

    public void clickBotonContinuar(){
        webElementController.clickElement(botonContinuar);
    }
}
