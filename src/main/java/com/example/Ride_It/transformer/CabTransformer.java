package com.example.Ride_It.transformer;

import com.example.Ride_It.dto.request.CabRequest;
import com.example.Ride_It.dto.response.CabResponse;
import com.example.Ride_It.model.Cab;
import lombok.Builder;

public class CabTransformer {
    public static Cab cabRequestToCab(CabRequest cabRequest){
        return Cab.builder()
                .cabNo(cabRequest.getCabNo())
                .carModel(cabRequest.getCarModel())
                .carType(cabRequest.getCarType())
                .available(true)
                .noOfSeats(cabRequest.getNoOfSeats())
                .fairPerKm(cabRequest.getFairPerKm())
                .build();
    }

    public static CabResponse cabToCabResponse(Cab cab){
        return CabResponse.builder()
                .cabNo(cab.getCabNo())
                .carModel(cab.getCarModel())
                .fairPerKm(cab.getFairPerKm())
                .build();
    }
}
