package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class ShoppingCartPageSection {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private String CART_QUANTITY = "//div[@class='shopping_cart']//span[@class='ajax_cart_quantity']";

    private ShoppingCartPageSection() {
    }

    public static ShoppingCartPageSection getShoppingCartPageSection() {
        return new ShoppingCartPageSection();
    }

    private String getCartQuantityValue() {
        WebElement cartQuantity = driver.findElement(By.xpath(CART_QUANTITY));
        return cartQuantity.getAttribute("textContent");
    }

    public void checkCartQuantityValueIsEqualsTo(String expectedValue) {
        Assert.assertEquals(getCartQuantityValue(),expectedValue);
    }
}
