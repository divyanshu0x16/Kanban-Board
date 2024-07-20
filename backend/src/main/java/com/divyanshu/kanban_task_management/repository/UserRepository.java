package com.divyanshu.kanban_task_management.repository;

import com.divyanshu.kanban_task_management.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
