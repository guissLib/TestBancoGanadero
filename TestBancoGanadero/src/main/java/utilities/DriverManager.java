package utilities;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
    private String browser;
    private final String screenshotPath = "src/test/resources/screenshots";

    public WebDriver initLocalDriver() {
        if (browser == null) {
            browser = "CHROME";
        }

        switch (browser) {
            case "CHROME":
                ChromeDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "EDGE":
                EdgeDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                return null;
        }
    }
}
