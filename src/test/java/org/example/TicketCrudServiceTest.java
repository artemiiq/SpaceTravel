package org.example;

import org.example.service.TicketCrudService;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketCrudServiceTest {
    private final TicketCrudService ticketService = new TicketCrudService();
    private final ClientCrudService clientService = new ClientCrudService();
    private final PlanetCrudService planetService = new PlanetCrudService();

    @Test
    void testTicketCrudOperations() {
        clientService.createClient("John Doe");
        planetService.createPlanet("EARTH", "Earth");
        planetService.createPlanet("MARS", "Mars");

        ticketService.createTicket(1L, "EARTH", "MARS");
        var ticket = ticketService.getTicket(1L);

        assertNotNull(ticket);
        assertEquals("John Doe", ticket.getClient().getName());
        assertEquals("Earth", ticket.getFromPlanet().getName());
        assertEquals("Mars", ticket.getToPlanet().getName());
    }

    @Test
    void testCannotCreateTicketWithInvalidData() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ticketService.createTicket(99L, "EARTH", "MARS"));
        assertTrue(exception.getMessage().contains("Client and planets must exist"));
    }
}
