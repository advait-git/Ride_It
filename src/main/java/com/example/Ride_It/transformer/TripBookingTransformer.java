package com.example.Ride_It.transformer;

import com.example.Ride_It.Enum.TripStatus;
import com.example.Ride_It.dto.request.TripRequest;
import com.example.Ride_It.dto.response.TripBookingResponse;
import com.example.Ride_It.model.Customer;
import com.example.Ride_It.model.TripBooking;

import java.util.UUID;

public class TripBookingTransformer {
    public static TripBooking bookingRequestToBooking(TripRequest tripRequest){
    return TripBooking.builder()
            .bookingId(String.valueOf(UUID.randomUUID()))
            .source(tripRequest.getSource())
            .destination(tripRequest.getDestination())
            .tripStatus(TripStatus.ONGOING)
            .build();
    }
    public static TripBookingResponse bookingToBookingResponse(TripBooking tripBooking){
        return TripBookingResponse.builder()
                .bookingId(tripBooking.getBookingId())
                .source(tripBooking.getSource())
                .destination(tripBooking.getDestination())
                .totalKm(tripBooking.getTotalKm())
                .totalFair(tripBooking.getTotalFair())
                .tripStatus(tripBooking.getTripStatus())
                .bookedAt(tripBooking.getBookedAt())
                .customerResponse(CustomerTransformer.customerToCustomerResponse(tripBooking.getCustomer()))
                .driverResponse(DriverTransformer.driverToDriverResponse(tripBooking.getDriver()
                ))
                .build();
    }
}
