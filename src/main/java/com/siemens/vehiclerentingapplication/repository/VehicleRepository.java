package com.siemens.vehiclerentingapplication.repository;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleRepository implements IRepository<Vehicle> {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VehicleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Vehicle> findAll() {
        return null;
    }

    @Override
    public Vehicle findOne(int id) {
        return null;
    }

    @Override
    public void update(Vehicle entity) {

    }

    @Override
    public Boolean delete(Vehicle entity) {
        return null;
    }

    @Override
    public Vehicle save(Vehicle entity) {
        return null;
    }
}
