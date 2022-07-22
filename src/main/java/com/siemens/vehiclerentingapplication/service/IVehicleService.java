package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.VehicleType;

import java.util.List;

public interface IVehicleService<T> {
    List<T> getVehicleListSortedByManufacturingYear();

    List<T> getVehicleListSortedByBrand();

    T getVehicleByType(VehicleType type);
}
