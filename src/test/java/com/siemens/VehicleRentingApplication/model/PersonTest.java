package com.siemens.VehicleRentingApplication.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void test() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.parse("06/10/1999", formatter);
        LocalDate issuingDateDL = LocalDate.parse("30/10/2018", formatter);
        Person person = new Person(
                "1234",
                "George",
                "Balota",
                dateOfBirth,
                Gender.MALE,
                issuingDateDL
        );
        assert (person.getPIN() == "1234");
    }

}