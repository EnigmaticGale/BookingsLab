package com.codeclan.booking_system.repositories.CourseRepository;

import com.codeclan.booking_system.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesByRating(int starRating) ;
}
