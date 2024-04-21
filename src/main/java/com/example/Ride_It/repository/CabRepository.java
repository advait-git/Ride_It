package com.example.Ride_It.repository;

import com.example.Ride_It.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository extends JpaRepository<Cab,Integer> {
    @Query(value ="select * from cab where available = true order by rand() limit 1" ,nativeQuery = true)
    Cab getRandomAvailableCab();
}
