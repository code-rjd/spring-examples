package com.coderjd.practice.service;

import com.coderjd.practice.model.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingService {

        private Booking booking;

        //we will ask this to spring
        public void printBooking() {
            System.out.println("Booking Details are: " + booking);
        }
}