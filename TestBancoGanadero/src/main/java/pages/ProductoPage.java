package pages;

import org.openqa.selenium.By;

public class ProductoPage {
    public static By inputDescripcion = By.id("cb1-edit");
    public static By iconoBuscar = By.cssSelector("div[class='nav-icon-search']");
    public static By buttoncondicionNuevo = By.cssSelector("a[aria-label='Nuevo']");
    public static By buttoncondicionUsado = By.cssSelector("a[aria-label='Usado']");
    public static By listProductos = By.cssSelector("li[class='ui-search-layout__item shops__layout-item']");
}
