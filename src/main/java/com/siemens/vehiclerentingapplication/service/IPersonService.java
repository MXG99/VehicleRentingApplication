package com.siemens.vehiclerentingapplication.service;

import java.util.List;

public interface IPersonService<Person> {
    public List<Person> getAllPersons();
    public Person addPerson(Person person);
    public Person getPersonByPIN(String pin);
}
