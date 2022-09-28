package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import pages.CookiePage;
import pages.ProductoPage;

public class BuscarProducto {

    public static void ingresarDescripcion(WebDriver webDriver,String descripcion){
        Enter.text(webDriver, ProductoPage.inputDescripcion, descripcion);
        Click.on(webDriver, ProductoPage.iconoBuscar);
    }


}
