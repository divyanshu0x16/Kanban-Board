package com.divyanshu.kanban_task_management.service;

import com.divyanshu.kanban_task_management.model.User;
import com.divyanshu.kanban_task_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(String id){
        return userRepository.findById(id);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
