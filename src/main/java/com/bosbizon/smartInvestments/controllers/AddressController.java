package com.bosbizon.smartInvestments.controllers;

import com.bosbizon.smartInvestments.entity.AddressMaster;
import com.bosbizon.smartInvestments.payload.AddressDTO;
import com.bosbizon.smartInvestments.service.AddressServiceImpl;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/address")
public class AddressController {

    private static final Logger LOG = LoggerFactory.getLogger(AddressController.class);
    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressServiceImpl addressService;

    @ResponseBody
    @RequestMapping(value = "/newAddress", method = RequestMethod.POST)
    public AddressDTO addNewAddress(@RequestBody AddressDTO newAddress) {
        AddressMaster newAddressEntity =modelMapper.map(newAddress,AddressMaster.class);
        LOG.info("GET called on /hello resource");
        return modelMapper.map(addressService.createAddress(newAddressEntity),AddressDTO.class);
    }

    @ResponseBody
    @RequestMapping(value = "/getAddress", method = RequestMethod.GET)
    public List<AddressDTO> getAddress() {
        List<AddressMaster> addressList = addressService.getAllAddress();
        List addressDTOs = new ArrayList<>();
        for(AddressMaster eachAddress:addressList){
            addressDTOs.add(modelMapper.map(eachAddress,AddressDTO.class));
        }
        return addressDTOs;
    }

}
