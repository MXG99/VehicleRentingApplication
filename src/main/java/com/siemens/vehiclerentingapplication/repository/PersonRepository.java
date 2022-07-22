package com.siemens.vehiclerentingapplication.repository;

import com.siemens.vehiclerentingapplication.model.Gender;
import com.siemens.vehiclerentingapplication.model.Person;
import com.siemens.vehiclerentingapplication.repository.queries.PersonQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonRepository implements IRepository<Person> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private Person mapRowToPerson(final ResultSet resultSet, int rowNum) throws SQLException {
        return new Person(
                resultSet.getString("pin").strip(),
                resultSet.getString("first_name").strip(),
                resultSet.getString("last_name").strip(),
                Gender.valueOf(resultSet.getString("gender").strip()),
                resultSet.getInt("birth_year")
        );
    }

    @Override
    public List<Person> findAll() {
        String sql = PersonQuery.FIND_ALL;
        List<Person> personList = jdbcTemplate.query(sql, this::mapRowToPerson);
        System.out.println(personList.size());
        return personList;
    }

    @Override
    public Person findOne(int id) {
        return null;
    }

    @Override
    public void update(Person entity) {
    }

    @Override
    public Boolean delete(Person entity) {
        return null;
    }

    @Override
    public Person save(Person entity) {
        return null;
    }
}
