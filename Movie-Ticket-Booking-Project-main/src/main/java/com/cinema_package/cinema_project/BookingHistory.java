package com.cinema_package.cinema_project;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class BookingHistory {

    @Id
    @SequenceGenerator(
            name = "movie_id_sequence",
            sequenceName = "movie_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_id_sequence"
    )
    private int id;
    private String title;
    private LocalDate date;
    private String location;
    private int bookedTickets;
    private int totalPrice;


    public BookingHistory(int id, String title,LocalDate date, String location, int bookedTickets, int totalPrice) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.location = location;
        this.bookedTickets = bookedTickets;
        this.totalPrice = totalPrice;
    }

    public BookingHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(int bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}


