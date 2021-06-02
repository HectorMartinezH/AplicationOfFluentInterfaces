package pages.shoppingCart;

public class ShoppingCartPageSection {
    private ShoppingCartGetController get;

    public static String CART_QUANTITY = "//div[@class='shopping_cart']//span[@class='ajax_cart_quantity']";

    private ShoppingCartPageSection() {
    }

    private ShoppingCartPageSection(ShoppingCartGetController get) {
        this.get = get;
    }

    public ShoppingCartGetController get() {
        return get;
    }

    public static ShoppingCartPageSection getShoppingCartPageSection() {
        return new ShoppingCartPageSection(new ShoppingCartGetController());
    }
}
