package co.tiendaCerca.controllers;


import co.tiendaCerca.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebBrowserController {
    private static WebDriver driver;
    private static String msjLogger;

    public static WebDriver getDriver() {
        return driver;
    }



    public static void launchWebApp(String url) {
        String so = System.getProperty("os.name");

        String driverName="";
        if (so.contains("Linux")) {
            driverName="_linux";
        } else if(so.contains("Mac")) {
            driverName="_mac";
        }else {
            driverName=".exe";
        }
        msjLogger = String.format("SO= '%s'", so);
        Log.LOGGER.info(msjLogger);

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver".concat(driverName));

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("incognito");
        driver = new ChromeDriver(chromeOptions);

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        msjLogger = String.format("Driver selected: 'Chrome'. The browser opened the following url: '%s'.", url);
        Log.LOGGER.info(msjLogger);
    }
    public static void closeWebApp() {
        try {
            driver.close();
            driver.quit();
            Log.LOGGER.info("Driver closed");
        }catch (Exception e){
            msjLogger="Exception closing the browser: ".concat(e.getMessage());
            Log.LOGGER.info(msjLogger);
        }
    }
}
