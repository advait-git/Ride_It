package com.example.Ride_It.controller;

import com.example.Ride_It.dto.request.DriverRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {
    @PostMapping
    public ResponseEntity<String> addDriver (@RequestBody DriverRequest driverRequest){
        return null;
    }
}
