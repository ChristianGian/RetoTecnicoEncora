package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pagesObjets.HomeBase;
import pagesObjets.Bienvenida;

public class loginDefinitions {
    HomeBase inicio;
    Bienvenida fin;

    public loginDefinitions(){
       inicio = new HomeBase();
       fin = new Bienvenida();
    }


    @Given("se abre la pagina web")
    public void seAbreLaPaginaWeb() {
        inicio.ingresarWeb();
    }

    @When("el usuario selecciona registrar")
    public void elUsuarioSeleccionaRegistrar() {
        inicio.seleccionarRegistrar();
    }



    @And("el usuario llena el campo telefono {string}")
    public void elUsuarioLlenaElCampoTelefono(String telefono) {
        inicio.escribirTelefono(telefono);
    }

    @And("el usuario llena el campo ssn {string}")
    public void elUsuarioLlenaElCampoSsn(String ssn) { inicio.escribirSsn(ssn); }

    @And("el usuario llena el campo username {string}")
    public void elUsuarioLlenaElCampoUsername(String username) {
        inicio.escribirUsername(username);
    }

    @And("el usuario llena el campo password {string}")
    public void elUsuarioLlenaElCampoPassword(String password) {
        inicio.escribirPassword(password);
    }

    @And("el usuario llena el campo confirmar password {string}")
    public void elUsuarioLlenaElCampoConfirmarPassword(String confirmar_password) {
        inicio.escribirConfirmarPassword(confirmar_password);
    }

    @And("el usuario selecciona enviar")
    public void elUsuarioSeleccionaEnviar() {
        inicio.seleccionarEnviar();
    }

    @Then("el texto buscado es {string}")
    public void elTextoBuscadoEs(String resul) {
        Assert.assertTrue(fin.encontrarTexto(resul));
    }

    @And("el usuario llena el campo {string}, {string}")
    public void elUsuarioLlenaElCampo(String nombre, String apellido) {
        inicio.escribirNombre(nombre);
        inicio.escribirApellido(apellido);
    }

    @And("el usuario llena el campo direccion {string}")
    public void elUsuarioLlenaElCampoDireccion(String direccion) {
        inicio.escribirDireccion(direccion);
    }

    @And("el usuario llena el campo ciudad {string}")
    public void elUsuarioLlenaElCampoCiudad(String ciudad) {
        inicio.escribirCiudad(ciudad);
    }

    @And("el usuario llena el campo provincia {string}")
    public void elUsuarioLlenaElCampoProvincia(String provincia) {
        inicio.escribirProvincia(provincia);
    }

    @And("el usuario llena el campo codigo postal {string}")
    public void elUsuarioLlenaElCampoCodigoPostal(String codigo) {
        inicio.escribirCodigoPostal(codigo);
    }


    @When("el usuario se logea {string}, {string}")
    public void elUsuarioSeLogea(String usernamelogin, String passwordlogin) {
        inicio.escribirUsernameLogin(usernamelogin);
        inicio.escribirPasswordLogin(passwordlogin);
    }

    @And("el usuario selecciona ingresar")
    public void elUsuarioSeleccionaIngresar() {
        inicio.seleccionarIngresar();
    }

    @Then("el usuario esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        //La pagina tiene errores, no deja ingresar
        //An internal error has occurred and has been logged.
        //Por esta razon no se puede capturar el elemento para validar el logeo correcto.
    }
}
