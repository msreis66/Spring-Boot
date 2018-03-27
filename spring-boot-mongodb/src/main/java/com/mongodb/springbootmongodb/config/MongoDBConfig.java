package com.mongodb.springbootmongodb.config;

import com.mongodb.springbootmongodb.document.Users;
import com.mongodb.springbootmongodb.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return strings -> {
            usersRepository.save(new Users(1, "Peter", "Development", 3000L));
            usersRepository.save(new Users(2, "Sam", "Operations", 2000L));
        };
    }
}
