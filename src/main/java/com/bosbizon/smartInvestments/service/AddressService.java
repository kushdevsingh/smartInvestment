package com.bosbizon.smartInvestments.service;

import com.bosbizon.smartInvestments.entity.AddressMaster;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<AddressMaster> getAllAddress();
    AddressMaster getAddressById(long id);
    AddressMaster createAddress(AddressMaster address);
//    AddressMaster updateAddress(AddressMaster address);
}
