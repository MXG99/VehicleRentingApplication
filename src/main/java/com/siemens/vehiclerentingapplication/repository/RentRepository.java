package com.siemens.vehiclerentingapplication.repository;

import com.siemens.vehiclerentingapplication.model.Rent;
import com.siemens.vehiclerentingapplication.repository.queries.RentQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class RentRepository implements IRepository<Rent> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private Rent mapRowToRent(final ResultSet resultSet, int rowNum) throws SQLException {
        return new Rent(
                resultSet.getInt("r_id"),
                resultSet.getDate("start_date").toLocalDate(),
                resultSet.getDate("end_date").toLocalDate(),
                resultSet.getInt("kilometers"),
                resultSet.getString("pin").strip(),
                resultSet.getString("reg_no").strip()
        );
    }

    @Override
    public List<Rent> findAll() {
        String sql = RentQuery.FIND_ALL;
        return jdbcTemplate.query(sql, this::mapRowToRent);
    }

    @Override
    public Rent findOne(int id) {
        return null;
    }

    @Override
    public void update(Rent entity) {

    }

    @Override
    public Boolean delete(Rent entity) {
        return null;
    }

    @Override
    public Rent save(Rent entity) {
        String sql = RentQuery.INSERT;
        jdbcTemplate.update(sql, entity.getStartDate(), entity.getEndDate(), entity.getKillometers(), entity.getPIN(), entity.getRegistrationNumber());
        return entity;
    }
}
