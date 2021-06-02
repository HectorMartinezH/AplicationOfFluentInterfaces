import org.testng.Assert;
import org.testng.annotations.Test;
import pages.menuBar.MainMenuBar;
import pages.menuBar.MenuBarEnum;
import pages.product.ProductsPage;
import pages.shoppingCart.ShoppingCartPageSection;

import static pages.menuBar.MainMenuBar.*;
import static pages.product.ProductsPage.*;
import static pages.shoppingCart.ShoppingCartPageSection.*;

public class ShoppingCartTests extends BaseTestClass{
    MainMenuBar mainMenuBar = getMainMenuBar();
    ProductsPage productsPage = getProductPage();
    ShoppingCartPageSection shoppingCartPageSection = getShoppingCartPageSection();

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        mainMenuBar.goToOptionMenu(MenuBarEnum.DRESSES)
                   .clickOnEveningDressesSubMenu();

        productsPage.verify()
                .titleIsDisplayed();

        productsPage.act()
                .clickOnProduct()
                .addToShoppingCart()
                .checkOutProduct();

        Assert.assertEquals(shoppingCartPageSection.get().cartQuantityValue(),"1");
    }
}
