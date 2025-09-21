package com.demoblaze;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.actions.Open;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoblaze.tasks.AgregarProducto;
import com.demoblaze.tasks.VisualizarCarrito;
import com.demoblaze.tasks.FinalizarCompra;
import com.demoblaze.userinterfaces.PaginaDemoblaze;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class CompraTest {

    private Actor usuario;
    private WebDriver navegador;

  @BeforeEach
public void configurarEscenario() {
    System.setProperty("webdriver.chrome.driver", "C:\\chrome140\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.setBinary("C:\\chrome140\\chrome.exe");

    // 🔧 Aquí agregas los argumentos recomendados
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--no-sandbox");

    navegador = new ChromeDriver(options);
    usuario = Actor.named("Celeny");
    usuario.can(BrowseTheWeb.with(navegador));
}


    @Test
    public void realizarCompra() {
       usuario.attemptsTo(
    Open.url("https://www.demoblaze.com"),
    AgregarProducto.llamado("Samsung galaxy s6"),
    VisualizarCarrito.conProducto("Samsung galaxy s6"),
    FinalizarCompra.conDatos("Celeny", "Ecuador", "Visa", "10", "2025")
);


        String mensaje = Text.of(PaginaDemoblaze.MENSAJE_CONFIRMACION).answeredBy(usuario);
        assertThat(mensaje).contains("Thank you for your purchase!");
    }
}