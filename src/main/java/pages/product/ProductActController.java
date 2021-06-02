package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.addToCart.AddToCartPopUp;
import pages.productDetail.ProductDetailPage;
import utils.DriverFactory;

public class ProductActController {
    private AddToCartPopUp addToCartPopUp = AddToCartPopUp.getAddToCartPopUp();
    private ProductDetailPage productDetailPage = new ProductDetailPage();
    private WebDriver driver = DriverFactory.getChromeDriver();


    public ProductActController clickOnProduct() {
        WebElement productImage = driver.findElement(By.xpath(ProductsPage.PRODUCT_IMAGE));
        productImage.click();
        return this;
    }

    public ProductActController addToShoppingCart() {
        productDetailPage.clickOnAddToCartButton();
        return this;
    }

    public void checkOutProduct() {
        addToCartPopUp.clickOnCheckOutButton();
    }
}
