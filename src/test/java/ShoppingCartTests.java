import org.testng.annotations.Test;
import pages.*;

public class ShoppingCartTests extends BaseTestClass{
    MainMenuBar mainMenuBar = new MainMenuBar();
    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPageSection shoppingCartPageSection = new ShoppingCartPageSection();

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        mainMenuBar.goToEveningDressesSubMenu()
                   .clickOnEveningDressesSubMenu();

        productsPage.checkIfEveningTitleIsDisplayed()
                    .clickOnProduct()
                    .addToShoppingCart()
                    .checkOutProduct();

        shoppingCartPageSection.checkCartQuantityValueIsEqualsTo("1");
    }
}
