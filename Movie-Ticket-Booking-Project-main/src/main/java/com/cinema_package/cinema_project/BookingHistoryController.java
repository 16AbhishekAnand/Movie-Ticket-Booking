package com.cinema_package.cinema_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingHistoryController {
    private final BookingHistoryService bookingHistoryService;

    @Autowired
    public BookingHistoryController(BookingHistoryService bookingHistoryService) {
        this.bookingHistoryService = bookingHistoryService;
    }

    @GetMapping("/histories")
    public List<BookingHistory> getBookingHistory() {
        return bookingHistoryService.getBookingHistory();
    }

    @PostMapping("/bookings")
    public BookingHistory bookTicket(@RequestBody BookingHistory bookHistory) {
        return bookingHistoryService.bookTicket(bookHistory);
    }
}
