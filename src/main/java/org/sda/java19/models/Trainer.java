package org.sda.java19.models;

import lombok.Data;
import org.sda.java19.models.Person;

/**
 *
 * Trainer model extends from base class
 */
@Data
public class Trainer extends Person {
    private boolean isAuthorized;
}
