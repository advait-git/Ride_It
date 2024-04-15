package com.example.Ride_It.repository;

import com.example.Ride_It.model.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Transactional
    @Modifying
    @Query(value="update customer set email=:email where id=:Id", nativeQuery = true)
    public void updateCustomerEmail(int Id ,String email);

    @Transactional
    @Modifying
    @Query(value ="DELETE FROM customer WHERE id=:Id",nativeQuery = true)
    public void deleteCustomerRepo(int Id);
}
