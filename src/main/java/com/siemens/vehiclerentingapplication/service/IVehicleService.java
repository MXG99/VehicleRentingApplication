package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import com.siemens.vehiclerentingapplication.model.VehicleType;

import java.util.List;

public interface IVehicleService<Vehicle> {
    List<Vehicle> getVehicleListSortedByManufacturingYear();

    List<Vehicle> getVehicleListSortedByBrand();

    List<Vehicle> getVehicleByType(VehicleType type);
}
