import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShoppingCartTests {

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chrome\\90\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        driver.get("http://automationpractice.com/index.php");

        // Locate the Dresses Menu Option
        Actions actions = new Actions(driver);
        WebElement dressesMenuOption = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
        // Mouse over Dresses Menu Option
        actions.moveToElement(dressesMenuOption).perform();
        // Locate the Evening Dresses Sub menu
        WebElement eveningDressesSubMenu = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a"));
        // Click on Evening Dresses Sub menu
        eveningDressesSubMenu.click();
        //Verify if the Evening Dresses tile is displayed
        WebElement eveningDressesTitle = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/div/div/span"));
        Assert.assertTrue(eveningDressesTitle.isDisplayed());

        // Click on the product image
        WebElement productImage = driver.findElement(By.xpath("//a[@class='product_img_link']"));
        productImage.click();

        //In Product detail page click on Add to Cart button
        WebElement addToCartButton = driver.findElement(By.xpath("//p[@id='add_to_cart']/button[@type='submit']"));
        addToCartButton.click();

        //In popUp click on Proceed to checkout
        WebElement proceedCheckoutButton = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]//parent::a"));
        proceedCheckoutButton.click();

        // Check that the quantity in the Cart is displayed 1
        WebElement cartQuantity = driver.findElement(By.xpath("//div[@class='shopping_cart']//span[@class='ajax_cart_quantity']"));
        Assert.assertEquals(cartQuantity.getAttribute("textContent"),"1");

        driver.close();
    }
}
