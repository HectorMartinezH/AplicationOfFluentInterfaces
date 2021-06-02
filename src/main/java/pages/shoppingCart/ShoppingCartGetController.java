package pages.shoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class ShoppingCartGetController {

    private WebDriver driver = DriverFactory.getChromeDriver();

    public String cartQuantityValue() {
        WebElement cartQuantity = driver.findElement(By.xpath(ShoppingCartPageSection.CART_QUANTITY));
        return cartQuantity.getAttribute("textContent");
    }
}
