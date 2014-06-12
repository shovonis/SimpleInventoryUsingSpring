package net.therap.SimpleInventory.service;

import net.therap.SimpleInventory.domain.Product;

import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */

public class SimpleProductManager implements ProductManager {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void increasePrice(int percentage) {
        // TODO
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}