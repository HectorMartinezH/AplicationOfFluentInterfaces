package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class ProductsPage {
    private AddToCartPopUp addToCartPopUp = new AddToCartPopUp();
    private ProductDetailPage productDetailPage = new ProductDetailPage();
    private WebDriver driver = DriverFactory.getChromeDriver();


    private final String EVENING_DRESSES_TITLE = "//*[@id='center_column']/div[1]/div/div/span";
    private final String PRODUCT_IMAGE = "//a[@class='product_img_link']";


    public Boolean checkIfEveningTitleIsDisplayed(){
        WebElement eveningDressesTitle = driver.findElement(By.xpath(EVENING_DRESSES_TITLE));
        return eveningDressesTitle.isDisplayed();
    }


    public void addProductToShoppingCart() {
        WebElement productImage = driver.findElement(By.xpath(PRODUCT_IMAGE));
        productImage.click();
        productDetailPage.clickOnAddToCartButton();
        addToCartPopUp.clickOnCheckOutButton();
    }
}
