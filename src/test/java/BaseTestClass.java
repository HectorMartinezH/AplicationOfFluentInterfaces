import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static utils.DriverFactory.getChromeDriver;

public class BaseTestClass {

    WebDriver driver;

    @BeforeMethod
    public void starBrowser() {
        driver = getChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }
}
