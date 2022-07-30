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
import java.util.logging.Logger;

@Repository
public class VehicleRepository implements IRepository<Vehicle> {


    private final JdbcTemplate jdbcTemplate;
    private Logger logger = Logger.getLogger(VehicleRepository.class.getName());

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
        logger.info("Executing query: " + sql);
        return jdbcTemplate.query(sql, this::mapRowToVehicle);
    }

    public List<Vehicle> findAllSortedByBrand() {
        String sql = VehicleQuery.FIND_ALL_SORTED_BY_BRAND;
        logger.info("Executing query: " + sql);
        return jdbcTemplate.query(sql, this::mapRowToVehicle);
    }

    @Override
    public List<Vehicle> findAll() {
        String sql = VehicleQuery.FIND_ALL;
        logger.info("Executing query: " + sql);
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
        return Boolean.FALSE;
    }

    @Override
    public Vehicle save(Vehicle entity) {
        return null;
    }

    public Vehicle findByRegistrationNumber(String registrationNumber) {
        String sql = VehicleQuery.FIND_BY_REGISTRATION_NUMBER;
        logger.info("Executing query: " + sql);
        return jdbcTemplate.queryForObject(sql, this::mapRowToVehicle, registrationNumber);
    }
}
