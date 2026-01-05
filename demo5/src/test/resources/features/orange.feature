@Suite
Feature: historia usuario pagina orange

  @CP1
  Scenario: CP01- Login orange cred validas
    Given usuario ingresa al link de orange
    When ingresa las credenciales validas
    Then aparece la ventana principal


@CP2
  Scenario: CP02- Registra empleado
    Given usuario ingresa al link de orange
    When ingresa las credenciales validas
    And accede menu PIM
   And presiona boton Add Employee
   And registra datos del empleado
    Then confirma que se grabo el registro


 # @CP2_vacios
  Scenario: CP02- Registra empleado
    Given usuario ingresa al link de orange
    When ingresa las credenciales validas
    And accede menu PIM
    And presiona boton Add Employee
    Then   valida campo primer nombre y apellido no esten vacios

  @CP3
  Scenario: CP03- Login invalidas
    Given usuario ingresa al link de orange
    When ingresa las credenciales invalidas
    Then aparece mensaje de validacion de logueo

  @CP4
  Scenario Outline: CP04-Login invalidas EXAMPLE
   Given usuario ingresa al link de orange
    When ingresa las credenciales invalidasMasiva "<usuario1>" y "<clave1>"
    Then aparece mensaje de validacion de logueo

    Examples:
    | usuario1 | clave1 |
    | admin    | 123    |
    | miuser   | 456    |
    | david   | pdgv   |
