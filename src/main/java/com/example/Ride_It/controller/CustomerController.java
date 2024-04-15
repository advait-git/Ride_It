package com.example.Ride_It.controller;

import com.example.Ride_It.dto.request.CustomerRequest;
import com.example.Ride_It.dto.request.UpdateCustomerEmail;
import com.example.Ride_It.dto.response.CustomerResponse;
import com.example.Ride_It.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest customerRequest){
        CustomerResponse response=customerService.addCustomer(customerRequest);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<String> updateCustomer(@RequestBody UpdateCustomerEmail updateCustomerEmail){
        int Id=updateCustomerEmail.getId();
        String email=updateCustomerEmail.getEmail();
        String response=customerService.updateCustomer(Id , email);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@RequestParam int Id){
        String response= customerService.deleteCustomer(Id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
