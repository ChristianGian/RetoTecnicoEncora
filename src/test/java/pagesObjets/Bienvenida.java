package pagesObjets;

import definitions.Hooks;
import org.openqa.selenium.By;

public class Bienvenida extends Hooks {
    By resultado = By.xpath("//h1[@class='title']/following-sibling::p[1]");


    public Bienvenida() {
        super(driver);

    }

    public Boolean encontrarTexto(String palabra){
        if (devolverTexto(resultado).contains(palabra)){
            return true;
        }else {
            return false;
        }
    }

}
