package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By PRODUCTO_1 = By.linkText("Samsung galaxy s6");

    By PRODUCTO_2 = By.linkText("Nokia lumia 1520");

    By CART = By.id("cartur");

    public void abrirPagina() {

        openUrl("https://www.demoblaze.com/");
    }

    public void seleccionarPrimerProducto() {

        $(PRODUCTO_1).click();
    }

    public void seleccionarSegundoProducto() {

        $(PRODUCTO_2).click();
    }

    public void irAlCarrito() {

        waitABit(3000);

        evaluateJavascript(
                "arguments[0].click();",
                $(CART)
        );
    }
}