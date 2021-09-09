Feature: El repartidor del juego de 21

  Scenario: Repartir dos cartas
    Given un repartidor
    When el juego inicia
    Then el repartidor toma dos cartas