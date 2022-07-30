package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Rent;
import com.siemens.vehiclerentingapplication.repository.RentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
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
    public Boolean rentVehicle(String registrationNumber, String PIN) {
        LocalDate endDate = LocalDate.now().plusMonths(1);
        Rent rent = new Rent(
                1,
                LocalDate.now(),
                endDate, new Random().nextInt(1000),
                PIN,
                registrationNumber
        );
        rentRepository.save(rent);
        return Boolean.TRUE;
    }

    @Override
    public List<Rent> getRentalsListByPIN(String pin) {
        return null;
    }
}
