package com.siemens.vehiclerentingapplication.controllers;

import com.siemens.vehiclerentingapplication.repository.VehicleRepository;
import com.siemens.vehiclerentingapplication.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("vehicles", vehicleService.getVehicleListSortedByBrand());
        return "vehicles/list";
    }

    @RequestMapping("vehiclesByYear")
    public String getAllVehiclesByYear(Model model) {
        model.addAttribute("vehicles", vehicleService.getVehicleListSortedByManufacturingYear());
        return "vehicles/list";
    }

}
