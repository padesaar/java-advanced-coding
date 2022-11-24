package org.sda.java19.services;

import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;

import java.util.List;

/**
 *
 * Service to handle product related interactions
 * @author Kätlin Padesaar_Korela
 */

public interface ProductService {
    /**
     * To add a new peoduct
     * @param product Product
     */
    void addProduct(Product product);
    /**
     * To delete a product from warehouse
     * @param name Product
     */
    void deleteProductByName(String name);
    /**
     * To update an existing product in a warehouse
     * @param product Product
     * @return Product
     */
    void updateProduct (Product product);
    /**
     * To get a list of products from warehouse by a given product category
     * @param productCategory productCategory
     * @return list of products
     */
    List<Product> getAllProductsByProductCategory(ProductCategory productCategory);

    /**
     * To get a product by name from warehouse
     * @param name Product
     */
    Product getProductByName (String name);

    List<Product> getAllProducts();
}
