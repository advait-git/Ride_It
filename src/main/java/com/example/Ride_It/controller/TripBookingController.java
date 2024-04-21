package com.example.Ride_It.controller;

import com.example.Ride_It.dto.request.TripRequest;
import com.example.Ride_It.dto.response.TripBookingResponse;
import com.example.Ride_It.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trip")

public class TripBookingController {

    private final TripService tripService;
    public TripBookingController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping("/book")
    public ResponseEntity<TripBookingResponse> bookCab(@RequestParam(value = "apply-coupon", required = false , defaultValue = "false")
                                           boolean applyCoupon,
                                         @RequestBody TripRequest tripRequest){
        TripBookingResponse response=tripService.bookCab(applyCoupon,tripRequest);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }




}
