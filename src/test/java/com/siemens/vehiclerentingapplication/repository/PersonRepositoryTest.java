package com.siemens.vehiclerentingapplication.repository;

import com.siemens.vehiclerentingapplication.model.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void findAll() {
        List<Person> people = personRepository.findAll();
        assertEquals(1500, people.size());
        assertEquals("Voiculescu", people.get(0).getFirstName());
    }

}