package backend.api_star_wars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "transport")
@Data
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp edited;
    private String consumables;
    private String name;
    private Timestamp created;
    private Long cargoCapacity;
    private Integer passengers;
    private Integer maxAtmospheringSpeed;
    private Integer crew;
    private Double length;
    private String model;
    private Long costInCredits;
    private String manufacturer;


}
