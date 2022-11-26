package org.sda.java19;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.implementation.ProductServiceImpl;
import org.sda.java19.implementation.WarehouseServiceImpl;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.util.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Exerise-2
 *
 * 2. Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition(class inside a class) and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * “pliers:30”
 * “scissors:+4”
 * 1. Create a Warehouse, Product, ProductCategory(enum), Currency(enum) classes - models package
 * 2. Warehouse - name, list of products, address, isActive
 * 3. Product - name, price, quantity, product category, currency, isAvailable
 * 4. Create Warehouse object - should have prefilled data, Before create
 * list of products and then assign these do warehouse
 * 5. In main matter, switch case: for various operations
 * 6. For each method, call service method and do the operations
 */
public class Main {
    public static void main(String[] args) throws WarehouseNotFoundException {
        /*
        1. Create Warehouse, Product, ProductCategory (enum), Currency (enum) - models package
        2. Warehouse : name, List of Product, address, isActive
        3. Product: name, pricePerItem, quantity, product category, currency, isAvailable
        4. Create Warehouse object, Before create list of products.
        5. In main method, switch case for various operations.
        6. For each operation, call service method and do the operation
         */

        WarehouseService warehouseService = new WarehouseServiceImpl();
        Scanner scanner = new Scanner(System.in);

        //Initializing the warehouse
        Warehouse warehouse = new Warehouse();
        warehouse.setName("ABC E-POOD");
        warehouse.setAddress("Tallinn");
        warehouse.setActive(true);
        warehouse.setProducts(Data.getInitialProducts());

        warehouseService.addWarehouse(warehouse); // Adds new warehouse

        productOperations();
    }

    private static void productOperations() throws WarehouseNotFoundException {
        ProductService productService = new ProductServiceImpl();


        int option = getOption();

        switch(option) {
            case 0: //Add a product
                productService.addProduct(addProduct());
                break;
            case 1: //Update a product
                productService.updateProduct(updateProduct());
            case 2: // Display all the products
                productService.getAllProducts();
                break;
            case 3 : // Delete a product
                productService.deleteProductByName(" " + getAllProducts());
                break;
            case 4: //Exit
                break;
            default:
                System.out.println("Incorrect option, use the correct one!");
                getOption();


        }
    }
    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        // User should be able to: add, display all of the details, update, delete an item

        System.out.println("MENU OPTIONS:");
        System.out.println("-----------");

        List<String> menu = List.of("Add product, Update product, Display all products, Delete a product, Exit");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + ". " + menu.get(i));
        }
        System.out.println("Choose a menu from above:");
        return scanner.nextInt();


    }

    private static Product addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of the product:");
        System.out.println("Product name:");
        String productName = scanner.next();
        System.out.println("Product price:");
        float price = scanner.nextFloat();
        System.out.println("Choose a product category: " + Arrays.toString(ProductCategory.values()));
        ProductCategory productCategory = ProductCategory.valueOf(scanner.next());


        Product product = new Product();
        product.setName(productName);
        product.setPrice(BigDecimal.valueOf(price));
        product.setProductCategory(productCategory);

        return product;
    }

    private static List<Product> getAllProducts() throws WarehouseNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Products in the warehouse:");
        ProductServiceImpl productService = new ProductServiceImpl();

        return productService.getAllProducts();
    }
    private static Product updateProduct() throws WarehouseNotFoundException {
        //Need to display all the products and then ask user to which product to update.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Products in the warehouse:");
        ProductServiceImpl productService = new ProductServiceImpl();
        System.out.println("Choose a product to update: ");
        System.out.println(productService.getAllProducts());
       Product product = new Product();
        if(product.getName().equals(scanner.next())) {
            product.setName(scanner.next());
            product.setQuantity(scanner.nextFloat());
            product.setPrice(BigDecimal.valueOf(scanner.nextLong()));
            product.setProductCategory(ProductCategory.valueOf(scanner.next()));
        }

        return (Product) List.of(product);
    }

    private static Product deleteProductByName() throws WarehouseNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product to delete:");
        String productName = scanner.next();

        List<Product> products = getAllProducts();
        products.remove(productName);


        return (Product) products;
    }
}