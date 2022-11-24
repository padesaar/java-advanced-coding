package org.sda.java19.services;

import org.sda.java19.models.Product;
import org.sda.java19.models.Warehouse;

import java.util.List;

public interface WarehouseService {
//add, display, update, and delete methods
    //summary method - display summaries

    /**
     * To add a warehouse
     * @param warehouse Warehouse
     */
    void addWarehouse(Warehouse warehouse);

    /**
     * To add a warehouse
     * @param
     */
    void deleteWarehouse();
    /**
     * To update a warehouse
     * @param warehouse Warehouse
     */

    void updateWarehouse(Warehouse warehouse);



    Warehouse getWarehouse();
}
