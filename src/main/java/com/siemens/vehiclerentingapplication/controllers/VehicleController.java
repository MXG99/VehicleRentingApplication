package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {
    private final VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @RequestMapping("/vehicles")
    public String getAllVehicles(Model model) {
        model.addAttribute("vehicles", vehicleRepository.findAll());
        return "vehicles/list";
    }
}
