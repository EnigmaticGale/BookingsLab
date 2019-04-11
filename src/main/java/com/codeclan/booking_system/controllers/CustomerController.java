package com.codeclan.booking_system.controllers;


import com.codeclan.booking_system.repositories.BookingRepository.BookingRepository;
import com.codeclan.booking_system.repositories.CourseRepository.CourseRepository;
import com.codeclan.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;
}
