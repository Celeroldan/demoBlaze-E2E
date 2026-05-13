package com.demoblaze.stepdefinitions;

import com.demoblaze.steps.PurchaseActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class PurchaseSteps {

    @Steps
    PurchaseActions purchaseActions;

    @Given("que el usuario ingresa a DemoBlaze")
    public void que_el_usuario_ingresa_a_demo_blaze() {

        purchaseActions.abrirDemoBlaze();
    }

    @When("agrega dos productos al carrito")
    public void agrega_dos_productos_al_carrito() {

        purchaseActions.agregarDosProductos();
    }

    @When("visualiza el carrito")
    public void visualiza_el_carrito() {

        purchaseActions.visualizarCarrito();
    }

    @When("completa el formulario de compra")
    public void completa_el_formulario_de_compra() {

        purchaseActions.completarCompra();
    }

    @Then("la compra debe finalizar correctamente")
    public void la_compra_debe_finalizar_correctamente() {

        assertTrue(purchaseActions.validarCompraExitosa());
    }
}