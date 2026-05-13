package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends PageObject {

    By BTN_ADD_CART = By.linkText("Add to cart");

    By HOME = By.id("nava");

    public void agregarProducto() {

        $(BTN_ADD_CART).click();

        WebDriverWait wait = new WebDriverWait(
                getDriver(),
                Duration.ofSeconds(10)
        );

        Alert alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        alert.accept();
    }

    public void volverHome() {

        $(HOME).click();
    }
}