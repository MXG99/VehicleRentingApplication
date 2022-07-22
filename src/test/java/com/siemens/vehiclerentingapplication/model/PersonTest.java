package com.siemens.vehiclerentingapplication.model;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void test() {
        Person person = new Person(
                "1234",
                "George",
                "Balota",
                Gender.masculin,
                1999
        );
        assert (person.getPIN() == "1234");
    }

}