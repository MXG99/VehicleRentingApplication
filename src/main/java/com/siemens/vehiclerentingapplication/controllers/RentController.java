package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.model.Person;
import com.siemens.vehiclerentingapplication.service.RentalsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class RentController {
    private final RentalsService rentalsService;
    private Logger logger = Logger.getLogger(RentController.class.getName());

    public RentController(RentalsService rentalsService) {
        this.rentalsService = rentalsService;
    }

    @RequestMapping("/rentals")
    public String getAllRentals(Model model) {
        model.addAttribute("rentals", rentalsService.getAllRentedVehicles());
        return "rentals/list";
    }

    @RequestMapping("/rentals/history")
    public String getInformationAboutRental(Model model, @RequestParam String registrationNumber) {
        model.addAttribute("reg_no", registrationNumber);
        model.addAttribute("rentals", rentalsService.getRentalsByRegistrationNumber(registrationNumber));
        return "rentals/rental";
    }

    @PostMapping("/rentals/rent")
    public String rentVehicle(@ModelAttribute("person") Person person, @RequestParam String registrationNumber) {
        logger.info("Renting vehicle with registration number: " + registrationNumber);
        logger.info("Person: " + person.toString());

        rentalsService.rentVehicle(registrationNumber, person.getPIN());
        return "/utils/success";
    }
}
