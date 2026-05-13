Proyecto de automatización funcional E2E desarrollado sobre la página: https://www.demoblaze.com/
La automatización valida el flujo completo de compra de productos utilizando Java, Selenium, Serenity BDD y Cucumber bajo arquitectura Page Object Model (POM).
************************************************
*************Tecnologías utilizadas*************
************************************************
Tecnología	Versión
Java	17
Maven	3.9+
Selenium	4.33.0
Serenity BDD	4.2.34
Cucumber	Incluido vía Serenity
JUnit	4.13.2
Chrome Browser	148.0.7778.97
ChromeDriver	148.0.7778.167

Se utilizó Selenium WebDriver para la automatización de interacción con el navegador.
Se implementó Cucumber para trabajar bajo enfoque BDD mediante archivos feature escritos en lenguaje Gherkin.

************************************************
*************Ejecución del proyecto*************
************************************************
Comando de ejecución
mvn clean test
Generación de reportes
Los reportes Serenity se generan en:
target/site/serenity/index.html

************************************************
*************Escenario automatizado*************
************************************************
Flujo E2E implementado
1.	Ingreso a DemoBlaze
2.	Selección del producto Samsung Galaxy S6
3.	Agregar producto al carrito
4.	Selección del producto Nokia Lumia 1520
5.	Agregar producto al carrito
6.	Navegación al carrito
7.	Completar formulario de compra
8.	Finalizar compra
9.	Validar mensaje de compra exitosa

************************************************
********Resumen de archivos creados*************
************************************************
>> purchase.feature

Contiene el escenario en lenguaje Gherkin del flujo E2E de compra:
ingreso a DemoBlaze,
agregar productos,
visualizar carrito,
completar compra,
validar compra exitosa.

>>PurchaseRunner.java
Archivo encargado de ejecutar la automatización utilizando:
Cucumber
Serenity BDD
Define:ubicación del feature,package glue,configuración de ejecución.

>>PurchaseSteps.java
Contiene los Step Definitions de Cucumber:
@Given
@When
@Then
Aquí se conectan los pasos escritos en el .feature con el código Java.

>>PurchaseActions.java
Clase de acciones reutilizables de Serenity.
Centraliza la lógica funcional del flujo:
abrir página,
agregar productos,
navegar al carrito,
completar compra,
validar resultado.

>>HomePage.java
Page Object de la página principal.
Contiene:
localizadores,
navegación,
selección de productos,
acceso al carrito.

>>ProductPage.java
Page Object de detalle de producto.
Gestiona:
botón “Add to cart”,
manejo de alertas,
retorno al home.

>>CartPage.java
Page Object del carrito de compras.
Contiene acciones relacionadas con:
Visualización del carrito,
botón “Place Order”.

>>PurchasePage.java
Page Object del formulario de compra.
Gestiona:
ingreso de datos,
botón Purchase,
validación de mensaje exitoso.

>>pom.xml
Archivo principal de configuración Maven.
Administra:
dependencias,
plugins,
versiones,
compilación,
ejecución de pruebas,
integración con Serenity.

>>serenity.conf
Archivo de configuración de Serenity.
Define:
navegador utilizado,
parámetros básicos del framework.