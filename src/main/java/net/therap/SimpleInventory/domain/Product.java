package net.therap.SimpleInventory.domain;

import java.io.Serializable;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public class Product implements Serializable {
    private String description;
    private Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
