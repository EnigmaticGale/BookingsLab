package com.codeclan.booking_system.components;


import com.codeclan.booking_system.models.Booking;
import com.codeclan.booking_system.models.Course;
import com.codeclan.booking_system.models.Customer;
import com.codeclan.booking_system.repositories.BookingRepository.BookingRepository;
import com.codeclan.booking_system.repositories.CourseRepository.CourseRepository;
import com.codeclan.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
//
        Customer customer1 = new Customer("dan", "Edin",52 );
        customerRepository.save(customer1);
        Customer customer2 = new Customer("don", "Glas",45 );
        customerRepository.save(customer2);

        Customer customer3 = new Customer("din", "Aber",12 );
        customerRepository.save(customer3);

        Customer customer4 = new Customer("deen", "Edin",22 );
        customerRepository.save(customer4);

        Course course1 = new Course("C++", "Edin", 5);
        courseRepository.save(course1);

        Course course2 = new Course("F#", "Edin", 4);
        courseRepository.save(course2);

        Course course3 = new Course("javascript", "Glas", 1);
        courseRepository.save(course3);

        Booking booking1 = new Booking("11/11/11",customer1,course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("11/11/12",customer2,course3);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("11/11/13",customer3,course3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("11/11/14",customer4,course1);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("11/11/15",customer4,course2);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("11/11/16",customer2,course1);
        bookingRepository.save(booking6);
    }
}
