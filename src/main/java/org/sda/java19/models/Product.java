package org.sda.java19.models;


import lombok.Data;

import lombok.Getter;
import lombok.Setter;
import org.sda.java19.models.Currency;
import org.sda.java19.models.ProductCategory;

import java.math.BigDecimal;


@Data
@Setter
@Getter
public class Product {
    private String name;
    private BigDecimal price;
    private float quantity;
    private ProductCategory productCategory;
    private Currency currency;
    private boolean isAvailable;
}
