package net.therap.SimpleInventory.serviceTests;

import junit.framework.TestCase;
import net.therap.SimpleInventory.domain.Product;
import net.therap.SimpleInventory.service.SimpleProductManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public class SimpleProductManagerTests extends TestCase {
    private SimpleProductManager productManager;

    private List<Product> products;
    private static int PRODUCT_COUNT = 2;
    private static Double CHAIR_PRICE = new Double(20.50);
    private static Double TABLE_PRICE = new Double(150.10);
    private static String CHAIR_DESCRIPTION = "Chair";
    private static String TABLE_DESCRIPTION = "Table";

    protected void setUp() throws Exception {
        productManager = new SimpleProductManager();
        products = new ArrayList<Product>();

        // stub up a list of products
        Product product = new Product();
        product.setDescription(CHAIR_DESCRIPTION);
        product.setPrice(CHAIR_PRICE);
        products.add(product);

        product = new Product();
        product.setDescription(TABLE_DESCRIPTION);
        product.setPrice(TABLE_PRICE);
        products.add(product);

        productManager.setProducts(products);
    }

    public void testGetProductsWithNoProducts() {
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }

    public void testGetProducts() {
        List<Product> products = productManager.getProducts();
        assertNotNull(products);
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());

        Product product = products.get(0);
        assertEquals(CHAIR_DESCRIPTION, product.getDescription());
        assertEquals(CHAIR_PRICE, product.getPrice());

        product = products.get(1);
        assertEquals(TABLE_DESCRIPTION, product.getDescription());
        assertEquals(TABLE_PRICE, product.getPrice());
    }

}
