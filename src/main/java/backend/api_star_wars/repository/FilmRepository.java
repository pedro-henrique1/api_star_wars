package backend.api_star_wars.repository;

import backend.api_star_wars.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
