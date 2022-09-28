package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.ProductoPage;

public class BuscarPorCondicion {

    public static void clickCondicionNuevo(WebDriver webDriver){
        Click.on(webDriver, ProductoPage.buttoncondicionNuevo);
    }

    public static void clickCondicionUsado(WebDriver webDriver){
        Click.on(webDriver, ProductoPage.buttoncondicionUsado);
    }
}
