package com.siemens.vehiclerentingapplication.model.comparators;

import com.siemens.vehiclerentingapplication.model.Vehicle;

import java.util.Comparator;

public class VehicleBrandComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
