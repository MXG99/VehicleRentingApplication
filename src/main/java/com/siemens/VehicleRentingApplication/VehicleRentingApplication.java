package com.siemens.VehicleRentingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VehicleRentingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRentingApplication.class, args);
	}
}
