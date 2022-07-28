package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Rent;
import com.siemens.vehiclerentingapplication.repository.RentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

@Service
public class RentalsService implements IRentalsService<Rent> {

    private final RentRepository rentRepository;

    public RentalsService(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    public static <T> Predicate<T> distinctByKey(Function<T, Object> function) {
        Set<Object> seen = new HashSet<>();
        return t -> seen.add(function.apply(t));
    }

    public List<Rent> getRentalsByRegistrationNumber(String registrationNumber) {
        return rentRepository.findAll().stream()
                .filter(rent -> rent.getRegistrationNumber().equals(registrationNumber)).toList();
    }

    public List<Rent> getAllRentedVehicles() {
        List<Rent> rentList = rentRepository.findAll();
        return rentList.stream().filter(distinctByKey(Rent::getRegistrationNumber)).toList();
    }

    @Override
    public List<Rent> getRentalsList() {
        return null;
    }

    @Override
    public Boolean rentVehicle(String registrationNumber) {
        return null;
    }

    @Override
    public List<Rent> getRentalsListByPIN(String pin) {
        return null;
    }
}
