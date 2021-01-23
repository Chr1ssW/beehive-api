package org.Beehive.services;

import org.Beehive.repositories.UserRepository;
import org.Beehive.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public User getUser(int userID)
    {
        return userRepository.findByUserID(userID);
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public void updateUser(User user)
    {
        userRepository.save(user);
    }

    public void deleteUser(int userID)
    {
        userRepository.delete(userID);
    }
}
