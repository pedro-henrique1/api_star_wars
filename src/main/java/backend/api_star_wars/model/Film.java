package backend.api_star_wars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "films")
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer episodeId;
    private String director;
    private String producer;
    private Date releaseDate;
    private String openingCrawl;
    private Timestamp created;
    private Timestamp edited;

    @ManyToMany
    @JoinTable(
            name = "film_planets",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id")
    )
    private List<Planet> planets;

    @ManyToMany
    @JoinTable(
            name = "film_characters",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<Person> characters;

    @ManyToMany
    @JoinTable(
            name = "film_species",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "species_id")
    )
    private List<Species> species;
}
