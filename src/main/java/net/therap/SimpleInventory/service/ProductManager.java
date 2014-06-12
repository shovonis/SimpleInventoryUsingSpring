package net.therap.SimpleInventory.service;

import net.therap.SimpleInventory.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}


