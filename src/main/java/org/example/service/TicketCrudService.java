package org.example.service;

import org.example.dao.impl.TicketDaoImpl;
import org.example.dao.impl.ClientDaoImpl;
import org.example.dao.impl.PlanetDaoImpl;
import org.example.model.Ticket;
import org.example.model.Client;
import org.example.model.Planet;

import java.util.List;

public class TicketCrudService {
    private final TicketDaoImpl ticketDao = new TicketDaoImpl();
    private final ClientDaoImpl clientDao = new ClientDaoImpl();
    private final PlanetDaoImpl planetDao = new PlanetDaoImpl();

    public void createTicket(Long clientId, String fromPlanetId, String toPlanetId) {
        Client client = clientDao.findById(clientId);
        Planet fromPlanet = planetDao.findById(fromPlanetId);
        Planet toPlanet = planetDao.findById(toPlanetId);

        if (client == null || fromPlanet == null || toPlanet == null) {
            throw new IllegalArgumentException("Client and planets must exist");
        }

        Ticket ticket = new Ticket(client, fromPlanet, toPlanet);
        ticketDao.save(ticket);
    }

    public Ticket getTicket(Long id) {
        return ticketDao.findById(id);
    }

    public List<Ticket> getAllTickets() {
        return ticketDao.findAll();
    }

    public void deleteTicket(Long id) {
        ticketDao.delete(id);
    }
}
