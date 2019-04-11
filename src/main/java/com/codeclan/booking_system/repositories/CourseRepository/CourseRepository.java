package com.codeclan.booking_system.repositories.CourseRepository;

import com.codeclan.booking_system.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{
    List<Course> getCoursesByRating(int starRating) ;

}
