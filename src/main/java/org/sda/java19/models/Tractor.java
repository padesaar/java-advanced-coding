package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Tractor extends Vehicle {
    private float maxPulledWeight;
}