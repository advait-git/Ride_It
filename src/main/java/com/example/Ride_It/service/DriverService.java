package com.example.Ride_It.service;

import com.example.Ride_It.dto.request.CabRequest;
import com.example.Ride_It.dto.request.DriverRequest;
import com.example.Ride_It.model.Cab;
import com.example.Ride_It.model.Driver;
import com.example.Ride_It.repository.DriverRepository;
import com.example.Ride_It.transformer.CabTransformer;
import com.example.Ride_It.transformer.DriverTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {

   public final DriverRepository driverRepository;

    public String addDriver(DriverRequest driverRequest) {
        //convert cabreq to entity from driver as driver hab cabReq
        CabRequest cabRequest = driverRequest.getCabRequest();
        //driver req to driver save
        //cab req to cab save

        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
        Cab cab = CabTransformer.cabRequestToCab(cabRequest);

        //set the relationship between cab and driver for cascading
        driver.setCab(cab);
        cab.setDriver(driver);

        driverRepository.save(driver); //this will save bath driver and cab as we used cascading opra
        return "driver and cab are saved !!";
    }
}
