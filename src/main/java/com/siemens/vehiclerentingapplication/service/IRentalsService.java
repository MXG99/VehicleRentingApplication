package com.siemens.vehiclerentingapplication.service;

import java.util.List;

public interface IRentalsService<Rent> {
    public List<Rent> getRentalsList();
    public Boolean rentVehicle(String registrationNumber, String PIN);
    public List<Rent> getRentalsListByPIN(String pin);
}
