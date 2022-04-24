package com.bosbizon.smartInvestments.payload;

import lombok.Data;


@Data
public class AddressDTO {

    public Long id;
    private String street1;
    private String street2;
    private String street3;
    private String unit;
    private String city;
    private String state;
    private String pin;
    private String country;
    private boolean active;
    private boolean verified;
}
