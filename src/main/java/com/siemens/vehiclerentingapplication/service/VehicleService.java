package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import com.siemens.vehiclerentingapplication.model.VehicleType;
import com.siemens.vehiclerentingapplication.model.comparators.VehicleBrandComparator;
import com.siemens.vehiclerentingapplication.model.comparators.VehicleManufacturingYearComparator;
import com.siemens.vehiclerentingapplication.repository.VehicleRepository;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService<Vehicle> {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getVehicleListSortedByManufacturingYear() {
        List<Vehicle> vehicleList = vehicleRepository.findAll();
        vehicleList.sort(new VehicleManufacturingYearComparator());
        return vehicleList;
    }

    @Override
    public List<Vehicle> getVehicleListSortedByBrand() {
        List<Vehicle> vehicleList = vehicleRepository.findAll();
        vehicleList.sort(new VehicleBrandComparator());
        return vehicleList;
    }

    @Override
    public List<Vehicle> getVehicleByType(VehicleType type) {
        List<Vehicle> vehicleList = vehicleRepository.findAll();
        return vehicleList.stream().filter(vehicle -> vehicle.getType() == type).toList();
    }

    public Vehicle getVehicleByRegistrationNumber(String registrationNumber) {
        return vehicleRepository.findByRegistrationNumber(registrationNumber);
    }
}
