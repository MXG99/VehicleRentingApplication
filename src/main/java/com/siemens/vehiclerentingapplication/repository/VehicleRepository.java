package com.siemens.vehiclerentingapplication.repository;

import com.siemens.vehiclerentingapplication.model.Vehicle;
import com.siemens.vehiclerentingapplication.model.VehicleType;
import com.siemens.vehiclerentingapplication.repository.queries.VehicleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VehicleRepository implements IRepository<Vehicle> {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VehicleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private Vehicle mapRowToVehicle(final ResultSet resultSet, int rowNum) throws SQLException {
        return new Vehicle(
                resultSet.getString("reg_no").strip(),
                VehicleType.valueOf(resultSet.getString("veh_type").strip()),
                resultSet.getInt("year"),
                resultSet.getString("brand").strip(),
                resultSet.getString("color").strip()
        );
    }

    public List<Vehicle> findAllSortedByManufacturingYear() {
        String sql = VehicleQuery.FIND_ALL_SORTED_BY_MANUFACTURING_YEAR;
        return jdbcTemplate.query(sql, this::mapRowToVehicle);
    }

    public List<Vehicle> findAllSortedByBrand() {
        String sql = VehicleQuery.FIND_ALL_SORTED_BY_BRAND;
        return jdbcTemplate.query(sql, this::mapRowToVehicle);
    }

    @Override
    public List<Vehicle> findAll() {
        String sql = VehicleQuery.FIND_ALL;
        return jdbcTemplate.query(sql, this::mapRowToVehicle);
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
