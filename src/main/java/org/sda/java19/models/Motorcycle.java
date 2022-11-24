package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Motorcycle extends Vehicle {
    private float topSpeed;
    private VehicleShape vehicleShape;
}