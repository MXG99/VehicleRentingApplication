package com.siemens.vehiclerentingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class VehicleRentingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRentingApplication.class, args);
	}
}
