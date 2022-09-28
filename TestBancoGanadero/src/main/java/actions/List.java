package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class List {

    public static int getSize(WebDriver webDriver, By locator){
       return webDriver.findElements(locator).size();
    }
}
