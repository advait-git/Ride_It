package com.example.Ride_It.dto.response;

import com.example.Ride_It.Enum.TripStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TripBookingResponse {
    String bookingId; //uuid
    String source;
    String destination;
    Double totalKm;
    Double totalFair;
    TripStatus tripStatus;
    Date bookedAt;

    CustomerResponse customerResponse;

    DriverResponse driverResponse; //cab response is in driver response

}
