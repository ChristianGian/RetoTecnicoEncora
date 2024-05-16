Feature: El usuario quiere hacer un registro y el login respectivo en la web.



  @crearUsuario
  Scenario Outline: Verificar el registro de usuario
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
    And el usuario llena el campo password "<password>"
    And el usuario llena el campo confirmar password "<confirmarPassword>"
    And el usuario selecciona enviar
    Then el texto buscado es "<resultado>"
    Examples:
      | nombre | apellido | telefono | ssn     | direccion    | ciudad | provincia | codigo | username | password | confirmarPassword | resultado                                                         |
      | Juan | Arones | 989898989 | 123456 | jr puno lima | lima   | Lima      | 10101  | juanca | Juanca111 | Juanca111     | Your account was created successfully. You are now logged in. |


  @ingresarLoginUsuario
  Scenario Outline: Realizar logeo de usuario
    Given se abre la pagina web
    When el usuario se logea "<username>", "<password>"
    And el usuario selecciona ingresar
    Then el usuario esta en la pagina de inicio
    Examples:
      | username | password |
      | naye0103 | Clave123 |

