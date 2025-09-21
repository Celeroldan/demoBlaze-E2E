*** DemoBlaze E2E Automation Project

Este proyecto automatiza el flujo de compra en el sitio (https://www.demoblaze.com) utilizando **Serenity BDD**, **Screenplay Pattern**, **Selenium WebDriver**, y **JUnit 5**.

*** Flujo automatizado

El escenario principal simula la compra de productos:

1. Se abre el sitio web de DemoBlaze
2. Se selecciona la categoría "Phones"
3. Se agrega el producto **Samsung galaxy s6** al carrito
4. Se visualiza el carrito y se valida que ambos productos estén presentes
6. Se finaliza la compra con datos simulados
7. Se verifica el mensaje de confirmación:  
   `"Thank you for your purchase!"`

*** Tecnologías utilizadas

- Java 17
- Maven
- Serenity BDD 3.6.0
- Selenium 4.7.2
- WebDriverManager 5.3.2
- JUnit 5.9.3


***Reporte Serenity

Después de ejecutar:

```bash
mvn clean verify

El reporte se genera en:
target/site/serenity/index.html


Ábrelo en tu navegador para ver:
- Evidencia visual paso a paso
- Resultados por escenario
- Validaciones y errores (si los hay)
