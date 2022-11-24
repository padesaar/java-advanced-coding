package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class Vehicle {
    private String brand;
    private String model;
    private BigDecimal price;
}