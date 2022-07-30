package com.siemens.vehiclerentingapplication.repository.queries;

public class RentQuery {
    public static final String FIND_ALL = "SELECT * FROM rentals";
    public static final String INSERT = "INSERT INTO rentals (start_date, end_date, kilometers, pin, reg_no) VALUES (?, ?, ?, ?, ?)";
}
