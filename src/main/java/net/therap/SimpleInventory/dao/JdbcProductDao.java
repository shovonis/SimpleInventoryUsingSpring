package net.therap.SimpleInventory.dao;

import net.therap.SimpleInventory.domain.Product;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */
public class JdbcProductDao extends SimpleJdbcDaoSupport implements ProductDao {

    @Override
    public List<Product> getProductList() {
        logger.info("Getting products!");
        List<Product> products = getSimpleJdbcTemplate().query(
                "select id, description, price from products",
                new ProductMapper());
        return products;
    }

    @Override
    public void saveProduct(Product prod) {
        logger.info("Saving product: " + prod.getDescription());
        int count = getSimpleJdbcTemplate().update(
                "update products set description = :description, price = :price where id = :id",
                new MapSqlParameterSource().addValue("description", prod.getDescription())
                        .addValue("price", prod.getPrice())
                        .addValue("id", prod.getId()));
        logger.info("Rows affected: " + count);
    }

    private static class ProductMapper implements ParameterizedRowMapper<Product> {

        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product prod = new Product();
            prod.setId(rs.getInt("id"));
            prod.setDescription(rs.getString("description"));
            prod.setPrice(new Double(rs.getDouble("price")));
            return prod;
        }

    }
}