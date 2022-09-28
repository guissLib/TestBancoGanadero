package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PaisPage;

public class BuscarPais {

    public static void clickPais(WebDriver webDriver){
        Click.on(webDriver, PaisPage.buttonPais);
    }
}
