package org.example.uitests;

import org.example.uitests.pages.shop_main.Product;
import org.example.uitests.pages.shop_main.ProductPageShop;
import org.example.uitests.pages.shop_main.SortDirection;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ZakharchenkoHW_16 extends BaseTests {

    @BeforeClass
    public void beforeClass() {
        goToPart("8-dresses");
    }

    @Test
    public void checkSortingAllItemsTest() throws InterruptedException {
        ProductPageShop productPageShop = new ProductPageShop();
        productPageShop.selectAmountOfElementsPerPage("60");
        List<Product> productsAsIs = productPageShop.getProducts();
        List<Product> productsAfterSorting = productPageShop.sortBy(SortDirection.PRICE_LOW_TO_HIGH).getProducts();
        Collections.sort(productsAsIs, Product.getComparatorForSorting(SortDirection.PRICE_LOW_TO_HIGH));
        Assert.assertEquals(productsAsIs, productsAfterSorting);
    }
}
