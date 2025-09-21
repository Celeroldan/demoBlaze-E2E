package com.demoblaze.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import org.openqa.selenium.By;


public class PaginaDemoblaze extends PageObject {

    public static final Target categoriaPhones = Target.the("categoría Phones")
        .locatedBy("//a[@id='itemc' and text()='Phones']");

    public static Target producto(String nombreProducto) {
        return Target.the("producto " + nombreProducto)
            .locatedBy("//a[text()='" + nombreProducto + "']");
    }

    public static final Target agregarAlCarrito = Target.the("botón agregar al carrito")
        .locatedBy("//a[text()='Add to cart']");

    public static final Target carrito = Target.the("carrito")
        .locatedBy("//a[text()='Cart']");

    public static final Target botonOrdenar = Target.the("botón Place Order")
        .locatedBy("//button[text()='Place Order']");

    public static final Target campoNombre = Target.the("campo nombre")
        .locatedBy("#name");

    public static final Target campoPais = Target.the("campo país")
        .locatedBy("#country");

    public static final Target campoTarjeta = Target.the("campo tarjeta")
        .locatedBy("#card");

    public static final Target campoMes = Target.the("campo mes")
        .locatedBy("#month");

    public static final Target campoAnio = Target.the("campo año")
        .locatedBy("#year");

    public static final Target botonComprar = Target.the("botón Purchase")
        .locatedBy("//button[text()='Purchase']");

    public static final Target MENSAJE_CONFIRMACION = Target.the("mensaje de confirmación")
        .located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}