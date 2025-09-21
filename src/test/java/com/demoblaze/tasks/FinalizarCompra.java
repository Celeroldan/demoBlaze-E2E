package com.demoblaze.tasks;

import com.demoblaze.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;

public class FinalizarCompra implements Task {

    private final String nombre;
    private final String pais;
    private final String tarjeta;
    private final String mes;
    private final String año;

    public FinalizarCompra(String nombre, String pais, String tarjeta, String mes, String año) {
        this.nombre = nombre;
        this.pais = pais;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.año = año;
    }

    public static FinalizarCompra conDatos(String nombre, String pais, String tarjeta, String mes, String año) {
        return Tasks.instrumented(FinalizarCompra.class, nombre, pais, tarjeta, mes, año);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(PaginaDemoblaze.botonOrdenar),
            Enter.theValue(nombre).into(PaginaDemoblaze.campoNombre),
            Enter.theValue(pais).into(PaginaDemoblaze.campoPais),
            Enter.theValue(tarjeta).into(PaginaDemoblaze.campoTarjeta),
            Enter.theValue(mes).into(PaginaDemoblaze.campoMes),
            Enter.theValue(año).into(PaginaDemoblaze.campoAnio),
            Click.on(PaginaDemoblaze.botonComprar)
        );
    }
}