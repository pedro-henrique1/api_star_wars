package backend.api_star_wars.repository;

import backend.api_star_wars.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
