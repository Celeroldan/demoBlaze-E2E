package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    By BTN_PLACE_ORDER = By.xpath("//button[text()='Place Order']");

    public void clickPlaceOrder() {
        $(BTN_PLACE_ORDER).click();
    }
}