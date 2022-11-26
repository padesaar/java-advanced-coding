package org.sda.java19.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Data
@Setter
@Getter

public class Warehouse {
    private String name;
    private String address;
    private List<Product> products;
    private boolean isActive;
}
