package com.example.Ride_It.dto.request;

import com.example.Ride_It.Enum.CarType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CabRequest {
    String carModel;
    String company;
    String cabNo;
    CarType carType;
    int noOfSeats;
    double fairPerKm;
}
