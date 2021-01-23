package org.Beehive.repositories;

import org.Beehive.tables.BeehiveData;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BeehiveDataRepository extends PagingAndSortingRepository<BeehiveData, Integer>
{
    BeehiveData findByDataId(int dataId);

    @Override
    List<BeehiveData> findAll();
}
