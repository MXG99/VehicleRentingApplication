package com.siemens.vehiclerentingapplication.service;

import com.siemens.vehiclerentingapplication.model.Person;
import com.siemens.vehiclerentingapplication.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService<Person> {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person addPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person getPersonByPIN(String pin) {
        return null;
    }
}
