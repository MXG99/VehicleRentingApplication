package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import com.siemens.vehiclerentingapplication.model.VehicleType;

import java.util.List;

public class VehicleService implements IVehicleService<Vehicle> {
    @Override
    public List<Vehicle> getVehicleListSortedByManufacturingYear() {
        return null;
    }

    @Override
    public List<Vehicle> getVehicleListSortedByBrand() {
        return null;
    }

    @Override
    public Vehicle getVehicleByType(VehicleType type) {
        return null;
    }
}
