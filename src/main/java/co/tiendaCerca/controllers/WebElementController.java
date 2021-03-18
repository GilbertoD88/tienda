package co.tiendaCerca.controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class WebElementController {

    private final int DEFAULT_TIMEOUT=30;
    private WebDriver driver=WebBrowserController.getDriver();


    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }


    public void sendTextToElement(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public boolean isVisible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isClickeable(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void selectWithText(String option){
        String optionList;
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        List<WebElement> list= WebBrowserController.getDriver().findElements(By.xpath("//div[contains(@id,'react-select-2-option-')]"));
        for (int i = 0; i < list.size()-1 ; i++) {
            optionList = list.get(i).getText();
            if (option.equals(optionList)){
                wait.until(ExpectedConditions.elementToBeClickable(list.get(i))).click();
                break;
            }
        }
    }


}
