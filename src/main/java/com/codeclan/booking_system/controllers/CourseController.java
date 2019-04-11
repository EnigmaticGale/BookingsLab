package com.codeclan.booking_system.controllers;


import com.codeclan.booking_system.models.Course;
import com.codeclan.booking_system.repositories.BookingRepository.BookingRepository;
import com.codeclan.booking_system.repositories.CourseRepository.CourseRepository;
import com.codeclan.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/starRating/{starRating}")
        public List<Course> getCoursesByRating(@PathVariable int starRating) {
            return courseRepository.getCoursesByRating(starRating);
    }

}
