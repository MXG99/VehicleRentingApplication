package com.siemens.vehiclerentingapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
public class Rent {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private LocalDate startDate;

    @Getter
    @Setter
    private LocalDate endDate;

    @Getter
    @Setter
    private int killometers;

    @Getter
    @Setter
    private String PIN;

    @Getter
    @Setter
    private String registrationNumber;

    @Override
    public String toString() {
        return "Rent{" + "startDate=" + startDate + ", endDate=" + endDate + ", killometers=" + killometers + ", PIN='"
                + PIN + '\'' + ", registrationNumber='" + registrationNumber + '\'' + '}';
    }
}
