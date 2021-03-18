package co.tiendaCerca.pages;

import co.tiendaCerca.controllers.WebBrowserController;
import co.tiendaCerca.controllers.WebElementController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultadoRegistro {

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Te has registrado') and contains(text()[2],'exitosamente')]")
    private WebElement textRegistroExitoso;

    private WebElementController webElementController = new WebElementController();

    public ResultadoRegistro() {
        PageFactory.initElements(WebBrowserController.getDriver(), this);
    }

    public boolean getResultadoRegistro(){
        return webElementController.isVisible(textRegistroExitoso);
    }
}
