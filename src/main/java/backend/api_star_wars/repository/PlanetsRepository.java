package backend.api_star_wars.repository;

import backend.api_star_wars.dto.PlanetDetailsDto;
import backend.api_star_wars.model.Planets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetsRepository extends JpaRepository<Planets, Integer> {
    //     @Query(value = "SELECT * FROM planets p INNER JOIN planet_films f on p.id = f.id WHERE p.name = :name", nativeQuery = true)
    @Query(value = """
                 SELECT p.name, p.rotation_period, p.orbital_period, p.diameter, p.climate, p.gravity, p.terrain,
                                    p.surface_water, p.population, p.created_at, p.edited_at, f.film_url\s
                               FROM
                                   planets p
                               LEFT JOIN
                                   planet_films f ON p.id = f.planet_id
                               WHERE
                                   p.name =  :name
            \s""", nativeQuery = true)
    List<PlanetDetailsDto> searchPlanetsByName(String name);
}
//SELECT * from planets left join api_star_wars.planet_films pf on planets.id = pf.planet_id where name = "Hoth";