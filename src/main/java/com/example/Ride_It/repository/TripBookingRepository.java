package com.example.Ride_It.repository;

import com.example.Ride_It.model.Coupon;
import com.example.Ride_It.model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking,Integer> {

}
