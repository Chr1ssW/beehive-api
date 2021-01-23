package org.Beehive.repositories;

import org.Beehive.tables.Beehive;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BeehiveRepository extends PagingAndSortingRepository<Beehive, Integer>
{
    Beehive findBySensorID(String sensorID);

    @Override
    List<Beehive> findAll();
}
