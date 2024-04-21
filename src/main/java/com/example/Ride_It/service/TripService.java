package com.example.Ride_It.service;

import com.example.Ride_It.dto.request.TripRequest;
import com.example.Ride_It.dto.response.TripBookingResponse;
import com.example.Ride_It.exception.CabNotAvailableException;
import com.example.Ride_It.exception.CustomerNotFoundException;
import com.example.Ride_It.model.Cab;
import com.example.Ride_It.model.Customer;
import com.example.Ride_It.model.Driver;
import com.example.Ride_It.model.TripBooking;
import com.example.Ride_It.repository.CabRepository;
import com.example.Ride_It.repository.CustomerRepository;
import com.example.Ride_It.repository.DriverRepository;
import com.example.Ride_It.repository.TripBookingRepository;
import com.example.Ride_It.transformer.TripBookingTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TripService {
    private final TripBookingRepository tripBookingRepository;
    private final CustomerRepository customerRepository;
    private final CabRepository cabRepository;
    private final DriverRepository driverRepository;
    public TripBookingResponse bookCab(boolean applyCoupon, TripRequest tripRequest) {

        //validate the email id of customer
        Customer customer = customerRepository.findByEmail(tripRequest.getEmail());
        if (customer == null) {
            throw new CustomerNotFoundException("Invalid email id");
        }
        //check if the cab is available or not
        //get random available cab
        Cab cab = cabRepository.getRandomAvailableCab();
        if (cab == null) {
            throw new CabNotAvailableException("Sry Cab Not Found !!");
        }

        //prepare the booking entity
        TripBooking tripBooking = TripBookingTransformer.bookingRequestToBooking(tripRequest);
        tripBooking.setTotalFair(cab.getFairPerKm() * tripRequest.getTotalKm());
        tripBooking.setCustomer(customer);
        tripBooking.setDriver(cab.getDriver());

        TripBooking saveTripBooking = tripBookingRepository.save(tripBooking);

        customer.getBooking().add(saveTripBooking);
        cab.setAvailable(false);
        cab.getDriver().getBooking().add(saveTripBooking);

        customerRepository.save(customer); //customer + booking
        driverRepository.save(cab.getDriver()); // driver will save driver+cab+booking
        // (here booking is coming twice and making diff)
        //by saving the tripbooking which has a primary key and now if we save it will overwrite on it

        //last step-> prepare booking response
        return TripBookingTransformer.bookingToBookingResponse(saveTripBooking);
    }
}

