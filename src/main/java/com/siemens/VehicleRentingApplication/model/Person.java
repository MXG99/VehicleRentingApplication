package com.siemens.VehicleRentingApplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
public class Person {
    @Getter @Setter
    private String PIN;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private LocalDate dateOfBirth;
    @Getter @Setter
    private Gender gender;
    @Getter @Setter
    private LocalDate issuingDateDL;

    @Override
    public String toString() {
        return "Person{" +
                "PIN='" + PIN + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", issuingDateDL=" + issuingDateDL +
                '}';
    }
}
