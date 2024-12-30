package backend.api_star_wars.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "planet_films")
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "planet_id", nullable = false)
    private Planets planet;

    private String film_url;
}
