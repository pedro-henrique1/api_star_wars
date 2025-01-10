package backend.api_star_wars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle extends Transport {
    private String vehicleClass;

    private List<Person> newPilots;
}
