package com.mongodb.springbootmongodb.repository;

import com.mongodb.springbootmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
}
