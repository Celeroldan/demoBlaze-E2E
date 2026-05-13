Feature: Flujo de compra DemoBlaze

  Scenario: Compra exitosa de dos productos

    Given que el usuario ingresa a DemoBlaze
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra
    Then la compra debe finalizar correctamente