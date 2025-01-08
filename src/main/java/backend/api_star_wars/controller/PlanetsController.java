package backend.api_star_wars.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import backend.api_star_wars.service.PlanetsService;

@RestController
public class PlanetsController {

    private final PlanetsService planetsService;

    public PlanetsController(PlanetsService planetsService) {
        this.planetsService = planetsService;
    }

    @GetMapping
    public ResponseEntity<?> GetPlanets(@RequestParam String planet) {
        return planetsService.GetSearchPlanets(planet);
    }
}
