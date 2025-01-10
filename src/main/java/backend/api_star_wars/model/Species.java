package backend.api_star_wars.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "species")
@Data
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String classification;
    private String name;
    private String designation;
    private String eyeColors;
    private String hairColors;
    private String skinColors;
    private String language;
    private Integer averageLifespan;
    private Integer averageHeight;
    private Timestamp created;
    private Timestamp edited;

    @ManyToOne
    @JoinColumn(name = "homeworld")
    private Planet homeworld;

    @ManyToMany(mappedBy = "species")
    private List<Film> films;
}
