package backend.api_star_wars.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Planets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer rotation_period;

    private Integer orbital_period;

    private Integer diameter;

    private String climate;

    private String gravity;

    private String terrain;

    private Integer surface_water;

    private BigInteger population;

    @CreationTimestamp
    private Date created_at;

    @UpdateTimestamp
    private Date edited_at;

    @OneToMany(mappedBy = "planet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Residents> residents;

    @OneToMany(mappedBy = "planet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Films> films;
}
