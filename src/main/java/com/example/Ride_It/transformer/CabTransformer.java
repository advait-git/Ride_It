package com.example.Ride_It.transformer;

import com.example.Ride_It.dto.request.CabRequest;
import com.example.Ride_It.model.Cab;
import lombok.Builder;

public class CabTransformer {
    public static Cab cabRequestToCab(CabRequest cabRequest){
        return Cab.builder()
                .company(cabRequest.getCompany())
                .cabNo(cabRequest.getCabNo())
                .carModel(cabRequest.getCarModel())
                .carType(cabRequest.getCarType())
                .noOfSeats(cabRequest.getNoOfSeats())
                .fairPerKm(cabRequest.getFairPerKm())
                .build();
    }
}
