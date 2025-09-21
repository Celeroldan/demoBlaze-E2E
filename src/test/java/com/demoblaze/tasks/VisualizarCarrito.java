package com.demoblaze.tasks;

import com.demoblaze.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;

public class VisualizarCarrito implements Task {

    private final String producto;

    public VisualizarCarrito(String producto) {
        this.producto = producto;
    }

    public static VisualizarCarrito conProducto(String producto) {
        return Tasks.instrumented(VisualizarCarrito.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(PaginaDemoblaze.carrito)
        );
    }
}