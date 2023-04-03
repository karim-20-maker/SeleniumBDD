package common;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks extends BasePage {

    @Before
    public static WebDriver setUp() {
        String browser = System.getProperty("browser");

        if (browser != null && browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            Driver = new FirefoxDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            Driver = new ChromeDriver();
        }

        Driver.manage().window().maximize();
        return Driver;



    }

    @After
    public void tearDown() {
        Driver.quit();
    }
}
