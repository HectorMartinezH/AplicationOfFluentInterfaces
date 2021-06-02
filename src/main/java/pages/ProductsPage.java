package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class ProductsPage {
    private AddToCartPopUp addToCartPopUp = new AddToCartPopUp();
    private ProductDetailPage productDetailPage = new ProductDetailPage();
    private WebDriver driver = DriverFactory.getChromeDriver();


    private final String EVENING_DRESSES_TITLE = "//*[@id='center_column']/div[1]/div/div/span";
    private final String PRODUCT_IMAGE = "//a[@class='product_img_link']";


    public ProductsPage checkIfEveningTitleIsDisplayed(){
        WebElement eveningDressesTitle = driver.findElement(By.xpath(EVENING_DRESSES_TITLE));
        Assert.assertTrue(eveningDressesTitle.isDisplayed());
        return this;
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


}
