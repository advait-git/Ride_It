package com.example.Ride_It.transformer;

import com.example.Ride_It.dto.request.DriverRequest;
import com.example.Ride_It.model.Driver;

public class DriverTransformer {
    public static Driver driverRequestToDriver (DriverRequest driverRequest){
        return Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .phNo(driverRequest.getPhNo())
                .panNumber(driverRequest.getPanNumber())
                .rating(0)
                .build();
    }
}
