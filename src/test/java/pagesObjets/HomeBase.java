package pagesObjets;

import definitions.Hooks;
import org.openqa.selenium.By;

public class HomeBase extends Hooks {


    By registrar = By.xpath("//*[@id='loginPanel']/p[2]/a");
    By nombre = By.name("customer.firstName");
    By apellido = By.name("customer.lastName");
    By direccion = By.name("customer.address.street");
    By ciudad = By.name("customer.address.city");
    By provincia = By.name("customer.address.state");
    By codigo = By.name("customer.address.zipCode");
    By telefono = By.name("customer.phoneNumber");
    By ssn = By.name("customer.ssn");
    By username = By.name("customer.username");
    By password = By.name("customer.password");
    By confirmar_password = By.name("repeatedPassword");
    By enviar = By.xpath("//input[@value='Register']");

    By usernamelogin = By.name("username");
    By passwordlogin = By.name("password");
    By ingresar = By.xpath("//input[@value='Log In']");

    public HomeBase() {
        super(driver);
    }

    public void seleccionarRegistrar() {
        pulsarEnter(registrar);
    }

    public void escribirNombre(String texto){
        enterText(nombre,texto);
    }

    public void escribirApellido(String texto){
        enterText(apellido,texto);
    }

    public void escribirDireccion(String texto){
        enterText(direccion,texto);
    }

    public void escribirCiudad(String texto){
        enterText(ciudad,texto);
    }

    public void escribirProvincia(String texto){
        enterText(provincia,texto);
    }

    public void escribirCodigoPostal(String texto){
        enterText(codigo,texto);
    }

    public void escribirTelefono(String texto){
        enterText(telefono,texto);
    }

    public void escribirSsn(String texto){
        enterText(ssn,texto);
    }

    public void escribirUsername(String texto){
        enterText(username,texto);
    }

    public void escribirPassword(String texto){
        enterText(password,texto);
    }

    public void escribirConfirmarPassword(String texto){
        enterText(confirmar_password,texto);
    }

    public void seleccionarEnviar() {
        pulsarEnter(enviar);
    }

    public void escribirUsernameLogin(String texto){
        enterText(usernamelogin,texto);
    }

    public void escribirPasswordLogin(String texto){
        enterText(passwordlogin,texto);
    }

    public void seleccionarIngresar() {
        pulsarEnter(ingresar);
    }
}
