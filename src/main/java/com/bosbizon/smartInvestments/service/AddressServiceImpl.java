package com.bosbizon.smartInvestments.service;

import com.bosbizon.smartInvestments.entity.AddressMaster;
import com.bosbizon.smartInvestments.entity.repo.AddressMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressMasterRepo addressRepo;

    @Override
    public List<AddressMaster> getAllAddress(){
        return addressRepo.findAll();
    }

    @Override
    public AddressMaster getAddressById(long id){
        Optional<AddressMaster> optionalAddress=addressRepo.findById(id);
        if (optionalAddress.isPresent()) {
            return optionalAddress.get();
        }
        return null;
    }

    @Override
    public AddressMaster createAddress(AddressMaster newAddress){
        return addressRepo.save(newAddress);
    }

}
