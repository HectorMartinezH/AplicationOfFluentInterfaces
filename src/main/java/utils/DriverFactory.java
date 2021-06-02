package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory(){
        // prevent instantiation
    }

    public static WebDriver getChromeDriver(){

        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chrome\\90\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
        }
        return driver;
    }
}
