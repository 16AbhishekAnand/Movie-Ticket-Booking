package com.cinema_package.cinema_project;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookingHistoryService {
    private final BookingHistoryRepository bookinghistoryRepo;

    public BookingHistoryService(BookingHistoryRepository bookinghistoryRepo) {
        this.bookinghistoryRepo = bookinghistoryRepo;
    }

    public List<BookingHistory> getBookingHistory() {
        return bookinghistoryRepo.findAll();
    }

    public BookingHistory bookTicket(BookingHistory bookHistory) {
        if (bookHistory.getId() == 0) {
            throw new IllegalArgumentException("BookingHisory id can not be null");
        }
        if (bookHistory.getDate() == null) {
            throw new IllegalArgumentException("date can not be null");
        }
        if (bookHistory.getBookedTickets() == 0) {
            throw new IllegalArgumentException("Ticket can not be null");
        }
        if (bookHistory.getTotalPrice() == 0) {
            throw new IllegalArgumentException("Insufficient Amount");
        }
        if (bookHistory.getLocation() == null) {
            throw new IllegalArgumentException("location can not be null");
        }
        if (bookHistory.getTitle() == null) {
            throw new IllegalArgumentException("Title can not be null");
        }
        return bookinghistoryRepo.save(bookHistory);
    }

}

