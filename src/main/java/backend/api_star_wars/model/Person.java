package backend.api_star_wars.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "people")
@Data
public class Person {

    @Id
    private Long id;
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private LocalDateTime created = LocalDateTime.now();
    private LocalDateTime edited = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "homeworld")
    private Planet homeworld;

    @ManyToMany(mappedBy = "characters")
    private List<Film> films;

}
