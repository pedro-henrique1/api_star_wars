package backend.api_star_wars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Starship extends Transport {
    private String hyperdriveRating;
    private String mglt;
    private String starshipClass;

    private List<Person> newPilots;
}
