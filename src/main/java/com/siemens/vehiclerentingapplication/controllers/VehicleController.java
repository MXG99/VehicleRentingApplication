package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.model.Gender;
import com.siemens.vehiclerentingapplication.model.Person;
import com.siemens.vehiclerentingapplication.model.VehicleType;
import com.siemens.vehiclerentingapplication.repository.VehicleRepository;
import com.siemens.vehiclerentingapplication.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping("/vehicles")
    public String getAllVehicles(Model model) {
        model.addAttribute("vehicles", vehicleService.getAllVehicles());
        return "vehicles/list";
    }

    @RequestMapping("vehiclesByBrand")
    public String getAllVehiclesByBrand(Model model) {
        model.addAttribute("vehicles", vehicleService.getVehicleListSortedByBrandLambda());
        return "vehicles/list";
    }

    @RequestMapping("vehiclesByYear")
    public String getAllVehiclesByYear(Model model) {
        model.addAttribute("vehicles", vehicleService.getVehicleListSortedByManufacturingYearLambda());
        return "vehicles/list";
    }

    @RequestMapping("vehiclesByType")
    public String getAllVehiclesByType(Model model, @RequestParam String type) {
        model.addAttribute("vehicles", vehicleService.getVehicleByType(VehicleType.valueOf(type)));
        return "vehicles/list";
    }

    @RequestMapping("vehicles/rent")
    public String getVehicleInformation(Model model, @RequestParam String registrationNumber) {
        Person person = new Person();
        model.addAttribute("person", person);
        model.addAttribute("reg_no", registrationNumber);
        model.addAttribute("vehicle", vehicleService.getVehicleByRegistrationNumber(registrationNumber));
        return "vehicles/rent";
    }
}
