import org.testng.annotations.Test;
import pages.*;

import static pages.MainMenuBar.*;
import static pages.ProductsPage.*;
import static pages.ShoppingCartPageSection.*;

public class ShoppingCartTests extends BaseTestClass{
    MainMenuBar mainMenuBar = getMainMenuBar();
    ProductsPage productsPage = getProductPage();
    ShoppingCartPageSection shoppingCartPageSection = getShoppingCartPageSection();

    @Test
    public void addProductToShoppingCartFromProductDetailPage() {
        mainMenuBar.goToOptionMenu(MenuBarEnum.DRESSES)
                   .clickOnEveningDressesSubMenu();

        productsPage.checkIsDisplayed(eveningDressesTitle())
                    .clickOnProduct()
                    .addToShoppingCart()
                    .checkOutProduct();

        shoppingCartPageSection.checkCartQuantityValueIsEqualsTo("1");
    }
}
