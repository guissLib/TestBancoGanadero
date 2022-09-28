package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.CookiePage;
import pages.PaisPage;

public class AceptarCookie {

    public static void clickCookie(WebDriver webDriver){
        Click.on(webDriver, CookiePage.buttonCookie);
    }
}
