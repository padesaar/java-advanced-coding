package org.sda.java19.implementation;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Currency;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private final WarehouseService warehouseService = new WarehouseServiceImpl();

    @Override
    public void addProduct(Product product) {
        try {
            Warehouse warehouse = warehouseService.getWarehouse();
            List<Product> products = warehouse.getProducts();
            products.add(product);
            warehouse.setProducts(products);
            warehouseService.updateWarehouse(warehouse);
        } catch (WarehouseNotFoundException warehouseNotFoundException) {
            System.out.println(warehouseNotFoundException.getLocalizedMessage());
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            Scanner scanner = new Scanner(System.in);
            Warehouse warehouse = warehouseService.getWarehouse();
            List<Product> products = warehouse.getProducts();
            products.add(product);
            warehouse.setProducts(products);
            product.setName(scanner.next());
            product.setPrice(BigDecimal.valueOf(scanner.nextLong()));
            product.setProductCategory(ProductCategory.valueOf(scanner.next()));
            product.setQuantity(scanner.nextFloat());
            product.setCurrency(Currency.valueOf(scanner.next()));
            product.setAvailable(scanner.nextBoolean());
            warehouseService.updateWarehouse(warehouse);
        } catch (WarehouseNotFoundException warehouseNotFoundException) {
            System.out.println(warehouseNotFoundException.getLocalizedMessage());
        }
    }

    @Override
    public void deleteProductByName(String name) {
        try {
            Warehouse warehouse = warehouseService.getWarehouse();
            List<Product> products = warehouse.getProducts();
            products.remove(name);
            warehouse.setProducts(products);
            warehouseService.updateWarehouse(warehouse);
        } catch (WarehouseNotFoundException warehouseNotFoundException) {
            System.out.println(warehouseNotFoundException.getLocalizedMessage());
        }
    }

    @Override
    public List<Product> getProductByName(String name) throws WarehouseNotFoundException {
     Scanner scanner = new Scanner(System.in);
        return getAllProducts().stream()
                .filter(product -> product.getName().equals(scanner.nextLine()))
                .collect(Collectors.toList());

    }


    @Override
    public List<Product> getAllProductsByProductCategory(ProductCategory productCategory) throws WarehouseNotFoundException {
        return getAllProducts().stream()
                .filter(product -> product.getProductCategory().name().equals(productCategory.name()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getAllProducts() throws WarehouseNotFoundException {
        return warehouseService.getWarehouse().getProducts();
    }
}