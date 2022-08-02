package com.siemens.vehiclerentingapplication.repository.queries;

public class PersonQuery {
    public static final String FIND_ALL = "SELECT * FROM persons";
    public static final String INSERT = "INSERT INTO persons (pin, first_name, last_name, gender, birth_year) VALUES (?, ?, ?, ?, ?) ON CONFLICT DO NOTHING";
}
