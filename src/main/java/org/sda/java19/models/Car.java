package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Car extends Motorcycle {
    private VehicleTransmission vehicleTransmission;


}