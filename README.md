

## Requisitos

- Java 11
- Maven
- Gherkin cucumber
- IDE intellij o similar.

## Proyecto

El proyecto usa el patron de diseño POM, y tiene la estructura Definitions, PagesObject, Support, Resources

Dentro de Definitions tenemos la implementación de los gherkin
Dentro de PagesObject tenemos las clases java localizando los objetos o elementos de la web.
Dentro de la clase Support tenemos la clase Run que indica el tag que se va a ejecutar.
Dentro de Resources tenermos el driver y los features que hacen referencia a los escenarios de pruebas.

```comandos maven
mvn test -Dcucumber.filter.tags="@crearUsuario"
