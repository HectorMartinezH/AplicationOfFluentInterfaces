package pages.product;

public class ProductsPage {
    final static String PRODUCT_IMAGE = "//a[@class='product_img_link']";
    final static String EVENING_DRESSES_TITLE = "//*[@id='center_column']/div[1]/div/div/span";

    private ProductActController act;
    private ProductVerifyController verify;

    public ProductActController act() {
        return act;
    }

    public ProductVerifyController verify() {
        return verify;
    }

    private ProductsPage() {

    }

    private ProductsPage(ProductActController act, ProductVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static ProductsPage getProductPage() {
        return new ProductsPage(new ProductActController(), new ProductVerifyController());
    }


}
