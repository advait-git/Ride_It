package com.example.Ride_It.service;

import com.example.Ride_It.dto.request.CustomerRequest;
import com.example.Ride_It.dto.response.CustomerResponse;
import com.example.Ride_It.model.Customer;
import com.example.Ride_It.repository.CustomerRepository;
import com.example.Ride_It.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        //request dto to entity
       Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);
       //customer saved
       Customer savedCustomer = customerRepository.save(customer);
       //entity to response dto
       return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }

    public String updateCustomer(int Id , String email){
        customerRepository.updateCustomerEmail(Id,email);
        return "customer updated";
    }

    public String deleteCustomer(int Id){
        customerRepository.deleteCustomerRepo(Id);
        return "customer deleted";
    }
}
