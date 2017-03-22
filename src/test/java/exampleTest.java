import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exampleTest {
    @Test
    public void openOnlinerTest () throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://www.onliner.by/");

        Thread.sleep (5000);
        driver.quit ();

    }
    @Test
    public void invalidLoginMailruTest(){
        System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://mail.ru/");
        String initialTitle = driver.getTitle();


        /*By loginFieldLocator = By.id ("mailbox__login")
                WebElement loginField = driver.findElement(By.id ("mailbox__login"));*/


        By loginFieldLocator = By.id ("mailbox__login");
                WebElement loginField = driver.findElement(loginFieldLocator);

        By passwordFieldLocator = By.id ("mailbox__password");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonFieldLocator = By.id ("mailbox__auth__button");
        WebElement loginButtonField = driver.findElement(loginButtonFieldLocator);

        By invalidloginDataLocator = By.cssSelector ("[id='mailbox:authfail']");
        WebElement invalidloginDataLabel = driver.findElement(invalidloginDataLocator);

        loginField.sendKeys(";)");
        passwordField.sendKeys("19121989");
        loginButtonField.click();

       // System.out.println(invalidloginDataLabel.getText());
        String finallyTitle = driver.getTitle();
        Assert.assertNotEquals(initialTitle, finallyTitle, "Titles are equals");
       // driver.quit();
    }
    @Test
    public void loginMailTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://mail.ru/");
        driver.manage().window().maximize();
        String initialTitle = driver.getTitle();


        WebElement loginField = driver.findElement(By.id ("mailbox__login"));

        WebElement passwordField = driver.findElement(By.id ("mailbox__password"));

        WebElement loginButtonField = driver.findElement(By.id ("mailbox__auth__button"));

        WebElement invalidloginDataLabel = driver.findElement(By.cssSelector ("[id='mailbox:authfail']"));

        loginField.sendKeys("hot_dog200");
        passwordField.sendKeys("123456789V");
        loginButtonField.click();

        /*String finallyTitle = driver.getTitle();
        Assert.assertNotEquals(initialTitle, finallyTitle, "Titles are equals");*/
        //driver.quit();

        WebElement emailField = driver.findElement(By.id ("PH_user-email"));
        Assert.assertTrue(emailField.isDisplayed());

        /*ebElement emailField1 = driver.findElement(By.id ("mailbox__login"));
        Assert.assertTrue(emailField.isDisplayed());*/

    }
}


