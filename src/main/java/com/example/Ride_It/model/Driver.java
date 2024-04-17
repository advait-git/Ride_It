package com.example.Ride_It.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="driver")
@Builder
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String email;
    int age;
    String panNumber;
    @Column(unique = true , nullable = false)
    String phNo;

    double rating;

    @OneToOne(mappedBy = "driver" , cascade = CascadeType.ALL)
    Cab cab;
    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> booking = new ArrayList<>();

}
