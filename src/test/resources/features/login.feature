Feature: El usuario podrá realizar el registro de su cuenta y el login respectivo.



  @createUser
  Scenario Outline: verificar el correcto registro del usuario
    Given se abre la pagina web
    When el usuario selecciona registrar
    And el usuario llena el campo "<nombre>", "<apellido>"
    And el usuario llena el campo direccion "<direccion>"
    And el usuario llena el campo ciudad "<ciudad>"
    And el usuario llena el campo provincia "<provincia>"
    And el usuario llena el campo codigo postal "<codigo>"
    And el usuario llena el campo telefono "<telefono>"
    And el usuario llena el campo ssn "<ssn>"
    And el usuario llena el campo username "<username>"
    And el usuario llena el campo password "<clave>"
    And el usuario llena el campo confirmar password "<confirmarClave>"
    And el usuario selecciona enviar
    Then el texto buscado es "<respuesta>"
    Examples:
      | nombre | apellido | telefono | ssn     | direccion    | ciudad | provincia | codigo | username | clave | confirmarClave | respuesta                                                         |
      | Chris | Fernandez | 989809097 | 765876 | calle lopez albujar | lima   | lima      | 67544  | ChrisFernandez10 | ChrisFernandez10 |  ChrisFernandez10     | Your account was created successfully. You are now logged in. |


  @loginUser
  Scenario Outline: Verificar el correcto login del usuario
    Given se abre la pagina web
    When el usuario se logea "<usuario>", "<clave>"
    And el usuario selecciona ingresar
    Then el usuario esta en la pagina de inicio
    Examples:
      | usuario | clave |
      | ChrisFernandez10 | ChrisFernandez10 |

