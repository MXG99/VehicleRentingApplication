package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import com.siemens.vehiclerentingapplication.model.VehicleType;
import com.siemens.vehiclerentingapplication.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService<Vehicle> {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getVehicleListSortedByManufacturingYear() {
        return vehicleRepository.findAllSortedByManufacturingYear();
    }

    @Override
    public List<Vehicle> getVehicleListSortedByBrand() {
        return vehicleRepository.findAllSortedByBrand();
    }

    @Override
    public Vehicle getVehicleByType(VehicleType type) {
        return null;
    }
}
