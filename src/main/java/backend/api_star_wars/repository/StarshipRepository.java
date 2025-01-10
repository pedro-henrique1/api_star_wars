package backend.api_star_wars.repository;

import backend.api_star_wars.model.Starship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarshipRepository extends JpaRepository<Starship, Long> {
}
