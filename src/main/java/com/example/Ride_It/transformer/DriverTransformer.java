package com.example.Ride_It.transformer;

import com.example.Ride_It.dto.request.DriverRequest;
import com.example.Ride_It.dto.response.DriverResponse;
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
    public static DriverResponse driverToDriverResponse (Driver driver){
        return DriverResponse.builder()
                .name(driver.getName())
                .rating(driver.getRating())
                .phNo(driver.getPhNo())
                .cabResponse(CabTransformer.cabToCabResponse(driver.getCab()))
                .build();
    }
}
