package com.ita.edu.teachua.api.models.city;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {
    private Integer id;
    private String name;
    private Float latitude;
    private Float longitude;
}
