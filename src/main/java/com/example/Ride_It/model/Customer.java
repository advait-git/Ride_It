package com.example.Ride_It.model;

import com.example.Ride_It.Enum.Gender;
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
@Table(name="customer")
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String name;

    int age;
@Column(unique = true,nullable = false)
    String email;

    String address;
@Enumerated(EnumType.STRING)
    Gender gender;

@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> booking = new ArrayList<>();
}
