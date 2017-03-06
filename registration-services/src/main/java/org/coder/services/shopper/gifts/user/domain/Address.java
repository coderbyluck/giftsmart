package org.coder.services.shopper.gifts.user.domain;

import lombok.Data;

/**
 * Created by coderbyluck on 3/4/17.
 */
@Data
public class Address {

    private String houseNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
