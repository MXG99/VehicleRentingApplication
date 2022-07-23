package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/persons")
    public String getAllPersons(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "persons";
    }
}
