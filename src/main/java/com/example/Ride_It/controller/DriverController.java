package com.example.Ride_It.controller;

import com.example.Ride_It.dto.request.DriverRequest;
import com.example.Ride_It.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/driver")
@RequiredArgsConstructor

public class DriverController {
    private final DriverService driverService;


    @PostMapping
    public ResponseEntity<String> addDriver (@RequestBody DriverRequest driverRequest){
        String response = driverService.addDriver(driverRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
