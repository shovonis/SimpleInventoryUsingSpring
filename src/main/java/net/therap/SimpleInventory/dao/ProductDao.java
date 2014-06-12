package net.therap.SimpleInventory.dao;

import net.therap.SimpleInventory.domain.Product;

import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public interface ProductDao {
    public List<Product> getProductList();

    public void saveProduct(Product prod);
}
