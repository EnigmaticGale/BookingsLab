package com.codeclan.booking_system.repositories.BookingRepository;

import com.codeclan.booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
