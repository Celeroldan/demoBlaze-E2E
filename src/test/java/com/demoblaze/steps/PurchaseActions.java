package com.demoblaze.steps;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.ProductPage;
import com.demoblaze.pages.PurchasePage;
import net.serenitybdd.annotations.Step;

public class PurchaseActions {

    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    PurchasePage purchasePage;

    @Step
    public void abrirDemoBlaze() {
        homePage.abrirPagina();
    }

    @Step
    public void agregarDosProductos() {

        homePage.seleccionarPrimerProducto();
        productPage.agregarProducto();
        productPage.volverHome();

        homePage.seleccionarSegundoProducto();
        productPage.agregarProducto();
        productPage.volverHome();
    }

    @Step
    public void visualizarCarrito() {
        homePage.irAlCarrito();
    }

    @Step
    public void completarCompra() {
        cartPage.clickPlaceOrder();
        purchasePage.completarFormulario();
        purchasePage.finalizarCompra();
    }

    @Step
    public boolean validarCompraExitosa() {
        return purchasePage.compraExitosa();
    }
}