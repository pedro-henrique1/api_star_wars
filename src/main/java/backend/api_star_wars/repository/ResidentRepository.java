package backend.api_star_wars.repository;

import backend.api_star_wars.model.Residents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Residents, Long> {
}
