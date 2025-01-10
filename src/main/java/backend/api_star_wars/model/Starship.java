package backend.api_star_wars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "starships")
@Data
public class Starship  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String MGLT;
    private String starshipClass;
    private String hyperdriveRating;

    @ManyToMany
    @JoinTable(
            name = "starship_pilots",
            joinColumns = @JoinColumn(name = "starship_id"),
            inverseJoinColumns = @JoinColumn(name = "pilot_id")
    )
    private List<Person> pilots;
}
