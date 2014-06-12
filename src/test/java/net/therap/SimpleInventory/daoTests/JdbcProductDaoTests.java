package net.therap.SimpleInventory.daoTests;

import net.therap.SimpleInventory.dao.ProductDao;
import net.therap.SimpleInventory.domain.Product;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */

public class JdbcProductDaoTests extends AbstractTransactionalDataSourceSpringContextTests {

    private ProductDao productDao;


    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[]{"classpath:test-context.xml"};
    }

    @Override
    protected void onSetUpInTransaction() throws Exception {
        super.deleteFromTables(new String[]{"products"});
        super.executeSqlScript("file:/home/inventoryDb.sql", true);
    }

    public void testGetProductList() {

        List<Product> products = productDao.getProductList();

        assertEquals("wrong number of products?", 3, products.size());

    }

    public void testSaveProduct() {

        List<Product> products = productDao.getProductList();

        for (Product p : products) {
            p.setPrice(200.12);
            productDao.saveProduct(p);
        }

        List<Product> updatedProducts = productDao.getProductList();
        for (Product p : updatedProducts) {
            assertEquals("wrong price of product?", 200.12, p.getPrice());
        }

    }

}