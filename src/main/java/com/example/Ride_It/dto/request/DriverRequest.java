package com.example.Ride_It.dto.request;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverRequest {
    String name;
    String email;
    int age;
    String panNumber;
    String PhNo;
    CabRequest cabRequest;

}
