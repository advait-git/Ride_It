package com.example.Ride_It.service;

import com.example.Ride_It.dto.request.CustomerRequest;
import com.example.Ride_It.model.Customer;
import com.example.Ride_It.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public String addCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAge(customerRequest.getAge());
        customer.setEmail(customerRequest.getEmail());
        customer.setAddress(customerRequest.getAddress());
        customer.setGender(customerRequest.getGender());

       Customer savedCustomer = customerRepository.save(customer);
       return "Customer data saved";
    }
}
