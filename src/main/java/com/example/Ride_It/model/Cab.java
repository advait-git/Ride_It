package com.example.Ride_It.model;

import com.example.Ride_It.Enum.CarType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="cab")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String carModel;
    String company;
    @Column(unique = true ,nullable = false)
    String cabNo;
    @Enumerated(EnumType.STRING)
    CarType carType;
    int noOfSeats;
    double fairPerKm;

    @OneToOne
    @JoinColumn
    Driver driver;

}
