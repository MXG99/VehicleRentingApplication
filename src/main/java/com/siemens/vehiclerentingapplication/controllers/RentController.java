package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.service.RentalsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RentController {
    private final RentalsService rentalsService;

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
}
