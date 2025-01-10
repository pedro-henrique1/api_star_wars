package backend.api_star_wars.service;

import backend.api_star_wars.repository.PlanetsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetsService {

    private final PlanetsRepository planetsRepository;

    public PlanetsService(PlanetsRepository planetsRepository) {
        this.planetsRepository = planetsRepository;
    }

    public ResponseEntity<?> GetSearchPlanets(String planet) {
        List<?> result = planetsRepository.findPlanetsByName(planet);
        return ResponseEntity.ok(result);
    }
}
