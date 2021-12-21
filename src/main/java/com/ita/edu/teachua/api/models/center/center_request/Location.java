package com.ita.edu.teachua.api.models.center.center_request;

import lombok.Data;

@Data
public class Location {
    private String name;
    private String cityName;
    private String districtName;
    private String stationName;
    private String address;
    private String coordinates;
    private String phone;
    private double key;
}
