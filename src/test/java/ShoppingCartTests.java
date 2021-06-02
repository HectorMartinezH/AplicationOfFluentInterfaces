import org.testng.annotations.Test;
import pages.*;

public class ShoppingCartTests extends BaseTestClass{
    MainMenuBar mainMenuBar = new MainMenuBar();
    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPageSection shoppingCartPageSection = new ShoppingCartPageSection();

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        mainMenuBar.goToEveningDressesSubMenu();
        mainMenuBar.clickOnEveningDressesSubMenu();

        productsPage.checkIfEveningTitleIsDisplayed();
        productsPage.clickOnProduct();
        productsPage.addToShoppingCart();
        productsPage.checkOutProduct();

        shoppingCartPageSection.checkCartQuantityValueIsEqualsTo("1");
    }
}
