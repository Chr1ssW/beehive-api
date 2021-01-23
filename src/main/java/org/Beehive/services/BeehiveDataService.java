package org.Beehive.services;

import org.Beehive.repositories.BeehiveDataRepository;
import org.Beehive.tables.Beehive;
import org.Beehive.tables.BeehiveData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeehiveDataService
{
    @Autowired
    BeehiveDataRepository beehiveDataRepository;

    public BeehiveData createBeehiveData(BeehiveData beehiveData)
    {
        return beehiveDataRepository.save(beehiveData);
    }

    public BeehiveData getBeehiveData(int dataId)
    {
        return beehiveDataRepository.findByDataId(dataId);
    }

    public List<BeehiveData> getBeehiveData()
    {
        return beehiveDataRepository.findAll();
    }
}
