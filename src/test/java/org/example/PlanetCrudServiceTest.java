package org.example;

import org.example.service.PlanetCrudService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanetCrudServiceTest {
    private final PlanetCrudService service = new PlanetCrudService();

    @Test
    void testPlanetCrudOperations() {
        service.createPlanet("MARS", "Mars");
        var planet = service.getPlanet("MARS");
        assertNotNull(planet);
        assertEquals("Mars", planet.getName());

        service.updatePlanet("MARS", "Red Planet");
        assertEquals("Red Planet", service.getPlanet("MARS").getName());

        service.deletePlanet("MARS");
        assertNull(service.getPlanet("MARS"));
    }
}
