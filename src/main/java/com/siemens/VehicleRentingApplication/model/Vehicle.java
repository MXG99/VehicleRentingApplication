package com.siemens.VehicleRentingApplication.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Vehicle {
    @Getter @Setter
    private String registrationNumber;
    @Getter @Setter
    private VehicleType type;
    @Getter @Setter
    private Integer manufacturingYear;
    @Getter @Setter
    private String brand;
    @Getter @Setter
    private String colour;

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", type=" + type +
                ", manufacturingYear=" + manufacturingYear +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
