package com.example.Ride_It.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class DriverResponse {
    String name;
    String phNo;

    double rating;

    CabResponse cabResponse;
}
