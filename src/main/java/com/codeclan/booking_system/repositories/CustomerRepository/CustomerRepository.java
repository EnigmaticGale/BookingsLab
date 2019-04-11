package com.codeclan.booking_system.repositories.CustomerRepository;

import com.codeclan.booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
