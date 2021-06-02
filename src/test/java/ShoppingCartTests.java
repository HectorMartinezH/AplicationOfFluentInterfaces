import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ShoppingCartTests extends BaseTestClass{
    MainMenuBar mainMenuBar = new MainMenuBar();
    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPageSection shoppingCartPageSection = new ShoppingCartPageSection();

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        mainMenuBar.goToEveningDressesSubMenu();
        Assert.assertTrue(productsPage.checkIfEveningTitleIsDisplayed());
        productsPage.addProductToShoppingCart();
        Assert.assertEquals(shoppingCartPageSection.getCartQuantityValue(),"1");
    }
}
