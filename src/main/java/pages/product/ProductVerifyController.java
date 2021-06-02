package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class ProductVerifyController {
    private WebDriver driver = DriverFactory.getChromeDriver();

    public void titleIsDisplayed() {
        WebElement eveningDressesTitle = driver.findElement(By.xpath(ProductsPage.EVENING_DRESSES_TITLE));
        Assert.assertTrue(eveningDressesTitle.isDisplayed());
    }
}
