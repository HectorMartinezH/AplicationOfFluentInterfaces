package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class AddToCartPopUp {
    private WebDriver driver = DriverFactory.getChromeDriver();

    private final String PROCEED_CHECKOUT_BUTTON = "//span[contains(text(),'Proceed to checkout')]//parent::a";

    public static AddToCartPopUp getAddToCartPopUp() {
        return new AddToCartPopUp();
    }

    public void clickOnCheckOutButton() {
        WebElement proceedCheckoutButton = driver.findElement(By.xpath(PROCEED_CHECKOUT_BUTTON));
        proceedCheckoutButton.click();
    }
}
