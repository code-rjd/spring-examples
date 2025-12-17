package com.coderjd.practice;

import com.coderjd.practice.model.Address;
import com.coderjd.practice.model.Booking;
import com.coderjd.practice.service.BookingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
//        BookingService bookingService = new BookingService();
//        Booking booking = Booking.builder()
//                .id(1)
//                .price(200.00)
//                .address(
//                        Address.builder()
//                                .addressLine1("flat no -1, abc apt")
//                                .addressLine2("hadapsar").city("pune").build()
//                ).build();
//    bookingService.setBooking(booking);
//    bookingService.printBooking();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BookingService bookingService = context.getBean("bookingService", BookingService.class);
        bookingService.printBooking();
    }
}
