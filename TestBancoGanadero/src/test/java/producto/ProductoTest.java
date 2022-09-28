package producto;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class ProductoTest extends BaseTest {

    @Test
    public void testProductosNuevos(){
        BuscarPais.clickPais(webDriver);
        AceptarCookie.clickCookie(webDriver);
        BuscarProducto.ingresarDescripcion(webDriver,"CELULAR");
        BuscarPorCondicion.clickCondicionNuevo(webDriver);

        int cantidadProducto= ContarProductos.totalProductos(webDriver);
        boolean resultado= false;

        if (cantidadProducto>=3){
            resultado=true;
        }

        Assert.assertTrue(resultado);
    }

    @Test
    public void testProductosUsados() {
        BuscarPais.clickPais(webDriver);
        AceptarCookie.clickCookie(webDriver);
        BuscarProducto.ingresarDescripcion(webDriver,"CELULAR");
        BuscarPorCondicion.clickCondicionUsado(webDriver);

        int cantidadProducto= ContarProductos.totalProductos(webDriver);
        boolean resultado= false;

        if (cantidadProducto>=3){
            resultado=true;
        }

        Assert.assertTrue(resultado);
    }


}