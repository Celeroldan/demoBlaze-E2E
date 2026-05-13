package com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/purchase.feature",
        glue = "com.demoblaze.stepdefinitions"
)
public class PurchaseRunner {

    @BeforeClass
    public static void setup() {

        System.setProperty(
                "webdriver.chrome.driver",
                //Aqui se coloca la ruta en donde se tiene ubicada el chromedriver.exe
                "C:\\Users\\celen\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe"
        );
    }
}