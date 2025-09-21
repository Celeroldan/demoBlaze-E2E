package com.demoblaze.tasks;

import com.demoblaze.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgregarProducto implements Task {
    private final String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    public static AgregarProducto llamado(String producto) {
        return Tasks.instrumented(AgregarProducto.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = net.serenitybdd.core.Serenity.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='itemc' and text()='Phones']")));

        actor.attemptsTo(
            Click.on(PaginaDemoblaze.categoriaPhones),
            Click.on(PaginaDemoblaze.producto(producto)),
            Click.on(PaginaDemoblaze.agregarAlCarrito)
        );

        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
        alerta.accept();
    }
}