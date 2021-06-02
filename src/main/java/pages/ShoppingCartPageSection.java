package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class ShoppingCartPageSection {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private String CART_QUANTITY = "//div[@class='shopping_cart']//span[@class='ajax_cart_quantity']";

    public String getCartQuantityValue() {
        WebElement cartQuantity = driver.findElement(By.xpath(CART_QUANTITY));
        return cartQuantity.getAttribute("textContent");
    }
}
