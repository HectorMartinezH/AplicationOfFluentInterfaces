package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class ProductsPage {
    private AddToCartPopUp addToCartPopUp = AddToCartPopUp.getAddToCartPopUp();
    private ProductDetailPage productDetailPage = new ProductDetailPage();
    private WebDriver driver = DriverFactory.getChromeDriver();


    private final static String EVENING_DRESSES_TITLE = "//*[@id='center_column']/div[1]/div/div/span";
    private final String PRODUCT_IMAGE = "//a[@class='product_img_link']";

    private ProductsPage() {
    }

    public static ProductsPage getProductPage() {
        return new ProductsPage();
    }



    public ProductsPage clickOnProduct() {
        WebElement productImage = driver.findElement(By.xpath(PRODUCT_IMAGE));
        productImage.click();
        return this;
    }

    public ProductsPage addToShoppingCart() {
        productDetailPage.clickOnAddToCartButton();
        return this;
    }

    public void checkOutProduct() {
        addToCartPopUp.clickOnCheckOutButton();
    }

    public static By eveningDressesTitle(){
        return By.xpath(EVENING_DRESSES_TITLE);
    }
}
