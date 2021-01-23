package org.Beehive.services;

import org.Beehive.repositories.BeehiveRepository;
import org.Beehive.tables.Beehive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeehiveService
{
    @Autowired
    BeehiveRepository beehiveRepository;

    public Beehive createBeehive(Beehive beehive) {
        return beehiveRepository.save(beehive);
    }

    public Beehive getBeehive(String sensorID) {
        return beehiveRepository.findBySensorId(sensorID);
    }

    public List<Beehive> getBeehives()
    {
        return beehiveRepository.findAll();
    }
}
