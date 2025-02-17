package org.example.service;

import org.example.dao.impl.PlanetDaoImpl;
import org.example.model.Planet;

public class PlanetCrudService {
    private final PlanetDaoImpl planetDao = new PlanetDaoImpl();

    public void createPlanet(String id, String name) {
        planetDao.save(new Planet(id, name));
    }

    public Planet getPlanet(String id) {
        return planetDao.findById(id);
    }
}
