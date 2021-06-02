package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class ProductDetailPage {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private String ADD_TO_CART_BUTTON = "//p[@id='add_to_cart']/button[@type='submit']";

    public void clickOnAddToCartButton() {
        WebElement addToCartButton = driver.findElement(By.xpath(ADD_TO_CART_BUTTON));
        addToCartButton.click();
    }
}
