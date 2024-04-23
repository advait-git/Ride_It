package com.example.Ride_It.model;

import com.example.Ride_It.Enum.TripStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="booking")
@Builder

public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String bookingId;
    String source;
    String destination;
    Double totalKm;
    Double totalFair;

    @Enumerated(EnumType.STRING)
    TripStatus tripStatus;

    @CreationTimestamp
    Date bookedAt;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @ManyToOne
    @JoinColumn
    Driver driver;
}
