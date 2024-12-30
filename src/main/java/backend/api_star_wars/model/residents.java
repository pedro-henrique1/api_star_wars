package backend.api_star_wars.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "planet_residents")
@Getter
@Setter
public class residents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "planet_id", nullable = false)
    private planets planet_id;

    private String resident_url;

}
