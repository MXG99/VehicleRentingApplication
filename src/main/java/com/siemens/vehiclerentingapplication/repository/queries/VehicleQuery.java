package com.siemens.vehiclerentingapplication.repository.queries;

public class VehicleQuery {
    public static final String FIND_ALL = "SELECT * FROM vehicles";
    public static final String FIND_ALL_SORTED_BY_MANUFACTURING_YEAR = "SELECT * FROM vehicles ORDER BY manufacturing_year";
    public static final String FIND_ALL_SORTED_BY_BRAND = "SELECT * FROM vehicles ORDER BY brand";
}
