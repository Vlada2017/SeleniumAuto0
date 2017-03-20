import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by st on 20.03.2017.
 */
public class exampleTest {
    @Test
    public void openOnlinerTest () throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://www.onliner.by/");

        Thread.sleep (5000);
        driver.quit ();

    }
}


