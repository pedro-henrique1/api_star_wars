package backend.api_star_wars.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "planets")
@Data
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer rotation_period;

    private Integer orbital_period;

    private Integer diameter;

    private String climate;

    private String gravity;

    private String terrain;

    private Integer surface_water;

    private Long population;

    @OneToMany(mappedBy = "homeworld")
    private List<Person> residents;

    @ManyToMany(mappedBy = "planets")
    private List<Film> films;
}