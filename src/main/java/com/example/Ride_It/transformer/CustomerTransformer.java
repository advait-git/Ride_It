package com.example.Ride_It.transformer;

import com.example.Ride_It.dto.request.CustomerRequest;
import com.example.Ride_It.dto.response.CustomerResponse;
import com.example.Ride_It.model.Customer;

public class CustomerTransformer {
    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                .address(customerRequest.getAddress())
                .gender(customerRequest.getGender())
                .build();
    }
    public static CustomerResponse customerToCustomerResponse(Customer customer){
       return CustomerResponse.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
}
