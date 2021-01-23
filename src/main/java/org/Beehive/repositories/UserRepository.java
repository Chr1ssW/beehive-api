package org.Beehive.repositories;

import org.Beehive.tables.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Integer>
{
    User findByUserId(int userID);

    @Override
    List<User> findAll();
}
