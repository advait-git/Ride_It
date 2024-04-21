package com.example.Ride_It.dto.response;

import com.example.Ride_It.Enum.CarType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CabResponse {
    String carModel;
    String cabNo;
    double fairPerKm;
}
