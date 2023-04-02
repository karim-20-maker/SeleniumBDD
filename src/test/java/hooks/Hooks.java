package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage {

    @Before
    public static WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        return Driver;

    }

    @After
    public void tearDown() {
        Driver.quit();
    }
}
