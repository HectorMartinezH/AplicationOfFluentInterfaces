package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class CommonVerifications {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private CommonVerifications() {
    }

    public static CommonVerifications getCommonVerification() {
        return new CommonVerifications();
    }

    public CommonVerifications checkIsDisplayed(By element){
        WebElement eveningDressesTitle = driver.findElement(element);
        Assert.assertTrue(eveningDressesTitle.isDisplayed());
        return this;
    }

}
