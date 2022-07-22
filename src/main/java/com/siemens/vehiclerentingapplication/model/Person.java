package com.siemens.vehiclerentingapplication.model;

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
    private Gender gender;
    @Getter @Setter
    private int yearOfBirth;

    @Override
    public String toString() {
        return "Person{" +
                "PIN='" + PIN + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
