package org.sda.java19.exceptions;


public class WarehouseNotFoundException extends Exception {
    public WarehouseNotFoundException(String name) {
        super(String.format("Warehouse(%s) not found!", name));
    }
}