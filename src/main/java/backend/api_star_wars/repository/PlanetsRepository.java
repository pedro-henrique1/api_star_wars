package backend.api_star_wars.repository;

import backend.api_star_wars.model.Planets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetsRepository extends JpaRepository<Planets, Integer> {
     String searchPlanetsByName(String name);
}
