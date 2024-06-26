# Movie-Ticket-System
This is a project with a goal to develop a backend system for a movie ticket booking platform that allows users to search for movies, book tickets,and view booking history. The project is built using Java and Spring Boot framework.

## Features
* Browse Movies: Users can view a list of available movies.
* Search and Filter: Users can search for movies based on title.
* Movie Details: Users can view detailed information about a specific movie, including title, director, description, genre, date, location, total seats, available seats, and price of ticket.
* Booking Tickets: Users can book tickets for a movie by specifying the movie ID, quantity of tickets, and total price.
* Booking History: Users can view their booking history, which includes details of movies they have booked, such as title, director, description, genre, date, location, booked tickets, and total price.
* Add/Delete/Update Movies: Admin users can add new movies, delete existing movies, and update movie information from Database

## Technologies
Java,
Maven,
Spring Boot,
Spring Data JPA,
Spring Boot Starter-Web
Postman,
PostgreSQL Database
HTML

## API Endpoints
* GET /movie: Get a list of movies.
* GET /movie/{id}: Get detailed information about a specific movie.
* GET /movie?date=2024-05-10: Get a list of movies based on date.
* GET /movie?title=Whiplash: Get a list of movies based on title.
* GET /movie?location=Cineplexx: Get a list of movies based on location.
* POST /movie: Add a new movie.
* POST /movie/booking/{movieId}/{tickets}: Create a new booking.
* DELETE /movie/{movieId}: Delete a movie.
* PUT /movie/{movieId}: Update movie information.

## ScreenShots
<img src = "https://github.com/16AbhishekAnand/Movie-Ticket-Booking/blob/main/Movie-Ticket-Booking-Project-main/Screenshots/Screenshot%20(99).png?raw=true" 
alt="json data" width="500"/> 

<img src="https://github.com/16AbhishekAnand/Movie-Ticket-Booking/blob/main/Movie-Ticket-Booking-Project-main/Screenshots/Screenshot%20(100).png?raw=true"  alt="List of Movies"  width="500"/>

<img src = "https://github.com/16AbhishekAnand/Movie-Ticket-Booking/blob/main/Movie-Ticket-Booking-Project-main/Screenshots/Screenshot%20(101).png?raw=true" alt="Movie Details" width="500"/>

<img src = "https://github.com/16AbhishekAnand/Movie-Ticket-Booking/blob/main/Movie-Ticket-Booking-Project-main/Screenshots/Screenshot%20(102).png?raw=true" alt = "Booking Details" width = "500">



