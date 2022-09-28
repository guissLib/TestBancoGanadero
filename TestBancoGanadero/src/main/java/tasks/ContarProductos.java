package tasks;

import actions.Click;
import actions.Enter;
import actions.List;
import org.openqa.selenium.WebDriver;
import pages.ProductoPage;

public class ContarProductos {

    public static int totalProductos(WebDriver webDriver){
      return List.getSize(webDriver, ProductoPage.listProductos);
    }
}
