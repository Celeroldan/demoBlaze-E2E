package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PurchasePage extends PageObject {

    By NAME = By.id("name");
    By COUNTRY = By.id("country");
    By CITY = By.id("city");
    By CARD = By.id("card");
    By MONTH = By.id("month");
    By YEAR = By.id("year");

    By BTN_PURCHASE = By.xpath("//button[text()='Purchase']");

    By MESSAGE_OK = By.xpath("//h2[text()='Thank you for your purchase!']");

    public void completarFormulario() {

        $(NAME).type("Celeny");
        $(COUNTRY).type("Ecuador");
        $(CITY).type("Quito");
        $(CARD).type("123456789");
        $(MONTH).type("05");
        $(YEAR).type("2026");
    }

    public void finalizarCompra() {
        $(BTN_PURCHASE).click();
    }

    public boolean compraExitosa() {
        return $(MESSAGE_OK).isVisible();
    }
}