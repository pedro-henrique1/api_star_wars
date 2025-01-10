package backend.api_star_wars.repository;

import backend.api_star_wars.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecieRepository extends JpaRepository<Species, Long> {
}
